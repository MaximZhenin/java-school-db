package homework.blackfriday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {
        Stream.iterate(LocalDate.of(startYear, 1, 1), t -> t.getYear() <= endYear, t -> t.plusDays(1))
                .filter(t -> t.getDayOfMonth() == 13)
                .filter(t -> t.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(t -> t.getYear(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((t, t1) -> (int) (t1.getValue() - t.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
        //todo do that!!!!!

//        IntStream.range(startYear,endYear)

//        Stream.iterate(startDate,date ->date.plusDay() )

//        Stream.generate()

        // 1972 - 3
        // 1984 - 3
        // 1986 - 3
        // 1902 - 3
        // 1901 - 2
        // 1917 - 2
        // 1915 - 2
        // 1911 - 1
    }
    public static void main(String[] args) {
        printBlackFridayPerYearSorted(2010, 2021);
    }
}
