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
        SimpleDateFormat CurrentDataFormated = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date currentData = new Date(System.currentTimeMillis());
//        String fmt  = currentData.format(CurrentDataFormated);                 //formata a data digitada para o formato declarado SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        System.out.println();
        
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + CurrentDataFormated.format(currentData) + "\n");
        sb.append("Order status: " + orderStatus + " \n");
        sb.append("Client: " + client + " \n");
        sb.append("ORDER ITEMS:" + "\n");
        
        for (OrderItem oi : itens) {
            sb.append(oi.getProductOrder().getName() + sb.append(itens));
        }
        return sb.toString();
    }

}
