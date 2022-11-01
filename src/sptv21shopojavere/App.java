
package sptv21shopojavere;
import manager.ClientManager;
import manager.PurchaseManager;
import manager.ProductManager;
import entity.Product;
import entity.Client;
import entity.Purchase;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    private Product[]products = new Product[0];
    private Client[] clients = new Client[0];
    private Purchase[] purchases = new Purchase[0];
    private final Scanner scanner = new Scanner(System.in);
    private final ProductManager productManager;
    private final ClientManager clientManager;
    private final PurchaseManager purchaseManager;
    private int l;
    private int i;
    
    public App() {
        products = new Product[0];
        clients = new Client[i];
        purchases = new Purchase[0];
        productManager = new ProductManager();
        clientManager = new ClientManager();
        purchaseManager = new PurchaseManager();
    }
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("0: Выход из программы");
            System.out.println("1: Добавить товар");
            System.out.println("2: Список товаров");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список покупателей");
            System.out.println("5: Покупка товара");
            System.out.println("6: Доход магазина за всё время работы");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("---------- Добавить товар ----------");
                    addProduct(productManager.createProduct());
                    break;
                                       
                case 2:
                     System.out.println("---------- Список товаров ----------");
                    productManager.printListProduct(products);
                    break;
                case 3:
                    System.out.println("---------- Добавить покупателя ----------");
                    addClient(clientManager.createClient());
                   break;
                case 4:
                    System.out.println("---------- Список покупателей ----------");
                    clientManager.printListClient(clients);
                    break;
                case 5:
                    System.out.println("---------- Покупка товара ----------");
                    addPurchase(purchaseManager.createPurchase(products, clients));
                    break;
                case 6:
                    System.out.println("---------- Доход магазина ----------");
                    double sum=0;
                    for (int i = 0; i < purchases.length; i++) {
                        double price = new Double( purchases[i].getProduct().getPrice());
                       sum += purchases[i].getCount()*price;
                    }
                    System.out.println("Доход магазина за все время: "+sum );
                    break;
                case 7:
                    System.out.println("---------- Добавить денег клиенту ----------");
                    for (int i = 0; i < clients.length; i++)
                    System.out.printf(i+l+".Customer{FirstName = %s%n", clients[i].getFirstName());
                    System.out.printf(".Customer{LastName = %s%n", clients[i].getLastName());
                    System.out.printf("Customer{cash=%s%n", clients[i].getCash());
                    
                    System.out.println("Введите имя покупателя: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Введите кол-во валюты: ");
                    int num2 = scanner.nextInt();
                    int cash = clients[num1-l].getCash()+num2;
                    clients[num1-l].setCash(cash);
                    break;
                        
                default:
                    System.out.println("Выберите задачу из списка.");
            }
        }while(repeat);
        System.out.println("Закрытие программы, до свидания!");
    }
        
    private void addProduct(Product product) {
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length - 1] = product; 
    }
    private void addClient(Client client) {
        this.clients = Arrays.copyOf(this.clients, this.clients.length+1);
        this.clients[this.clients.length - 1] = client;   
    }
    private void addPurchase(Purchase purchases) {
        this.purchases = Arrays.copyOf(this.purchases, this.purchases.length+1);
        this.purchases[this.purchases.length - 1] = purchases;   
    }

    

}

