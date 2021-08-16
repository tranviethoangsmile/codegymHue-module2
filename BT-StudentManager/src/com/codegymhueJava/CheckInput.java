package com.codegymhueJava;

import java.util.Scanner;

public class CheckInput {
  Scanner scanner = new Scanner(System.in);

  public int getInteger(int min, int max) {
      int interger = 0;
      while (true) {
          try {
              interger = Integer.parseInt(scanner.nextLine());
              if (interger >= min && interger <= max) {
                  break;
              }else {
                  System.out.println("vui lòng nhập trong khoảng " + min + " " + max);
              }


          }catch (Exception e) {
              System.out.println("Vui lòng nhập lại: ");
          }


      }
      return interger;
  }

  public double getDouble(int min, int max) {
      double db = 0;
      while (true) {
          try {
              db = Double.parseDouble(scanner.nextLine());
              if(db >= min && db <= max) {
                  break;
              }else {
                  System.out.println("Vui lòng nhập trong khoảng " + min + " " + max);
              }


          }catch (Exception e) {
              System.out.println("Vui lòng nhập lại..");
          }
      }

      return db;
  }


  public String getString() {
      String result;
      while (true) {
          result = scanner.nextLine();
          if(!result.trim().isEmpty()){
              break ;
          }else {
              System.out.println("Vui lòng nhập lại");
          }

      }
      return result;
  }

}
