package example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ERIC_LAI on 2017-02-02.
 */
public class ProblemSolution {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            getDataFromFile("test1.txt", customers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        displayProblem1Solution(customers);
        displayProblem2Solution(customers);
    }

    private static void displayProblem2Solution(ArrayList<Customer> customers) {
        Collections.sort(customers, new CustomerComparator());
        displayCustomer(customers);
    }

    private static void displayProblem1Solution(ArrayList<Customer> customers) {
        displayCustomer(customers);
    }

    private static void displayCustomer(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

    private static void getDataFromFile(String path, ArrayList<Customer> list)
            throws FileNotFoundException {
        int[] cupSizes = new int[3];
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        try {
            String tmp = br.readLine();
            String[] sizeStr = tmp.split(" ");
            for (int i = 0; i < cupSizes.length; i++) {
                cupSizes[i] = Integer.parseInt(sizeStr[i]);
            }
            Customer.cupSizes = cupSizes;
            int num = Integer.parseInt(br.readLine());
            for (int i = 0; i < num; i++) {
                String[] user = br.readLine().split(" ");
                String name = user[0];
                int age = Integer.parseInt(user[1]);
                int foot = Integer.parseInt(user[2]);
                int inch = Integer.parseInt(user[3]);
                Customer customer = new Customer(name, age, foot, inch);
                list.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

