
package entity;

import java.util.Arrays;

public class Product {
    private String ProductName;
    private String ProductType;
    private Product[] product;
    private int quantity;

    public Product() {
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductName=" + ProductName + ", ProductType=" + ProductType + ", product=" + Arrays.toString(product) + ", quantity=" + quantity + '}';
    }

    public Object[] getClient(){
        return null;
    }
    
}
