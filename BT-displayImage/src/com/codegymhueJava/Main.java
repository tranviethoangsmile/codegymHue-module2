package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
      String draw = "*";
      for(int k = 0; k < 3; k++){
          for(int h = 0; h < 10; h++){
              System.out.print(draw + " ");
          }
          System.out.println(" ");
      }

        System.out.println("-----------------------");


      for(int i = 0; i < 10; i++){
          for(int j = 0; j < i; j++){
              System.out.print(draw);
          }
          System.out.println(" ");
      }

        System.out.println("-----------------------");


      for(int n = 0; n < 10; n++){
          for(int m = 10; m > n; m--){
              System.out.print(draw);
          }
          System.out.println(" ");
      }
    }
}
