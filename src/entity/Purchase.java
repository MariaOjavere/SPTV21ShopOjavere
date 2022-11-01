
package entity;

import java.util.Date;

public class Purchase {
private Client client;
private Product product;
private Date givenDate;
private Date returnedDate;


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

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    @Override
    public String toString() {
        return "History{" + "client=" + client + ", product=" + product + ", givenDate=" + givenDate + ", returnedDate=" + returnedDate + '}';
    }

}
    

