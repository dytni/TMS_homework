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
public class Task1 {
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
          card1.showInfo();
          card2.showInfo();
          card3.showInfo();
          System.out.println();
          System.out.println();
          card1.addCash(500000);
          card2.addCash(1000000);
          card3.takeCash(100);
          card1.showInfo();
          card2.showInfo();
          card3.showInfo();

     }
}
