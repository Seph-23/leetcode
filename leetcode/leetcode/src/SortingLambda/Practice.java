package SortingLambda;

import java.util.Arrays;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};

        System.out.println(Arrays.toString(months)); //printing before

        /**
         * 다 똑같은거임 sorting algorithm
         */
        Arrays.sort(months, Comparator.comparingInt(String::length));
        Arrays.sort(months, (a, b) -> a.length() - b.length());
        Arrays.sort(months,
                (String a, String b) -> { return Integer.signum(a.length() - b.length()); }
        );

        System.out.println(Arrays.toString(months));
    }
}
