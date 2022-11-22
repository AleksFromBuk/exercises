package ru.job4j.arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int size  = array.length;
        for(int i = 0; i < column; i++) {
            array[row][i] = array[row][i + 1];
        }
        for(int i = size - 1; i >= column; i--) {
            array[row][i] = array[row][i - 1];
        }
        for(int i = 0; i < row; i++) {
            array[i][column] = array[i + 1][column];
        }
        for(int i = size - 1; i > row; i--) {
            array[i][column] = array[i - 1][column];
        }
        array[row][column] = 0;
    }

    public static void main(String[] args) {
        int [][] array = {
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55 }
        };
        push(array, 2, 2);
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}