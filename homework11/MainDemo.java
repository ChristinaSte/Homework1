package homework11;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainDemo {

    public static void main(String[] args) {
        Path pathToLogFile = Paths.get("src", "homework11", "log-file.txt");
        Path pathToTimeInterval = Paths.get("src", "homework11", "TimeInterval.txt");
        Path pathToTotalTime = Paths.get("src", "homework11", "TotalTime.txt");

        List<TimeActivity> timeActivitiesArray = new ArrayList<>( );

        RegexpUtill.useRegexp(timeActivitiesArray, pathToLogFile);
        Report.timeInterval(timeActivitiesArray, pathToTimeInterval);
        Report.totalTime(timeActivitiesArray, pathToTotalTime);
    }
}