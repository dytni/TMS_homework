package Lesson_17.Task2;

public class EmptyPackageException extends Exception {
    @Override
    public String getMessage() {
        return "Empty package";
    }
}
