package Leson_4;

/*Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
B(Black) или W(White).*/
public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((j+i) % 2 == 0) {
                    arr[i][j] = "w";
                } else arr[i][j] = "b";
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
