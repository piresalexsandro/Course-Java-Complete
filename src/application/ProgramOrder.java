package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Client;
import br.com.udemy.entities.Departament;
import br.com.udemy.entities.Order;
import br.com.udemy.entities.OrderItem;
import br.com.udemy.entities.Worker;
import br.com.udemy.entities.enuns.OrderStatus;
import br.com.udemy.entities.enuns.WorkerLevel;

public class ProgramOrder {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameClient = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay  = sdf.parse(sc.next()); //formata a data digitada para o formato declarado SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus os = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        Integer quantityItem = sc.nextInt();

        Order order = new Order(birthDay, os, new ArrayList<>(), new Client());
        
        order.getClient().setName(nameClient);
        order.getClient().setBirthDate(birthDay);
        order.getClient().setEmail(email);
        
        double[] vect = new double[quantityItem];
      	for(int i=0; i<vect.length; i++){
        	int in = 1;
        	in += i; 
            System.out.println("Enter #" + in + " item data: ");
            System.out.print("Product name: ");
            String nameItem = sc.next();
            System.out.print("Product price: ");
            double priceItem = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantityPerItem = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(quantityPerItem, priceItem, nameItem);
            order.addOrderItem(orderItem);
            orderItem.subTotal(quantityPerItem, priceItem);
       }
        
        System.out.println(order);
    }

}
