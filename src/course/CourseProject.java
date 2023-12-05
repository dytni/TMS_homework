package course;

import course.clients.contlor.AddBankOperation;
import course.clients.contlor.AddUser;
import course.clients.contlor.sql.BankAccountsTable;
import course.clients.contlor.sql.UsersTable;
import course.clients.enums.OperationStatus;
import org.w3c.dom.NodeList;

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
                    Map<String, NodeList> result = Parsing.pars(path);
                    /*конец какого то парсинга*/
                    NodeList accountOut = result.get("accountFrom");
                    NodeList accountIn = result.get("accountTo");
                    NodeList payment = result.get("payment");
                    int length = accountIn.getLength();
                    for (int i = 0; i < length; i++) {
                        OperationStatus status = BankAccountsTable.update(payment.item(i).getNodeType()
                                , accountIn.item(i).toString(), accountOut.item(i).toString());
                        AddBankOperation.add(BankAccountsTable.select(accountIn.item(i).getNodeType()),
                                BankAccountsTable.select(accountOut.item(i).getNodeType()),
                                payment.item(i).getNodeType(), status);
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
