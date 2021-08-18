package homework.lab1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxSuperIntegerList implements SuperIntegerList {
    int DEFAULT_LEN = 16;
    int[] lst;
    int currLen = 0;

    public MaxSuperIntegerList() {
        lst = new int[DEFAULT_LEN];
    }

    @Override
    public void add(int number) {
        if (currLen > DEFAULT_LEN) {
            lst = Arrays.copyOf(lst, currLen * 2);
            DEFAULT_LEN *= 2;
        }
        lst[currLen++] = number;
    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0 || index >= lst.length) {
            return;
        }

        lst = IntStream.range(0, lst.length)
                .filter(i -> i != index)
                .map(i -> lst[i])
                .toArray();
        currLen--;
    }

    @Override
    public void removeByValue(int value) {
        int count = IntStream.range(0, lst.length)
                .filter(i -> lst[i] == value)
                .map(i -> lst[i])
                .toArray().length;
        lst = IntStream.range(0, lst.length)
                .filter(i -> lst[i] != value)
                .map(i -> lst[i])
                .toArray();
        currLen -= count;
    }

    @Override
    public int get(int index) {

        if (index >= this.lst.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }

        return this.lst[index];
    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(this.lst));
    }
}