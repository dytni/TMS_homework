package Leson_3;

import java.util.Random;

/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
*/
public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int averArr1 = 0;
        int averArr2 = 0;
        Random random = new Random();
        System.out.print(" Array 1: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = random.nextInt(51);
            arr2[i] = random.nextInt(51);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print(" Array 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
            averArr1 = averArr1 + arr1[i] / 5;
            averArr2 = averArr2 + arr2[i] / 5;
        }
        System.out.println();
        if (averArr1 > averArr2) {
            System.out.print("average array 1 > array2: " + averArr1 + " > " + averArr2);
        } else if (averArr1 < averArr2) {
            System.out.print("average array 1 < array2: " + averArr1 + " < " + averArr2);
        } else {
            System.out.print("average array 1 = array2: " + averArr1 + " = " + averArr2);
        }

    }
}
