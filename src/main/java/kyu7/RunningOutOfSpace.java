package kyu7;

import java.util.Arrays;

public class RunningOutOfSpace {
    public static String[] spacey(String[] array) {
        for (int i=1; i< array.length; i++){
            array[i] = array[i-1]+array[i];
        }
        return array;
    }

    public static String[] spacey2(String[] array) {
        StringBuilder strBuilder = new StringBuilder();
        return Arrays.stream(array).map(str -> strBuilder.append(str).toString()).toArray(String[]::new);
    }
}
