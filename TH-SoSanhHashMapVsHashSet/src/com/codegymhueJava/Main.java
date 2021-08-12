package com.codegymhueJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    Students student1 = new Students("hoang",28,"hue");
        Students student2 = new Students("hoa",29,"DN");
        Students student3 = new Students("hong",27,"QN");
        System.out.println("-------HashMap----------");

        Map<Integer, Students> studentHashMap = new HashMap<Integer, Students>();
        studentHashMap.put(1,student1);
        studentHashMap.put(2,student3);
        studentHashMap.put(3,student2);

       for(Map.Entry<Integer, Students> entry : studentHashMap.entrySet()) {
           System.out.println(entry.getKey()+ " " + entry.getValue());
       }

        System.out.println("-----------Set------------");

       Set <Students> setStudent = new HashSet<Students>();
       setStudent.add(student1);
       setStudent.add(student2);
       setStudent.add(student3);
       setStudent.add(student1);

       for(Students i : setStudent ) {
           System.out.println(i.toString());
       }


    }
}
