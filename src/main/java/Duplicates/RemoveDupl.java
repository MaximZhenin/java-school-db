package Duplicates;

import java.util.List;

public class RemoveDupl {
    public static <T> int countDuplicates(T template, List<T> collection) {
        int count = 0;
        for (T element : collection) {
            if (template.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
