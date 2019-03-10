package homework11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexpUtill {

    private RegexpUtill() {
    }

    public static void useRegexp(List<TimeActivity> timeActivitiesList, Path path) {
        int day = 1;
        String regexp = "(\\d{2}:\\d{2})\\s?([а-яА-Я\\s]+)";

        Pattern patern = Pattern.compile(regexp);

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path.toFile( ))))) {
            while (scanner.hasNextLine( )) {
                String line = scanner.nextLine( );
                String space = (" ");
                if (line.equals(space)) {
                    day++;
                    continue;
                } else {
                    Matcher matcher = patern.matcher(line);
                    matcher.find( );
                    timeActivitiesList.add(new TimeActivity(day, LocalTime.parse(matcher.group(1)), matcher.group(2)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }
}
