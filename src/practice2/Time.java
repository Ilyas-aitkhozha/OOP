package practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second) {
        if (hour < 0  || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("Invalid");
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandard() {
        int stdHour = hour % 12;
        if (stdHour == 0) {


            stdHour = 12;
        }
        String period = (hour < 12) ? "AM":"PM";
        return String.format("%02d:%02d:%02d %s", stdHour, minute, second, period);
    }

    public void add(Time smth){
        this.second += smth.second;
        this.minute += smth.minute;
        this.hour += smth.hour;
        if (this.second >= 60) {
            this.minute += this.second/60;
            this.second %=60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
        this.hour %= 24;
    }
}
