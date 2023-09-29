package kyu7;

public class RunningOutOfSpace {
    public static String[] spacey(String[] array) {
        String [] strings = new String[array.length];
        strings[0] = array[0];
        for (int i=1; i< array.length; i++){
            strings[i] = strings[i-1]+array[i];
        }
        return strings;
    }
}
