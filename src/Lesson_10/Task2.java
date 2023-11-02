package Lesson_10;
//Дополнительное задание
//        2. Создать класс, в котором будет статический метод. (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
//        Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//
//        Все поля имеют тип данных String.
//        Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//        Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//        Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//        Метод возвращает true, если значения верны или false в другом случае.

public class Task2 extends Exception {
    static boolean password(String Login, String Password, String ConfirmPassword) {
        try {
            if (Login == null || Login.length() > 20 || Login.contains(" "))
                throw new WrongLoginException("wrong login");
        } catch (WrongLoginException exception) {
            System.out.println("\u001b[31m" + exception.getMessage() + "\u001b[0m");
            return false;
        }
        try {
            if (Password == null || Password.length() > 20 ||
                    !(Password.matches(".*\\d.*")) || !(Password.equals(ConfirmPassword)))
                throw new WrongPasswordException("wrong password");
        }catch (WrongPasswordException exception){
            System.out.println("\u001b[31m" + exception.getMessage() + "\u001b[0m");
            return false;
        }
        return true;
    }
}
