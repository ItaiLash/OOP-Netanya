package T2.Practice1;

public class CuckooClockProgram {

    public static void twoHoursForward(CuckooClock cc){
        for(int i=0 ; i<7200 ; i++){
            cc.tick();
        }
    }

    public static void main(String[] args) {
        CuckooClock cc = new CuckooClock(17,59,"half koko!", "koko!");
        cc.showTime();
        twoHoursForward(cc);
        cc.showTime();

        cc.setHalfHourCukoo("tick");
        cc.setHourCukoo("tack");
        twoHoursForward(cc);
        cc.showTime();
    }
}
