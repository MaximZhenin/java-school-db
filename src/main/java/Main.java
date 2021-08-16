import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SuperIntegerList superIntegerList = new MaxSuperIntegerList();

        superIntegerList.add(1);
        superIntegerList.add(2);
        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.add(3);
        superIntegerList.add(3);

        superIntegerList.printAll();
        System.out.println(((MaxSuperIntegerList) superIntegerList).currLen);
        superIntegerList.removeByValue(2);
        superIntegerList.printAll();
        System.out.println(((MaxSuperIntegerList) superIntegerList).currLen);
        superIntegerList.add(4);
        superIntegerList.add(4);
        superIntegerList.add(4);
        superIntegerList.add(4);
        superIntegerList.removeByIndex(0);
        superIntegerList.printAll();

        System.out.println(superIntegerList.get(0));
    }
}