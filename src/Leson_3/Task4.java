package Leson_3;

import java.util.Random;

/*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
*/
public class Task4 {
    public static void main(String[] args) {
        int[] arr_1 = new int[5];
        int[] arr_2 = new int[5];
        int aver_arr_1 = 0;
        int aver_arr_2 = 0;
        Random random = new Random();
        System.out.print(" Array 1: ");
        for (int i = 0, randomNum; i < 5; i++) {
            randomNum = random.nextInt(51);
            arr_1[i] = randomNum;
            randomNum = random.nextInt(51);
            arr_2[i] = randomNum;
            System.out.print(arr_1[i] + " ");
        }
        System.out.println();
        System.out.print(" Array 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr_2[i] + " ");
            aver_arr_1=aver_arr_1 + arr_1[i]/5;
            aver_arr_2=aver_arr_2 + arr_2[i]/5;
        }
        System.out.println();
        if(aver_arr_1>aver_arr_2){
            System.out.print("average array 1 > array2: "+aver_arr_1+" > "+aver_arr_2);
        } else if (aver_arr_1<aver_arr_2) {
            System.out.print("average array 1 < array2: "+aver_arr_1+" < "+aver_arr_2);
        }else{
            System.out.print("average array 1 = array2: "+aver_arr_1+" = "+aver_arr_2);
        }

    }
}
