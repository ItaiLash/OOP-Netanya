package MoedA2021.Q1;

import java.util.Objects;

public class NamedException extends Exception{
    private String name;
    private int num;

    public NamedException(String name, int num, String message){
        super(message);
        this.name = name;
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamedException that = (NamedException) o;
        return num == that.num || this.name.equals(that.name);
    }
    @Override
    public String getMessage() {
        return super.getMessage() + " (throwen by " + this.name + ",#" + this.num +")";
    }



}
