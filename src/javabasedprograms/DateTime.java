package javabasedprograms;

import java.time.LocalDate;
import java.time.LocalDateTime;

/***
 * A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
 *
 * Constraints
 *
 * Output Format
 *
 * Output the correct day in capital letters.
 *
 * Sample Input
 *
 * 08 05 2015
 * Sample Output
 *
 * WEDNESDAY
 */
public class DateTime {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        int mm = 9;
        int yyyy = 2019;
        int dd = 05;
        System.out.println(findDay(mm, dd, yyyy));

    }

}
