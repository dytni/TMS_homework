package Lesson_8;

import java.util.Random;

public class VectorArray {
    int[] coordinates;

    VectorArray(int[] array) {
        coordinates = array;
    }

    double vectorLen() {
        int sum = 0;
        for (int coordinate : this.coordinates) {
            sum += coordinate * coordinate;
        }
        return Math.sqrt(sum);
    }

    int vectorScalar(VectorArray vectorArray) throws IllegalArgumentException {
        if (vectorArray == null || vectorArray.coordinates.length != this.coordinates.length) {
            throw new IllegalArgumentException("Error argument");
        }
        int sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += coordinates[i] * vectorArray.coordinates[i];
        }
        return sum;
    }

    VectorArray vectorArrSum(VectorArray vectorArray) throws IllegalArgumentException {
        if (vectorArray == null || vectorArray.coordinates.length != this.coordinates.length) {
            throw new IllegalArgumentException("Error argument");
        }
        int[] sum = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            sum[i] = coordinates[i] + vectorArray.coordinates[i];
        }
        return new VectorArray(sum);
    }

    VectorArray vectorDiff(VectorArray vectorArray) throws IllegalArgumentException {
        if (vectorArray == null || vectorArray.coordinates.length != this.coordinates.length) {
            throw new IllegalArgumentException("Error operator");
        }
        int[] dif = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            dif[i] = coordinates[i] - vectorArray.coordinates[i];
        }
        return new VectorArray(dif);
    }

    static VectorArray[] vectorArray(int n, int coordinatesAmount) throws IllegalArgumentException {
        if (n < 0 || coordinatesAmount < 0) {
            throw new IllegalArgumentException("Error operator");
        }
        Random random = new Random();
        VectorArray[] vectorArr = new VectorArray[n];
        for (int i = 0; i < n; i++) {
            int[] newCoordinates = new int[coordinatesAmount];
            for (int j = 0; j < coordinatesAmount; j++) {
                newCoordinates[j] = random.nextInt(16);
            }
            vectorArr[i] = new VectorArray(newCoordinates);
        }
        return vectorArr;
    }

    Boolean vectorIsLonger(VectorArray vectorArray) throws IllegalArgumentException {
        if (vectorArray == null || vectorArray.coordinates.length != this.coordinates.length) {
            throw new IllegalArgumentException("Error operator");
        }
        return this.vectorLen() < vectorArray.vectorLen();
    }

    void vectorShowInfo() {
        System.out.println("This is " + coordinates.length + "-dimensional vector");
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println("Coordinate " + (i + 1) + " = " + coordinates[i]);
        }
    }
}
