package T6.materials_grp1;

import javax.management.InstanceNotFoundException;

public class Calc {
    public int x,y;

    public Calc(){
        x = 0;
        y = 0;
    }

    public Calc(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double plus(){
        return x+y;
    }

    public double minus(){
        return x+y;
    }

    public double mul(){
        return x*y;
    }

    public double div(){
        try{
            return x/y;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Can not divide by zero");
        }
        return Integer.MIN_VALUE;
    }
}
