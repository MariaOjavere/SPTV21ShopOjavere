
package entity;

import java.util.Date;

public class Purchase {
private Client client;
private Product product;
private Date date;
private int count;


    public Purchase() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Purchase{" + "client=" + client + ", product=" + product + ", date=" + date + ", count=" + count + '}';
    }

   

}
    

