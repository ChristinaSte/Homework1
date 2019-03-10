package homework9.task1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public final class CountingChars {

    private CountingChars() {
    }

    public static Map<Character, Integer> numberOfLetters(Path path) {
        Map<Character, Integer> mapOfLetters = new TreeMap<>( );
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile( )))) {
            String currentValue = null;
            while ((currentValue = reader.readLine( )) != null) {
                for (char currentChar : currentValue.toLowerCase( ).toCharArray( )) {
                    if (mapOfLetters.containsKey(currentChar) && Character.isLetter(currentChar)) {
                        mapOfLetters.put(currentChar, mapOfLetters.get(currentChar) + 1);
                    } else if (Character.isLetter(currentChar)) {
                        mapOfLetters.put(currentChar, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
        return mapOfLetters;
    }

    public static void writeMapInFile(Map<Character, Integer> map, Path path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile( )))) {
            for (Map.Entry<Character, Integer> entry : map.entrySet( )) {
                writer.write(entry.getKey( ) + " - " + entry.getValue( ) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }
}

