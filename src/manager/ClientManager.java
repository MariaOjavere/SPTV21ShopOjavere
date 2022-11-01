
package manager;

import entity.Client;
import java.util.Scanner;

public class ClientManager {
    private final Scanner scanner;
    private int i;

    public ClientManager() {
        scanner = new Scanner(System.in);
    }
   
    public Client createClient(){
        Client client = new Client();
        System.out.print("Введите имя покупателя: ");
        client.setFirstName(scanner.nextLine());
        System.out.print("Введите фамилию покупателя: ");
        client.setLastName(scanner.nextLine());
        System.out.print("Введите телефон покупателя: ");
        client.setPhone(scanner.nextLine());
        System.out.print("Введите баланс покупателя: ");
        client.setCash(scanner.nextInt());
        return client;
    }
   
    public void printListClient(Client[] client){
        for (int i = 0; i < client.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n"
                    ,i+1
                    ,client[i].getFirstName()
                    ,client[i].getLastName()
                    ,client[i].getPhone()
                    ,client[i].getCash()
            );
        }
}
}


