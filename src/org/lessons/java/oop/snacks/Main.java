package org.lessons.java.oop.snacks;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("harry", "potter", 20);

        System.out.println(harry.getStudentInfo());

        harry.setName("saverio");
        // System.out.println(harry.getName());
        harry.setSurname("mandarano");
        // System.out.println(harry.getSurname());
        harry.setAge(26);
        // System.out.println(harry.getAge());
        System.out.println(harry.getStudentInfo());
    }
}
