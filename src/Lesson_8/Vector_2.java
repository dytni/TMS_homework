package Lesson_8;

import java.util.Random;

public class Vector_2 {
    int x;
    int y;
    final String info =  " This is two-dimensional vector";

    Vector_2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double vector_len() {
        return Math.sqrt(x * x + y * y);
    }

    int vector_scalar(Vector_2 vector_2) {
        if (vector_2 == null) throw new IllegalArgumentException("Error argument");
        return x * vector_2.x + y * vector_2.y;
    }

    Vector_2 vector_sum(Vector_2 vector_2) {
        if (vector_2 == null) throw new IllegalArgumentException("Error argument");
        return new Vector_2(x + vector_2.x,
                y + vector_2.y);
    }

    Vector_2 vector_diff(Vector_2 vector_2) {
        if (vector_2 == null) throw new IllegalArgumentException("Error operator");
        return new Vector_2(x - vector_2.x, y - vector_2.y);
    }

    static Vector_2[]  vector_2s(int n) {
        if (n<0) throw new IllegalArgumentException("Error operator");
        Random random = new Random();
        Vector_2[] vector_2s = new Vector_2[n];
        for (int i = 0; i < n; i++) {
            vector_2s[i]=new Vector_2(random.nextInt(16), random.nextInt(16));
        }
        return vector_2s;
    }
    Boolean vector_is_longer(Vector_2 vector_2){
        if (vector_2 == null) throw new IllegalArgumentException("Error operator");
        return this.vector_len()<vector_2.vector_len();
    }
    void vector_show_info(){
        System.out.println(info);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
