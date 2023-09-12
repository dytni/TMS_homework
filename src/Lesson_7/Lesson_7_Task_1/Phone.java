package Lesson_7.Lesson_7_Task_1;

public class Phone {
    private int number;
    private float weight;
    private String model;
    Phone(){
        number=0;
        weight=0;
        model=" ";
    }
    Phone(int number, String model){
        this.number=number;
        this.model=model;
        weight=0;
    }
    Phone(int number, float weight, String model){
         this(number,model);
         this.weight=weight;
    }
    public int getNumber() {
        return number;
    }
    void receiveCall(String name){
        System.out.println("Enter call "+ name);
    }
    void receiveCall(String name, Phone phone){
        System.out.println("Enter call "+ name);
        System.out.println("number: "+phone.getNumber());
    }
    void sendMassage(String massage, Phone... phones){
        for (Phone phone: phones){
            System.out.println("on number: "+phone.getNumber()+" send massage: "+ massage);
        }
    }
}
