package fr.ynov.java.java.medium;

public class Quality {
    private int id;
    private String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o instanceof Quality) {
            Quality q = (Quality) o;
            return id == q.id && name.equals(q.name);
        }
        return false;
    }

public static void main (String[] args) {

        Quality q1 = new Quality(1, "Male");
        Quality q2 = new Quality(1, "Male");
        System.out.println(q1 == q2);
        System.out.println(q1.equals(q2));
}
}