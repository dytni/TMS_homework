package Lesson_8;

import java.util.Random;

public class Vector3 {
    int x;
    int y;
    int z;
    final String info = " This is tree-dimensional vector";

    Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double vectorLen() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    int vectorScalar(Vector3 vector3) throws IllegalArgumentException {
        if (vector3 == null) {
            throw new IllegalArgumentException("Error argument");
        }
        return x * vector3.x + y * vector3.y + z * vector3.z;
    }

    Vector3 vectorSum(Vector3 vector3) throws IllegalArgumentException {
        if (vector3 == null) {
            throw new IllegalArgumentException("Error argument");
        }
        return new Vector3(x + vector3.x,
                y + vector3.y, z + vector3.z);
    }

    Vector3 vectorDiff(Vector3 vector3) throws IllegalArgumentException {
        if (vector3 == null) {
            throw new IllegalArgumentException("Error operator");
        }
        return new Vector3(x - vector3.x, y - vector3.y, z - vector3.z);
    }

    static Vector3[] vector3s(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Error operator");
        }
        Random random = new Random();
        Vector3[] vector3s = new Vector3[n];
        for (int i = 0; i < n; i++) {
            vector3s[i] = new Vector3(random.nextInt(16), random.nextInt(16), random.nextInt(16));
        }
        return vector3s;
    }

    Boolean vectorIsLonger(Vector3 vector3) throws IllegalArgumentException {
        if (vector3 == null) {
            throw new IllegalArgumentException("Error operator");
        }
        return this.vectorLen() < vector3.vectorLen();
    }

    void vectorShowInfo() {
        System.out.println(info);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
