
package manager;

import entity.Client;
import entity.Product;
import entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class PurchaseManager {
    Scanner scanner = new Scanner(System.in);

    public Purchase createPurchase(Product[] products, Client[] clients){
        System.out.println("Список пользователей: ");
        for (int i = 0; i < clients.length; i++) {
            System.out.println(i+1+". "+clients[i].getFirstName()+" "+clients[i].getLastName());
        }
        System.out.print("Выбери пользователя: ");
        int numberClient = scanner.nextInt(); scanner.nextLine();
        System.out.println("Список продуктов: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i+1+". "+products[i].getProductName()+". ");
        }
        System.out.print("Выбери номер продукта: ");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        System.out.print("Выбери кол-во продуктов: ");
        int countProducts = scanner.nextInt();scanner.nextLine();
        Purchase purchase = new Purchase();
        purchase.setProduct(products[numberProduct - 1]);
        purchase.setClient(clients[numberClient-1]);
        purchase.setDate(new GregorianCalendar().getTime());
        purchase.setCount(countProducts);
        return purchase;
    }

   }





