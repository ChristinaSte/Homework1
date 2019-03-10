package homework11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report {

    private Report() {
    }

    public static void timeInterval(List<TimeActivity> timeActivitysList, Path path) {
        int day = 0;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile( )))) {
            for (int i = 0; i < timeActivitysList.size( ) - 1; i++) {
                if (timeActivitysList.get(i).getDay( ) != day) {
                    day++;
                    bufferedWriter.write("DAY - " + day + System.lineSeparator());
                }
                if (timeActivitysList.get(i + 1).getDay( ) == day) {
                    timeActivitysList.get(i).setEndTime(timeActivitysList.get(i + 1).getStartTime( ));
                    bufferedWriter.write(timeActivitysList.get(i).getStartTime( ) + "-"
                            + timeActivitysList.get(i + 1).getStartTime( ) + " " + timeActivitysList.get(i).getActivity( ) + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }

    public static void totalTime(List<TimeActivity> timeActivitiesList, Path path) {
        HashMap<String, Long> lecture = new HashMap<>( );
        long timeBreak = 0;
        long timeLecture = 0;
        long timeExample = 0;
        long totalTime = 0;
        for (TimeActivity timeAct : timeActivitiesList) {
            if (timeAct.getActivity( ).toLowerCase( ).contains("перерыв") || timeAct.getActivity( ).toLowerCase( ).contains("обеденный")) {
                timeBreak = timeBreak + timeAct.differenceTime( ); //Знаю, что стрёмно, грамоздко и некрасиво. Всё это вынесу в константы
                totalTime = totalTime + timeAct.differenceTime( );
            } else if (timeAct.getActivity( ).toLowerCase( ).contains("упражнени") || timeAct.getActivity( ).toLowerCase( ).contains("решения")) {
                timeExample = timeExample + timeAct.differenceTime( );
                totalTime = totalTime + timeAct.differenceTime( );
            } else if (!timeAct.getActivity( ).toLowerCase( ).contains("конец")) {
                timeLecture = timeLecture + timeAct.differenceTime( );
                totalTime = totalTime + timeAct.differenceTime( );
                if (lecture.containsKey(timeAct.getActivity( ))) {
                    lecture.put(timeAct.getActivity( ), lecture.get(timeAct.getActivity( )) + timeAct.differenceTime( ));
                } else {
                    lecture.put(timeAct.getActivity( ), timeAct.differenceTime( ));
                }
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile( )))) {
            bufferedWriter.write("Время занятий: " + totalTime + " минут" + System.lineSeparator());
            bufferedWriter.write("Время перерывов: " + timeBreak + " минут, " + String.format("%.2f", percent(timeBreak, totalTime)) + "%" + System.lineSeparator());
            bufferedWriter.write("Время лекций: " + timeLecture + " минут, " + String.format("%.2f", percent(timeLecture, totalTime)) + "%" + System.lineSeparator());
            bufferedWriter.write("Время решений: " + timeExample + " минут, " + String.format("%.2f", percent(timeExample, totalTime)) + "%" + System.lineSeparator());
            bufferedWriter.write(System.lineSeparator() + "Лекции:" + System.lineSeparator());
            for (Map.Entry<String, Long> entry : lecture.entrySet( )) {
                bufferedWriter.write(entry.getKey( ) + ", " + entry.getValue( ) + " минут, " + String.format("%.2f", percent(entry.getValue( ), timeLecture)) + "%" + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }

    public static double percent(double time, double totalTime) {
        return time / (totalTime / 100);
    }
}
