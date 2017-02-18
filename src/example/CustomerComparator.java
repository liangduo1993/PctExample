package example;

import java.util.Comparator;

/**
 * Created by ERIC_LAI on 2017-02-02.
 */
public class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        char name1 = o1.getName().toUpperCase().charAt(0);
        char name2 = o2.getName().toUpperCase().charAt(0);
        if (name1 == name2) {
            Customer.CupType cup1 = o1.getCup();
            Customer.CupType cup2 = o2.getCup();
            if (cup1 == cup2) {
                double h1 = o1.getHeight();
                double h2 = o2.getHeight();
                double result = h2 - h1;
                return (result > 0) ? 1 : -1;
            }
            return cup1.compareTo(cup2);
        }
        return name1 - name2;
    }
}
