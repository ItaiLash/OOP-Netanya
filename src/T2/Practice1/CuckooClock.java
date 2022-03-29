package T2.Practice1;

public class CuckooClock extends Clock{
    private String halfHourCukoo;
    private String hourCukoo;

    public CuckooClock(int h, int m, String halfHour, String hour){
        super(h,m);
        this.halfHourCukoo = halfHour;
        this.hourCukoo = hour;
    }

    public void setHalfHourCukoo(String halfHour) {
        this.halfHourCukoo = halfHour;
    }

    public void setHourCukoo(String hour) {
        this.hourCukoo = hour;
    }

    @Override
    public void tick() {
        super.tick();
        int times = 0;
        if(super.minutes == 0 && super.seconds == 0){
            times = super.hours < 12 ? super.hours : super.hours-12;
            for(int i = 0 ; i < times ; i++){
                System.out.println(this.hourCukoo);
            }
        }
        else if(super.minutes == 30 && super.seconds == 0){
            System.out.println(this.halfHourCukoo);
        }
    }

    @Override
    public void showTime() {
        System.out.println("CuckooClock!");
        super.showTime();
    }
}
