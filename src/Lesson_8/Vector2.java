package Lesson_8;

import java.util.Random;

public class Vector2 {
    int x;
    int y;
    final String info =  " This is two-dimensional vector";

    Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double vectorLen() {
        return Math.sqrt(x * x + y * y);
    }

    int vectorScalar(Vector2 vector2) {
        if (vector2 == null) throw new IllegalArgumentException("Error argument");
        return x * vector2.x + y * vector2.y;
    }

    Vector2 vectorSum(Vector2 vector2) {
        if (vector2 == null) throw new IllegalArgumentException("Error argument");
        return new Vector2(x + vector2.x,
                y + vector2.y);
    }

    Vector2 vectorDiff(Vector2 vector2) {
        if (vector2 == null) throw new IllegalArgumentException("Error operator");
        return new Vector2(x - vector2.x, y - vector2.y);
    }

    static Vector2[] vector2s(int n) {
        if (n<0) throw new IllegalArgumentException("Error operator");
        Random random = new Random();
        Vector2[] vector2s = new Vector2[n];
        for (int i = 0; i < n; i++) {
            vector2s[i]=new Vector2(random.nextInt(16), random.nextInt(16));
        }
        return vector2s;
    }
    Boolean vectorIsLonger(Vector2 vector2){
        if (vector2 == null) throw new IllegalArgumentException("Error operator");
        return this.vectorLen()< vector2.vectorLen();
    }
    void vectorShowInfo(){
        System.out.println(info);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
