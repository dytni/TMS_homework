package course;

import course.clients.contlor.AddBankOperation;
import course.clients.contlor.AddUser;
import course.clients.contlor.sql.BankAccountsTable;
import course.clients.contlor.sql.UsersTable;
import course.clients.enums.OperationStatus;
import org.w3c.dom.NodeList;

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
                    Map<String, List<Object>> result = Parsing.pars(path);
                    NodeList accountOut;
                    NodeList accountIn;
                    NodeList payment;
                    for (int j = 0; j < result.get("accountFrom").size(); j++) {
                        Object accountFromObj = result.get("accountFrom").get(j);
                        Object accountToObj = result.get("accountTo").get(j);
                        Object paymentObj = result.get("payment").get(j);

                        if (accountFromObj instanceof NodeList && accountToObj instanceof NodeList && paymentObj instanceof NodeList) {
                            accountIn = (NodeList) accountFromObj;
                            accountOut = (NodeList) accountToObj;
                            payment = (NodeList) paymentObj;

                            for (int i = 0; i < accountIn.getLength(); i++) {
                                OperationStatus status = BankAccountsTable.update(Float.parseFloat(payment.item(i).getNodeValue())
                                        , accountIn.item(i).getTextContent(), accountOut.item(i).getTextContent());
                                AddBankOperation.add(BankAccountsTable.select(accountIn.item(i).getTextContent()),
                                        BankAccountsTable.select(accountOut.item(i).getTextContent()),
                                        Float.parseFloat(payment.item(i).getNodeValue()), status);
                            }
                        } else {
                            // Обработка JSON-объектов
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
