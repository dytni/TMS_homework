package Leson_2;

public class Task10 {/*5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
*/
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 11; i++){
            System.out.println(sum);
            sum = sum - 5;
        }
    }
}
