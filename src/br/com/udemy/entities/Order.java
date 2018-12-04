package br.com.udemy.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.udemy.entities.enuns.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private List<OrderItem> itens = new ArrayList<>();    // lista de ordens   
    private Client client;     // associaçoes 1:1
    
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    
    public Order(){
    }

    public Order(Date moment, OrderStatus orderStatus, List<OrderItem> orderItem, Client client) {
        super();
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.itens = orderItem;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus; 
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;   
    }

    public List<OrderItem> getOrderItem() {
        return itens;
    }
    
    public void addOrderItem(OrderItem item) {
        itens.add(item);
    }
    
    public void removeOrderItem(OrderItem item) {
        itens.remove(item);
    }

    public String toString() {
        Date currentData = new Date(System.currentTimeMillis());
        SimpleDateFormat CurrentDataFormated = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//      Calendar cal = Calendar.getInstance(); //operaçoes com data
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + CurrentDataFormated.format(currentData) + "\n");
        sb.append("Order status: " + orderStatus + " \n");
        sb.append("Client: " + client + " \n");
        sb.append("ORDER ITEMS:" );
        
        for (OrderItem oi : itens) {
            sb.append(oi.getProductOrder().getName() + "\n");
            sb.append(itens);
        }
        return sb.toString();
    }

}
