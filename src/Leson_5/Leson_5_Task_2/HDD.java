package Leson_5.Leson_5_Task_2;

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
        HDD(String name_hdd, int storage_hdd, Type_HDD type){
            name=name_hdd;
            storage=storage_hdd;
            typeHdd=type;
        }
}
