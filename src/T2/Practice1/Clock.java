package T2.Practice1;

public class Clock {
    protected int hours, minutes, seconds;

    public Clock() {
        this(0, 0);
    }

    public Clock(int h, int m) {
        hours = h;
        minutes = m;
        seconds = 0;
    }

    public void tick() {
        seconds = seconds + 1;
        minutes = minutes + seconds / 60;
        hours = hours + minutes / 60;
        seconds = seconds % 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

}
