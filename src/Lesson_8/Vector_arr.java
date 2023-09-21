package Lesson_8;

import java.util.Random;

public class Vector_arr {
    int[] coordinates;

    Vector_arr(int[] arr) {
        coordinates = arr;
    }

    double vector_len() {
        int sum = 0;
        for (int coordinate : this.coordinates) {
            sum += coordinate * coordinate;
        }
        return Math.sqrt(sum);
    }

    int vector_scalar(Vector_arr vector_arr) {
        if (vector_arr == null || vector_arr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error argument");
        int sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += coordinates[i] * vector_arr.coordinates[i];
        }
        return sum;
    }

    Vector_arr vector_sum(Vector_arr vector_arr) {
        if (vector_arr == null || vector_arr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error argument");
        int[] sum = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            sum[i] = coordinates[i] + vector_arr.coordinates[i];
        }
        return new Vector_arr(sum);
    }

    Vector_arr vector_diff(Vector_arr vector_arr) {
        if (vector_arr == null || vector_arr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error operator");
        int[] dif = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            dif[i] = coordinates[i] - vector_arr.coordinates[i];
        }
        return new Vector_arr(dif);
    }

    static Vector_arr[] vector_arr_s(int n, int coordinates_amount) {
        if (n < 0 || coordinates_amount < 0) throw new IllegalArgumentException("Error operator");
        Random random = new Random();
        Vector_arr[] vector_arr_s = new Vector_arr[n];
        for (int i = 0; i < n; i++) {
            int[] new_coordinates = new int[coordinates_amount];
            for (int j = 0; j < coordinates_amount; j++) {
                new_coordinates[j] = random.nextInt(16);
            }
            vector_arr_s[i] = new Vector_arr(new_coordinates);
        }
        return vector_arr_s;
    }

    Boolean vector_is_longer(Vector_arr vector_arr) {
        if (vector_arr == null || vector_arr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error operator");
        return this.vector_len() < vector_arr.vector_len();
    }

    void vector_show_info() {
        System.out.println("This is " + coordinates.length +"-dimensional vector");
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println("Coordinate " + (i+1) + " = " + coordinates[i]);
        }
    }
}
