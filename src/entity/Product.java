
package entity;

import java.util.Arrays;

public class Product {
    private String ProductName;
    private String ProductPrice;
    private String price;
    private int quantity;


    public Product() {
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

  
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + ", price=" + price + ", quantity=" + quantity + '}';
    }

   
    
}
