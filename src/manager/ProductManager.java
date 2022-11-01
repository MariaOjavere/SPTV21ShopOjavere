
package manager;

import entity.Product;
import entity.Client;
import java.util.Scanner;


public class ProductManager {
public final Scanner scanner;
private String phone;
private int price;
public ProductManager(){
scanner = new Scanner(System.in);
}
public Product createProduct (String ProductName,int quantity){
        Product product = new Product();
        String productName = null;
        product.setProductName(productName);
        product.setQuantity(quantity);
        return product;
    }
public Client createClient(String firstname, String lastname, int birthday){
        Client client = new Client();
        client.setPhone(phone);
        client.setFirstName(firstname);
        client.setLastName(lastname);
        return client;
}

public Product createProduct(){
        System.out.print("Введите название продукта: ");
        String productName = scanner.nextLine();
        System.out.print("Введите цену продукта: ");
        int productPrice = scanner.nextInt();
        System.out.print("Введите количество экземпляров: ");
        String quantity = scanner.nextLine();
        Product product = createProduct(productName, new Integer(quantity));
        

    return null;
}



public void printListProduct(Product[] product){
        for (int i = 0; i < product.length; i++) {
            System.out.print(i+1+". "+product[i].getProductName()+". ");
            System.out.println();
        }
}
}