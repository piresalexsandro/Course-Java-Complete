package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameClient = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay  = sdf.parse(sc.next()); //formata a data digitada para o formato declarado SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter order data:");
        OrderStatus os = OrderStatus.valueOf("PROCESSING");
        System.out.println("Status: " + os);
        System.out.println("How many items to this order? ");
        Integer quantity = sc.nextInt();

//        Order order = new Order(birthDay, os, orderItem.getOrderItem(), nameClient);
        
        double[] vect = new double[quantity];
        for(int i=1; i<vect.length; i++){
            System.out.println("Enter #" + i + "item data:");
            System.out.print("Product name: ");
            String nameItem = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: " + quantity);
       }
        
  //      System.out.println(order);
    }

}
