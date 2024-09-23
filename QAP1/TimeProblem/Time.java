package QAP1.TimeProblem;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructors

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new Error("Invalid Hour. Must be between 0 and 23!");
        }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new Error("Invalid Minute. Must be between 0 and 59!");
        }
    }
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;

        } else {
            throw new Error("Invalid Second. Must be between 0 and 59!");
        }
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() {
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second--;
        if (second < 0){
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0){
                    hour = 23;
                }
            }
        }
        return this;
    }
}
