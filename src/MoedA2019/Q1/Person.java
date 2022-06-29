package MoedA2019.Q1;

public class Person {
    protected String name;
    protected int id;

    public Person(String n, int id) {
        name = n;
        this.id = id;
    }

    public Person(Person p) {
        this(p.name, 456);
        System.out.println("Person(p=" + p +")");
    }

    public String toString() {
        return "{id=" + id + ",name=" + name + "}";
    }

    public boolean equals(Object obj) {
        System.out.println("Person.Equals(obj=" + obj +")");
        if (! obj.getClass().equals(Person.class) ) return false;
        Person p = (Person)obj;
        return p.name.toLowerCase().equals(name.toLowerCase());
    }
}

