package Lesson_5.Lesson_5_Task_1;
/*1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки:
1. Положите деньги на первые две карточки и снимите с третьей.
2. Выведите на экран текущее состояние всех трех карточек.
*/
public class Lesson_5_Task_1 {
     public static void main(String[] args) {
          CreditCard card1 = new CreditCard();
          CreditCard card2 = new CreditCard();
          CreditCard card3 = new CreditCard();
          card1.numberOfCard = 88888880;
          card2.numberOfCard = 88888881;
          card3.numberOfCard = 88888882;
          card1.balance = 10000;
          card2.balance = 10000;
          card3.balance = 10000;
          card1.show_info();
          card2.show_info();
          card3.show_info();
          System.out.println();
          System.out.println();
          card1.add_cash(500000);
          card2.add_cash(1000000);
          card3.take_cash(100);
          card1.show_info();
          card2.show_info();
          card3.show_info();

     }
}
