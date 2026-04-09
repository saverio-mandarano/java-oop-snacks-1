package org.lessons.java.oop.snacks;

public class StudentRegistry {
    private Student[] registry;

    public StudentRegistry() {
        this.registry = new Student[0];
    }

    public Student[] getRegistry() {
        return registry;
    }

    public void setRegistry(Student[] registry) {
        this.registry = registry;
    }

    public void addStudent(Student student) {
        // creo un nuovo registro lungo come quello di prima +1
        Student[] newRegistry = new Student[this.registry.length + 1];

        // copio il vecchio registro nel nuovo, studente per studente
        for (int i = 0; i < registry.length; i++) {
            newRegistry[i] = this.registry[i];
        }

        // aggiungo alla fine dell'array l'ultimo studente
        newRegistry[newRegistry.length - 1] = student;

        // sovrascrivo il vecchio registro con quello nuovo
        this.registry = newRegistry;
    }

    public void printStudents() {
        System.out.println("stampo lista studenti senza helper");
        for (Student s : this.registry) {
            System.out.println(s.getStudentInfo());
        }
    }

    @Override
    public String toString() {
        String output = "Registro studenti: ";
        for (Student student : this.registry) {
            output += String.format(" %s;", student.getStudentInfo());
        }
        return output;
    }
}
