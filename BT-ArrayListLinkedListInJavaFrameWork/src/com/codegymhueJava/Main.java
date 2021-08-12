package com.codegymhueJava;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("Chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.remove();
                    break;
                case 4:
                    productManager.searchProducts();
                    break;
                case 5:
                    productManager.sapXepTangDan();
                    productManager.displayProduct();
                    break;
                case 6:
                    productManager.displayProduct();
                    break;
                case 0:
                   System.exit(0);
            }

        }



    }

    public static void menu() {
        System.out.println("----MENU-----");
        System.out.println("1.Thêm Sản phẩm \n2.Sửa sản phẩm \n3.Xóa sản phẩm \n4.Tìm Kiếm \n5.Sắp Xếp \n6.Hiển thị danh sách \n0.Thoát");
        System.out.println("----End------");
    }
}
