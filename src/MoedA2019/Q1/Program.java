package MoedA2019.Q1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        Teacher t = new Teacher();
        people.add(t);
        people.add(new Person(t));
        people.add(t);
        Person q = new Person( "AVI AVINU" , 999);
        for(Object o : people) System.out.println( o.equals(q) );
    }
}
