package Lesson_12.Task2;

public class Main {
    public static void main(String[] args) {
        String[] mas = new String[]{"a", "b", "c"};
        Double[] mas2 = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        CustomArrayList<String> stringCustomArrayList;
        stringCustomArrayList = new CustomArrayList<>(mas);
        System.out.println(stringCustomArrayList.get(1));
        CustomArrayList<Double> doubleCustomArrayList = new CustomArrayList<>(mas2);
        System.out.println(doubleCustomArrayList.get(5));
    }
}
