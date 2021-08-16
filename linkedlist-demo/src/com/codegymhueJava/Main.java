package com.codegymhueJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  LinkedList <String> linkedName = new LinkedList<>();
	  List<Integer> linkedInteger = new LinkedList<>();

	  linkedName.add("hoa");
	  linkedName.add("hieu");
	  linkedName.add("phuong");
	  for(String element : linkedName) {
          System.out.print(element + " ");
      }

	  linkedInteger.add(1);
	  linkedInteger.add(2);
	  linkedInteger.add(3);

	  Iterator <Integer> inteName = linkedInteger.iterator();
	  while (inteName.hasNext()) {
		  System.out.print("\n" +  inteName.next());
      }

		System.out.println(linkedName.get(0));

		System.out.println(linkedName.contains("h"));

		System.out.println(linkedName.indexOf("h"));

		linkedName.set(1,"Chuong");
		for(String element : linkedName) {
			System.out.print(element + " ");
		}

		linkedName.remove(0);
		for(String element : linkedName) {
			System.out.print(element + " ");
		}
		for(Integer i : linkedInteger) {
			System.out.println(i);
		}

		linkedInteger.removeIf((Integer i) -> i < 3);
		for(Integer i : linkedInteger) {
			System.out.println(i);
		}


		linkedName.clear();
		System.out.println("size: " + linkedName.size());


	}
}
