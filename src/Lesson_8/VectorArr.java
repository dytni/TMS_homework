package Lesson_8;

import java.util.Random;

public class VectorArr {
    int[] coordinates;

    VectorArr(int[] arr) {
        coordinates = arr;
    }

    double vectorLen() {
        int sum = 0;
        for (int coordinate : this.coordinates) {
            sum += coordinate * coordinate;
        }
        return Math.sqrt(sum);
    }

    int vectorScalar(VectorArr vectorArr) {
        if (vectorArr == null || vectorArr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error argument");
        int sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += coordinates[i] * vectorArr.coordinates[i];
        }
        return sum;
    }

    VectorArr vectorArrSum(VectorArr vectorArr) {
        if (vectorArr == null || vectorArr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error argument");
        int[] sum = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            sum[i] = coordinates[i] + vectorArr.coordinates[i];
        }
        return new VectorArr(sum);
    }

    VectorArr vectorDiff(VectorArr vectorArr) {
        if (vectorArr == null || vectorArr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error operator");
        int[] dif = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            dif[i] = coordinates[i] - vectorArr.coordinates[i];
        }
        return new VectorArr(dif);
    }

    static VectorArr[] vectorArr(int n, int coordinatesAmount) {
        if (n < 0 || coordinatesAmount < 0) throw new IllegalArgumentException("Error operator");
        Random random = new Random();
        VectorArr[] vectorArr = new VectorArr[n];
        for (int i = 0; i < n; i++) {
            int[] newCoordinates = new int[coordinatesAmount];
            for (int j = 0; j < coordinatesAmount; j++) {
                newCoordinates[j] = random.nextInt(16);
            }
            vectorArr[i] = new VectorArr(newCoordinates);
        }
        return vectorArr;
    }

    Boolean vectorIsLonger(VectorArr vectorArr) {
        if (vectorArr == null || vectorArr.coordinates.length != this.coordinates.length)
            throw new IllegalArgumentException("Error operator");
        return this.vectorLen() < vectorArr.vectorLen();
    }

    void vectorShowInfo() {
        System.out.println("This is " + coordinates.length +"-dimensional vector");
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println("Coordinate " + (i+1) + " = " + coordinates[i]);
        }
    }
}
