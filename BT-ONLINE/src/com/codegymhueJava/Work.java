package com.codegymhueJava;

import java.util.*;

public class Work {


    public void sapXepTangDan(ArrayList<Working> arrList) {
       Collections.sort(arrList, new Comparator<Working>(){

           @Override
           public int compare(Working o1, Working o2) {
               return o1.getName().compareToIgnoreCase(o2.getName());
           }
       });
    }

    public void updateSalePriceOfBrandElement(String info,ArrayList<Working> arrList) {
        for(Working o : arrList) {
            if(o.getBrand() == info ){
                double newPrice = o.getPrice() - o.getPrice() * 10/100;
                o.setPrice(newPrice);
            }

        }

    }



    public void updateSalePrice(ArrayList<Working> arrList) {
        for(Working o : arrList) {
            double newPrice = o.getPrice() - o.getPrice() * 10/100;
            o.setPrice(newPrice);
        }

    }

    public int nameStartWithChar(String key, ArrayList<Working> arrList) {
       int count = 0;
       for (Working o : arrList ) {
           if(o.getName().startsWith(key)) {
               count++;
           }
       }
       return count;
    }

    public int findHowManyBrandIs(String info, ArrayList<Working> arrList ) {
        int count = 0;
        for( Working o : arrList ) {
            if(o.getBrand().equals(info)) {
                count++;
            }
        }
        return count;
    }

    public static void deleteElementWithIndex(int index, ArrayList<Working> arrList ) {
        arrList.remove(index);
    }

    public static void addNewElementToArrayList (int index, ArrayList<Working> arrList) {
        String name;
        int code;
        double price;
        String brand;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Name: ");
        name = sc.next();
        System.out.print("enter Code: ");
        code = sc.nextInt();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        System.out.print("Enter Brand: ");
        brand = sc.next();
        Working newWorking = new Working(name,code,price,brand);
        arrList.add(index,newWorking);
    }


    public static void displayArrayList (ArrayList<Working> arrList) {
        for ( Working o : arrList) {
            System.out.println(o);
        }
    }

    public static int f1(ArrayList<Working> arrList) {
        int count = 0;
        for ( Working o : arrList ) {
            if (o.getPrice() > 10) {
                count ++;
            }
        }
        return count;
    }

    public static int f2(ArrayList<Working> arrList) {
        int count = 0;
        for ( Working o : arrList ) {
            if (o.getPrice() > 10 && o.getPrice() < 50) {
                count ++;
            }
        }
        return count;
    }

    public static void displayElementWithIndex(int index, ArrayList<Working> arrList ) {
        if ( index < 0 || index > arrList.size()) {
            System.out.println("please enter Index Try again!!!");
        }
        System.out.println(arrList.get(index));
    }

    public static void updateInformationWithIndex(int index, ArrayList<Working> arrList,String newBrank) {
        arrList.get(index).setBrand(newBrank);
    }

    public static void main(String[] args) {
	    ArrayList<Working> arrayList = new ArrayList<>();

	    Working working = new Working("Pig",0,10,"heo");
        Working working1 = new Working("Dog",3,20,"Cho");
        Working working2 = new Working("Cat",4,30,"Meo");
        Working working3 = new Working("Fish",1,40,"Meo");
        Working working4 = new Working("Bird",2,50,"Chim");

        arrayList.add(working);
        arrayList.add(working1);
        arrayList.add(working2);
        arrayList.add(working3);
        arrayList.add(working4);

        Work body = new Work();

        body.displayArrayList(arrayList);



        System.out.println("Price > 10: " + body.f1(arrayList));

        System.out.println("Price > 10: " + body.f2(arrayList));
        System.out.println("element with index 4: ");
        body.displayElementWithIndex(4,arrayList);

//        body.addNewElementToArrayList(3,arrayList);

        body.displayArrayList(arrayList);

        body.updateInformationWithIndex(0,arrayList,"con lon");
        System.out.println("---------------------------");
        System.out.println(arrayList.get(0));
        System.out.println("---------------------------");

        body.deleteElementWithIndex(1,arrayList);

        body.displayArrayList(arrayList);


       int count = body.findHowManyBrandIs("Meo",arrayList);
        System.out.println("Brand = Meo : " + count);

        int count2 = body.nameStartWithChar("B",arrayList);
        System.out.println("Start with B: " + count2);

        body.updateSalePrice(arrayList);
        System.out.println("After sale 10%: ");
        body.displayArrayList(arrayList);


        System.out.println("Price after sale 10% with Brand is Meo: ");
        body.updateSalePriceOfBrandElement("Meo",arrayList);
        body.displayArrayList(arrayList);

        System.out.println("---------");
        body.sapXepTangDan(arrayList);
        body.displayArrayList(arrayList);
    }

}
