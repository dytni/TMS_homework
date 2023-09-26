package Lesson_5.Lesson_5_Task_2;

public class HDD {
        String name ;
        int storage ;
        TypeHDD typeHdd ;

        void printInfo() {
            System.out.println("name: " + name + " storage = " + storage + " tb  type hdd "+ typeHdd);
        }
        HDD(){
            name = "Toshiba";
            storage = 1;
            typeHdd = TypeHDD.internal;
        }
        HDD(String nameHdd, int storageHdd, TypeHDD type){
            name= nameHdd;
            storage= storageHdd;
            typeHdd=type;
        }
}
