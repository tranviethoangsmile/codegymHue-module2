package com.codegymhueJava;




public class Main {

    public static void main(String[] args) {
	    Animal [] animal = new Animal [2];
	    animal[0] = new Tiger();
	    animal[1] = new Chicken();
	    for (Animal animals : animal) {
            System.out.println(animals.makeSound());
            String error = "error systax";
            try {
                if (animals instanceof Chicken){
                    Edible edible = (Edible) animals;
                    System.out.println(edible.howtoEat());
                }
            }catch(Exception e){
                System.out.println(error);
            };



        }
    }
}
