package Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Storate {
    ArrayList<Product> storage = new ArrayList<>();

    public Storate() {
        this.storage = new ArrayList<Product>();
    }

    public Storate(ArrayList<Product> storage) {
        this.storage = storage;
    }

    public void addProduct(Product sp){
        this.storage.add(sp);
    }

    public void showStorage(){
        for(Product sp : storage){
            System.out.println(sp);
        }
    }

    public void sortPrice(){
        Collections.sort(this.storage, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

}
