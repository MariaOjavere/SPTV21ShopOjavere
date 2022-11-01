
package manager;

import entity.Client;
import entity.Product;
import java.util.Date;


public class PurchaseManager {

    public entity.Purchase createPurchase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getPurchase(entity.Purchase[] purchases) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

public class Purchase {
    private Client client;
    private Product product;
    private Date givenDate;
    private Date returnedDate;
    private int price;

        public Purchase() {
        }

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public Date getGivenDate() {
            return givenDate;
        }

        public void setGivenDate(Date givenDate) {
            this.givenDate = givenDate;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Date getReturnedDate() {
            return returnedDate;
        }

        public void setReturnedDate(Date returnedDate) {
            this.returnedDate = returnedDate;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Purchase{" + "client=" + client + ", product=" + product + ", givenDate=" + givenDate + ", returnedDate=" + returnedDate + ", price=" + price + '}';
        }

        
   
}
}



