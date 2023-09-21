package Lesson_8;

import java.util.Random;

public class Vector_3 {
    int x;
    int y;
    int z;
    final String info = " This is tree-dimensional vector";

    Vector_3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double vector_len() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    int vector_scalar(Vector_3 vector_3) {
        if (vector_3 == null) throw new IllegalArgumentException("Error argument");
        return x * vector_3.x + y * vector_3.y + z * vector_3.z;
    }

    Vector_3 vector_sum(Vector_3 vector_3) {
        if (vector_3 == null) throw new IllegalArgumentException("Error argument");
        return new Vector_3(x + vector_3.x,
                y + vector_3.y, z + vector_3.z);
    }

    Vector_3 vector_diff(Vector_3 vector_3) {
        if (vector_3 == null) throw new IllegalArgumentException("Error operator");
        return new Vector_3(x - vector_3.x, y - vector_3.y, z - vector_3.z);
    }

    static Vector_3[] vector_3s(int n) {
        if (n < 0) throw new IllegalArgumentException("Error operator");
        Random random = new Random();
        Vector_3[] vector_3s = new Vector_3[n];
        for (int i = 0; i < n; i++) {
            vector_3s[i] = new Vector_3(random.nextInt(16), random.nextInt(16), random.nextInt(16));
        }
        return vector_3s;
    }

    Boolean vector_is_longer(Vector_3 vector_3) {
        if (vector_3 == null) throw new IllegalArgumentException("Error operator");
        return this.vector_len() < vector_3.vector_len();
    }

    void vector_show_info() {
        System.out.println(info);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
