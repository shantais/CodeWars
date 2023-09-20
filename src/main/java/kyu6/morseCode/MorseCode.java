package kyu6.morseCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MorseCode {
    private static String decodeLetter(String encodedLetter){
        Path path = Paths.get("src", "main", "java", "kyu6", "morseCode", "MorseCode.txt");
        String decodedLetter = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                if (encodedLetter.equals(line.split("\\|")[1])){
                    decodedLetter = line.split("\\|")[0];
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return decodedLetter;
    }

    public static String get(String encodedLetter){
        return decodeLetter(encodedLetter);
    }
}
