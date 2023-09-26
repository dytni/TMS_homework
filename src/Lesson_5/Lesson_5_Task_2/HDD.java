package Lesson_5.Lesson_5_Task_2;

public class HDD {
        String name ;
        int storage ;
        Type_HDD typeHdd ;

        void print_info() {
            System.out.println("name: " + name + " storage = " + storage + " tb  type hdd "+ typeHdd);
        }
        HDD(){
            name = "Toshiba";
            storage = 1;
            typeHdd = Type_HDD.internal;
        }
        HDD(String nameHdd, int storageHdd, Type_HDD type){
            name= nameHdd;
            storage= storageHdd;
            typeHdd=type;
        }
}
