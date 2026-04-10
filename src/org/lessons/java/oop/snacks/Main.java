package org.lessons.java.oop.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("harry", "potter", 20);
        Student ron = new Student("ron", "weasley", 20);

        Student[] bestStudents = new Student[2];
        bestStudents[0] = ron;
        bestStudents[1] = harry;

        StudentRegistry registry = new StudentRegistry();
        registry.setRegistry(bestStudents);

        // System.out.println(registry);

        // System.out.println("Stampo gli studenti con getRegistry:");
        // for (Student s : registry.getRegistry()) {
        // System.out.println(s.getStudentInfo());
        // }

        // registry.addStudent(new Student("saverio", "mandarano", 26));
        // registry.printStudents();

        // System.out.println(harry.getStudentInfo());

        // harry.setName("saverio");
        // System.out.println(harry.getName());
        // harry.setSurname("mandarano");
        // System.out.println(harry.getSurname());
        // harry.setAge(26);
        // System.out.println(harry.getAge());
        // System.out.println(harry.getStudentInfo());

        // BankAccount saverio = new BankAccount(7287412);

        // System.err.println(saverio.getAccountNumber());
        // System.err.println(saverio.getBalance());

        // saverio.deposit(new BigDecimal("19.99"));
        // System.err.println(saverio.getBalance());
        // saverio.withdraw(new BigDecimal("2"));
        // System.err.println(saverio.getBalance());

        // BankAccount pasquale = new BankAccount();
        // System.err.println(pasquale.getAccountNumber());

        // snack-array
        int[] arrayEsercizio = new int[] { 0, 1, 2, 0, 3, 4, 0, 5, 6, 7, 0, 0, 8, 9 };

        Array arr1 = new Array(arrayEsercizio);
        System.out.println(arr1);
        arr1.moveZeroToTheEnd();
        System.out.println(arr1);
    }
}
