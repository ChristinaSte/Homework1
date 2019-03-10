package homework9.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.io.DataInputStream;
import java.io.FileInputStream;

public final class FillingFile {

    private static final int LIST_LENGTH = 20;
    private static final int RANGE_OF_VALUES = 200;

    private FillingFile() {
    }

    public static List<Integer> generateIntegers() {
        List<Integer> listOfRandomIntegers = new ArrayList<>( );
        Random random = new Random( );
        for (int i = 0; i < LIST_LENGTH; i++) {
            listOfRandomIntegers.add(random.nextInt(RANGE_OF_VALUES));
        }
        return listOfRandomIntegers;
    }

    public static void writeListInFile(Collection<Integer> values, Path path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile( )))) {
            for (Integer e : values) {
                writer.append(e.toString( ));
                writer.newLine( );
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }

    public static Set<Integer> sortIntegersInFile(Path path) {
        Set<Integer> sortedSetFromFile = new TreeSet<>( );
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(path.toFile( )))) {
            String currentValue = null;
            while ((currentValue = dataInput.readLine( )) != null) {
                sortedSetFromFile.add(Integer.parseInt(currentValue));
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
        return sortedSetFromFile;
    }
}