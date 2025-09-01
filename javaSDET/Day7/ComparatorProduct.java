package pack7;

import java.util.*;

public class ComparatorProduct implements Comparator<Products> {
    public int compare(Products p1, Products p2) {
        if (p1.price == p2.price) {
            return p1.name.compareToIgnoreCase(p2.name);  
        } else {
            return Double.compare(p1.price, p2.price);  
        }
    }
    public static void main(String[] args) {
        List<Products> ps = new ArrayList<>();
        ps.add(new Products(434.56, "charger"));
        ps.add(new Products(234.67, "Mouse"));
        ps.add(new Products(412.65, "cpu"));
        ps.add(new Products(156.32, "Adapter"));
        ps.add(new Products(276.65, "plugbox"));
        Collections.sort(ps, new ComparatorProduct());
        for (Products p : ps) {
            System.out.println(p);
        }
    }
}
