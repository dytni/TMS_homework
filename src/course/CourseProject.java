package course;

import course.clients.contlor.AddBankOperation;
import course.clients.contlor.AddUser;
import course.clients.contlor.sql.BankAccountsTable;
import course.clients.contlor.sql.UsersTable;
import course.clients.enums.OperationStatus;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourseProject {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello user");
        while (true) {
            System.out.println("""
                    Enter:
                     1 - for read xml or json
                     2 - to add User and Bank Account
                     3 - for delete User and Bank Account
                     4 - show Users and Bank Accounts
                      Enter other to escape""");
            int menuChoose = scanner.nextInt();
            switch (menuChoose) {
                case 1 -> {

                    System.out.println("Enter path to the folder: ");
                    String path = scanner.next();
                    /*Какой то парсинг*/
                    Map<String, List<List<Object>>> result = Parsing.pars(path);
                    for (int j = 0; j < result.get("accountFrom").size(); j++) {
                        List<Object> accountIn = result.get("accountTo").get(j);
                        List<Object> accountOut = result.get("accountFrom").get(j);
                        List<Object> payment = result.get("payment").get(j);
                            for (int i = 0; i < accountIn.size(); i++) {
                                OperationStatus status = BankAccountsTable.update((Float) payment.get(i)
                                        , (String) accountIn.get(i), (String) accountOut.get(i));
                                AddBankOperation.add(BankAccountsTable.select( (String) accountIn.get(i)),
                                        BankAccountsTable.select( (String) accountOut.get(i)),(Float)
                                        payment.get(i), status);
                            }
                        }
                }
                case 2 -> {
                    System.out.println("Add user");
                    AddUser.add();
                }
                case 3 -> {
                    System.out.println("Delete User");
                    UsersTable.delete();
                }
                case 4 -> {
                    System.out.println("Show User\n------------------");
                    UsersTable.select();
                    System.out.println("\n\nShow Bank accounts\n------------------");
                    BankAccountsTable.select();
                }
                default -> {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
        }


    }
}
