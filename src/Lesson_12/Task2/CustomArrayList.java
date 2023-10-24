package Lesson_12.Task2;
//2. Представим, что в Java нет коллекции типа ArrayList.
//        Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
//        Предусмотреть операции добавления элемента, удаления элемента, получение элемента по индексу, проверка есть ли элемент в коллекции, метод очистки все коллекции.
//        Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//        Предусмотреть конструктор с задаваемым размером внутреннего массива.
//        Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция уже заполнена.

public class CustomArrayList<T> {

    private Object[] array;
    private int size = 0;

    public CustomArrayList() {
        this.array = new Object[10];
    }

    public CustomArrayList(int initialCapacity) {
        this.array = new Object[initialCapacity];
    }

    public CustomArrayList(T []UserArray) {
        this.array = new Object[10];
        while(UserArray.length > array.length){
            increaseCapacity();
        }
        System.arraycopy(UserArray, 0, array, 0, UserArray.length);
        size = UserArray.length;

    }

    public void add(T element) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    private void increaseCapacity() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

}