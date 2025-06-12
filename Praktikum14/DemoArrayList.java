package Praktikum14;

import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<customer> Customers = new ArrayList<>();
        
        customer Customer2 = new customer(1, "Zakia");
        customer Customer1 = new customer(5, "Budi");

        Customers.add(Customer1);
        Customers.add(Customer2);

        Customers.add(new customer(4, "Cica"));
        Customers.add(2,new customer(100, "Rosa"));

        System.out.println(Customers.indexOf(Customer2));
        customer customer = Customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for(customer cust : Customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customer);
    }
}
