package Lesson_10;

public class WrongPasswordException extends Exception {
    WrongPasswordException(){
        super("wrong value");
    }
    WrongPasswordException(String message) {
        super(message);
    }

}
