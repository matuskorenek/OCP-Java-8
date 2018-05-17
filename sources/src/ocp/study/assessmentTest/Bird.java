package ocp.study.assessmentTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Tail {}

public class Bird {
    private String name;
    private transient int age;
    private Tail tail;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Tail getTail() { return tail; }
    public void setTail(Tail tail) { this.tail = tail; }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))) {
            Bird bird = (Bird) is.readObject();
        }
    }
}
