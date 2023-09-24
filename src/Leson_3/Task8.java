package Leson_3;

/*. Создайте массив строк. Заполните его произвольными именами
людей. Отсортируйте массив. Результат выведите на консоль.
Реализуйте алгоритм сортировки пузырьком*/

public class Task8 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Dan", "Mag", "Angela", "Kai", "Ben"};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
