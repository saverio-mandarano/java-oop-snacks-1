package org.lessons.java.oop.snacks;

public class Array {
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void moveZeroToTheEnd() {
        // System.out.println("sono entrato in moveToTheEnd");
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    @Override
    public String toString() {
        String output = "Array: ";
        for (int num : this.arr) {
            output += String.format(" %s;", num);
        }
        return output;
    }
}
