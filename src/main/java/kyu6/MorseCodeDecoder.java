package kyu6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * In this kata you have to write a simple Morse code decoder.
 * While the Morse code is now mostly superseded by voice and digital
 * data communication channels, it still has its use in some applications around the world.
 *
 * The Morse code encodes every character as a sequence of "dots" and "dashes".
 * For example, the letter A is coded as ·−, letter Q is coded as −−·−,
 * and digit 1 is coded as ·−−−−. The Morse code is case-insensitive,
 * traditionally capital letters are used. When the message is written in Morse code,
 * a single space is used to separate the character codes and 3 spaces are used to separate words.
 * For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
 *
 * NOTE: Extra spaces before or after the code have no meaning and should be ignored.
 *
 * In addition to letters, digits and some punctuation, there are some special service codes,
 * the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
 * that is coded as ···−−−···. These special codes are treated as single special characters,
 * and usually are transmitted as separate words.
 *
 * Your task is to implement a function that would take the morse code as input and
 * return a decoded human-readable string.
 *
 * For example:
 *
 * MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
 * //should return "HEY JUDE"
 *
 * NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
 *
 * The Morse code table is preloaded for you as a dictionary, feel free to use it:
 *
 * All the test strings would contain valid Morse code,
 * so you may skip checking for errors and exceptions.
 * In C#, tests will fail if the solution code throws an exception,
 * please keep that in mind. This is mostly because otherwise the
 * engine would simply ignore the tests, resulting in a "valid" solution.
 */

public class MorseCodeDecoder {
//    private static Path path = Paths.get("src", "main", "java", "kyu6", "MorseCode.txt");

//    private static String getFileGutsByLine(Path path) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                return line;
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//    }

    public static String decode(String morseCode) {
        List<String> morseLetters = new LinkedList<>(List.of(morseCode.split(" ")));
        return morseLetters.toString();
    }

    public static String getLine(Path path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            return reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return "Błąd odczytu";
        }
    }
}
