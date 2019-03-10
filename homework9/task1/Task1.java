package homework9.task1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Path readOutFile = Paths.get("src", "homework9", "task1", "poem.txt");
        Path writeInFile = Paths.get("src", "homework9", "task1", "poem.txt");
        Map<Character, Integer> map = CountingChars.numberOfLetters(readOutFile);
        CountingChars.writeMapInFile(map, writeInFile);
    }
}