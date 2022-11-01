
package manager;

import entity.Product;
import entity.Client;
import java.util.Scanner;


public class ProductManager {
public final Scanner scanner;
private String phone;
private String price;
public ProductManager(){
scanner = new Scanner(System.in);
}

//public Client createClient(String firstname, String lastname, int birthday){
//        Client client = new Client();
//        client.setPhone(phone);
//        client.setFirstName(firstname);
//        client.setLastName(lastname);
//        return client;
//}

public Product createProduct(){
    System.out.print("Введите название продукта: ");
    String productName = scanner.nextLine();
    System.out.print("Введите цену продукта: ");
    String productPrice = scanner.nextLine();
    System.out.print("Введите количество экземпляров: ");
    int quantity = scanner.nextInt();scanner.nextLine();
    Product product = new Product();
    product.setPrice(price);
    product.setProductName(productName);
    product.setQuantity(quantity);
    return product;
}



public void printListProduct(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(i+1+". "+products[i].getProductName()+". ");

        }
}
}