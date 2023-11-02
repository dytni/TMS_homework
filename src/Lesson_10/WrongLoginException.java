package Lesson_10;

public class WrongLoginException extends Exception {
    WrongLoginException(String message) {
        super(message);
    }
    WrongLoginException(){
        super("wrong value");
    }
}
