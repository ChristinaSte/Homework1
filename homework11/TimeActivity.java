package homework11;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeActivity {

    private int day;
    private LocalTime startTime;
    private LocalTime endTime;
    private String activity;

    public TimeActivity(int day, LocalTime localTime, String activity) {
        this.day = day;
        this.startTime = localTime;
        this.activity = activity;
    }


    @Override
    public String toString() {
        return startTime + "-" + endTime + " " + activity;
    }

    public long differenceTime() {
        if (endTime == null) {
            return 0;
        } else {
            return startTime.until(endTime, ChronoUnit.MINUTES);
        }
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getDay() {
        return day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public String getActivity() {
        return activity;
    }
}