package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
	    ProductManager productManager = new ProductManager();
	    productManager.add(new Products(1,"Oishi",1000));
        productManager.add(new Products(2,"Omo",2000));
        productManager.add(new Products(3,"CocaCola",5000));
        productManager.add(new Products(6,"keo",500));
        productManager.add(new Products(5,"Bia",100000));

        productManager.sapXepTangDan();



        productManager.displayProduct();
        System.out.println("-----");
        productManager.searchProducts("Coca");

    }
}
