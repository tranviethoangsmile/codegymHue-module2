package com.codegymhueJava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	 List<String> list = new ArrayList <String>();
//
//		Set<String> set = new HashSet<>();
//
//		set.add("A");
//		set.add("C");
//		set.add("B");
//		System.out.println("----SetList-----");
////		set.remove("A");
////		for (String item : set) {
////			if(item.equals("A")){
////			set.remove(item);
////			}
////        }
//		Iterator<String> item = set.iterator();
//		while (item.hasNext()) {
//			String item1 = item.next();
//			if(item1.equals("A")){
//				item.remove();
//			}
//        }
//		set.add("A");
////		while (item.hasNext()) {
////			String item2 = item.next();
////			System.out.println(item2);
////		}
//
//		for(String element : set) {
//			System.out.println(element);
//		}
//
//		list.add("a");
//		list.add("c");
//		list.add("b");
//		System.out.println("----ArrayList-----");
////		list.remove(0);
//		for (String ele : list) {
//			System.out.println(ele);
//        }

		List <String> nameList = new LinkedList<>();

		ListIterator<String> listIterator = nameList.listIterator();
		listIterator.add("name");
		listIterator.add("hoang");

		for(String i:nameList) {
			System.out.println(i + " ");
		}



//		System.out.println("size: " + list.size());
//// them phan tu
//	 list.add("Chuong");
//	 list.add("Phuong");
//	 list.add("hoang");
//	 list.add("hoa");
//// in phan tu
//		for(String item : list) {
//			System.out.println(item);
//		}
//		System.out.println("-------");
////		Xoa phan tu
//		list.remove(0);
//		for(String item : list) {
//			System.out.println(item);
//		}
//
//		System.out.println("--------");
//// sua du lieu phan tu
//
//		list.set(0,"Hieu");
//		list.set(1,"Hieu");
//
//
//
//		for(String item : list) {
//			System.out.println(item);
//		}
//// kiem tra do dai
//		System.out.println("--------");
//
//			System.out.println("size:" + list.size());
//			String name = "Hieu";
//			for(int i = 0; i < list.size(); i++) {
//				if(list.get(i).equals(name)) {
//					list.remove(i);
//				}
//			}
//
//		for(String item : list) {
//			System.out.println(item);
//		}
//

    }
}
