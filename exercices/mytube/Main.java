package exercices.mytube;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        var customers = new HashMap<String, Customer>();

        var customer1 = new Customer("a", "e1@gmail.com");
        var customer2 = new Customer("b", "e2@gmail.com");

        customers.put(customer1.getEmail(), customer1);
        customers.put(customer2.getEmail(), customer2);

        //System.out.println(customers.keySet());
        //System.out.println(customers.values());
        System.out.println(customer1);


    }
}
