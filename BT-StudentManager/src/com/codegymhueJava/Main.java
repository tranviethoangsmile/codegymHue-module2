package com.codegymhueJava;

import java.util.*;

public class Main {
    static ArrayList <Students> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int choose;

        do {
            showMenu();
            System.out.print("select: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1 :
                    addNewStudent();
                    break;
                case 2 :
                    showListStudents();
                    break;
                case 3 :
                    deleteStudent();

                    break;
                case 4 :
                    editStudent();
                    break;
                case 5 :
                    saveStudents();
                    break;
                case 6 :
                    rank();
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }

        }while (choose != 0);



    }

    private static void saveStudents() {
    }

    private static void rank() {
        Collections.sort(studentList, new Comparator<Students>() {

            @Override
            public int compare(Students o1, Students o2) {
                return (int) (o1.getMediumScore() - o2.getMediumScore());
            }
        });

        for (Students o : studentList) {
            System.out.println(o);
        }
    }

    private static void deleteStudent() {
        System.out.println("----[WITH]----");
        System.out.println("1.NAME \n2.STATUS \n0.Exit.");
        System.out.println("--[END]--");
        int select;
        do {
            System.out.print("Select: ");
            select = sc.nextInt();{
                switch (select) {
                    case 1 :
                        deleteWithName();
                        break;
                    case 2 :
                        deleteWithStatus();
                        break;
                    case 0 :
                        break;
                }
            }

        }while (select != 0);

    }

    private static void editStudent() {
        System.out.println("----[WITH]----");
        System.out.println("1.NAME \n2.STATUS \n0.Exit.");
        System.out.println("--[END]--");
        int select;
        do {
            System.out.print("Select: ");
            select = sc.nextInt();{
                switch (select) {
                    case 1 :
                        editWithName();
                        break;
                    case 2 :
                        editWithStatus();
                        break;
                    case 0 :
                        break;
                }
            }

        }while (select != 0);

//
    }

    private static void editWithStatus() {
        int status;
        System.out.println("input status: ");
        status = sc.nextInt();
        sc.nextLine();
        String name;
        System.out.println("Input Name: ");
        name = sc.nextLine();

        double maths;
        System.out.println("Maths: ");
        maths = sc.nextDouble();

        double physics;
        System.out.println("Phy: ");
        physics = sc.nextDouble();

        double chemistry;
        System.out.println("Chem: ");

        chemistry = sc.nextDouble();

        double english;
        System.out.println("Eng: ");
        english = sc.nextDouble();
        studentList.get(status).setName(name);
        studentList.get(status).setMaths(maths);
        studentList.get(status).setPhysics(physics);
        studentList.get(status).setChemistry(chemistry);
        studentList.get(status).setEnglish(english);
    }

    private static void editWithName() {
        String name;
        System.out.println("name: ");
        sc.nextLine();
        name = sc.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getName().equals(name)){
                String newName;
                System.out.println("Input New Name: ");
                newName = sc.nextLine();

                double maths;
                System.out.println("Maths: ");
                maths = sc.nextDouble();

                double physics;
                System.out.println("Phy: ");
                physics = sc.nextDouble();

                double chemistry;
                System.out.println("Chem: ");

                chemistry = sc.nextDouble();

                double english;
                System.out.println("Eng: ");
                english = sc.nextDouble();

                studentList.get(i).setName(newName);
                studentList.get(i).setMaths(maths);
                studentList.get(i).setPhysics(physics);
                studentList.get(i).setChemistry(chemistry);
                studentList.get(i).setEnglish(english);
            }else {
                System.out.println(name + " not have in List..");
            }

        }





    }

    private static void deleteWithStatus() {
        System.out.println("Input index: ");
        int index = sc.nextInt();
        studentList.remove(index);
    }

    private static void deleteWithName() {
        System.out.println("Input Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getName().equals(name)){
                studentList.remove(studentList.get(i));
            }
            System.out.println(name + " not have in List..");
        }
    }

    private static void showListStudents() {
        if (studentList.size() == 0) {
            System.out.println("-------------------------");
            System.out.println("List is Empty....please try again later..!!");
            System.out.println("-------------------------");
        }
        System.out.println("\t\t\t\t|Name| \t\t |Maths| \t\t |Physis|\t\t |Chem|\t\t\t |Eng|\t\t   |Medium|");
        for (Students i : studentList) {
            System.out.println(i);
        }
    }

    private static void addNewStudent() {
        sc.nextLine();
        String name;
        System.out.println("Input Name: ");
        name = sc.nextLine();

        double maths;
        System.out.println("Maths: ");
        maths = sc.nextDouble();

        double physics;
        System.out.println("Phy: ");
        physics = sc.nextDouble();

        double chemistry;
        System.out.println("Chem: ");

        chemistry = sc.nextDouble();

        double english;
        System.out.println("Eng: ");
        english = sc.nextDouble();

        Students student = new Students(name,maths,physics,chemistry,english);

        studentList.add(student);
    }

    public static void showMenu () {
        System.out.println("-------[MENU]-------");
        System.out.println("1.Add Student \n2.Show List Student \n3.Delete Student \n4.Edit \n5.SAVE \n6.RANK \n0.Exit.");
        System.out.println("--------[END]---------");
    }

}
