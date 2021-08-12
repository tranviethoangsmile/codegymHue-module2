package com.codegymhueJava;

import java.util.*;

public class ProductManager {

    static List<Products> listProducts = new ArrayList<Products>();
    static Scanner scanner = new Scanner(System.in);

    public static void add(Products products) {
        listProducts.add(products);
    }

    public static void Edit (int id) {
        for(Products i : listProducts) {
            if(i.getId() == id) {
                i.setNameProduct(scanner.nextLine());
                i.setPrice(scanner.nextInt());
            }
        }
    }

    public static  void remove (int id) {
        listProducts.remove(id);
    }

    public void displayProduct () {
        for (Products i : listProducts) {
            System.out.println(i);
        }
    }

    public void searchProducts (String name) {
       for (Products p : listProducts) {
           if (p.getNameProduct().equals(name)) {
               System.out.println(p);
               System.exit(0);
           }
       }

            System.out.println(name + " không có trong list");


    }

    public void sapXepTangDan() {
        Collections.sort(listProducts, new Comparator<Products>(){

            @Override
            public int compare(Products o1, Products o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }

        });
    }



}
