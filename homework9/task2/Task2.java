package homework9.task2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        Path pathToFile = Paths.get("src", "homework9", "task2", "numbers.txt");
        List<Integer> list = FillingFile.generateIntegers( );
        FillingFile.writeListInFile(list, pathToFile);
        Set<Integer> sortedSet = FillingFile.sortIntegersInFile(pathToFile);
        FillingFile.writeListInFile(sortedSet, pathToFile);
    }
}