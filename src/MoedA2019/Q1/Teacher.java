package MoedA2019.Q1;


public class Teacher extends Person {

    protected String course;

    public Teacher() {
        super("Avi avinu", 1);
        System.out.println("Teacher()");
        course = "Programming B";
    }

    public String toString() {
        return "<" + super.toString() + ", course=" + course + ">";
    }

    public boolean equals(Object obj) {
        try {
            return ((Teacher)obj).id == id;
        }
        catch (RuntimeException e) {
            System.out.println("Balagan"); return false;
        }
    }
}

