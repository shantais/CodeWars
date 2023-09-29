package kyu7;

public class RunningOutOfSpace {
    public static String[] spacey(String[] array) {
        for (int i=1; i< array.length; i++){
            array[i] = array[i-1]+array[i];
        }
        return array;
    }
}
