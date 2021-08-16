package com.codegymhueJava;

import java.util.*;

public class ProductManager {

    static List<Products> listProducts = new ArrayList<Products>();
    static Scanner scanner = new Scanner(System.in);

    public static void add() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.print("Giá: ");
        int price = scanner.nextInt();

        Products products = new Products(id,name,price);
        listProducts.add(products);
    }

    public static void edit () {
        System.out.print("id muốn sửa: ");
        int id = scanner.nextInt();

        for(Products i : listProducts) {
            if(i.getId() == id) {
                scanner.nextLine();
                System.out.print("New name: ");
                i.setNameProduct(scanner.nextLine());
                System.out.print("New Price: ");
                i.setPrice(scanner.nextInt());
            }
        }

    }

    public static  void remove () {
        System.out.print("id muốn xóa: ");
        int id = scanner.nextInt();
        for(Products i : listProducts) {
            if(i.getId() == id) {
               listProducts.remove(id);
            }
        }
        System.out.println("ID không tồn tại");
    }

    public void displayProduct () {
        System.out.println("--------------Danh sách sản phẩm--------------------");
        System.out.println("\tID                 Tên       Giá: ");
        System.out.println("----------------------------------------------------");
        for (Products i : listProducts) {
            System.out.println(i);
        }
        System.out.println("--------------------Kết thúc-------------------------");
    }

    public void searchProducts () {
        System.out.println("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
       for (Products p : listProducts) {
           if (p.getNameProduct().equals(name)) {
               System.out.println("--------------Danh sách sản phẩm--------------------");
               System.out.println("\tID                 Tên       Giá: ");
               System.out.println("----------------------------------------------------");
               System.out.println(p);
           }
       }
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
