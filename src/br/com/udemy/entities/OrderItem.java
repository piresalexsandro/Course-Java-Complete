package br.com.udemy.entities;

public class OrderItem {
    private Integer quantity;
    private double price;
    // associaçoes 1:1
    private ProductOrder productOrder;

    
    public OrderItem(){
    }

    public OrderItem(Integer quantity, double price) {
        super();
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    public double subTotal(Integer quantity, double price){
        return price * quantity;
    }
    
/*    public String toString(){
        return " $" + this.price + " Quantity: " + this.quantity + "Subtotal: " + subTotal(this.quantity, this.price);
    }*/

}
