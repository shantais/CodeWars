package kyu6;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a simple parser that will parse and run Deadfish.
 * Deadfish has 4 commands, each 1 character long:
 *     i increments the value (initially 0)
 *     d decrements the value
 *     s squares the value
 *     o outputs the value into the return array
 * Invalid characters should be ignored.
 */

public class DeadfishParser {
    public static int[] parse(String data) {
        List <Integer> results = new LinkedList<>();
        char [] instructionArray = data.toCharArray();
        int value = 0;
        for (char instruction : instructionArray){
            switch (instruction){
                case 'i':
                    value += 1;
                    break;
                case 'd':
                    value -= 1;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    results.add(value);
                    break;
                default:
                    break;
            }
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
