package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Results {
    static int StudentIndex = 0;
    static Student[] array_lec = new Student[2]; //array(object) is created to store each competitor


    public static void AddStudent( Student[] array, Scanner input){//scanner input is passed as a parameter
        try {//try is used if a false input is provided (Invalid Input)

                System.out.print("Student ID : ");
                int StudentID = input.nextInt();

                System.out.print("Student Name : ");
                String name = input.next();

                System.out.print("Student Age : ");
                int age = input.nextInt();

                System.out.print("Student Address: ");
                String address = input.next();

                array[StudentIndex] = new Student(StudentID, name, address);
                StudentIndex++;
            }


        catch (Exception e){
            System.out.println(" ");
            System.out.println(" Invalid Input ! ");
            //Menu.menu(array_lec);//display the menu
            Main.menu();//display the menu
           // initialise(array_lec);//initialise the array again
        }
    }

}

   /*   static int StudentIndex = 0;
    static Student[] array = new Student[2]; //array(object) is created to store each competitor
    static Lecturer[] array2 = new Lecturer[2];
    static Module[] array3 = new Module[2];
    static menu menu = new menu();//object from the menu class

  public static void initialise( Student []array){	//initialise the obj array
        for (int i = 0 ; i<array.length;i++){	//loops the array length
            array[i] = new  Student();	//create a object (Competitor)
            array[i].setStudentID(0);
            array[i].setStudentName("null");
            array[i].setStudentAge(0);
            array[i].setStudentAddress("null");
            array[i].setStudentMobile(0);
            //System.out.println(array[i].getComName() + "" + array[i].getComNumber());
        }
    }


    private static void initialise(Lecturer[] array2) {
        for (int i = 0; i < array2.length; i++) {    //loops the array length
            array2[i] = new Lecturer();    //create a object (Competitor)
            array2[i].setLecturerID(0);
            array2[i].setLecturerName("null");
            array2[i].setLecturerAge(0);
            array2[i].setLecturerAddress("null");
            array2[i].setLecturerMobile(0);
            //System.out.println(array[i].getComName() + "" + array[i].getComNumber());
        }
    }


    public static void addstudent(Student[] array, Scanner input) {//scanner input is passed as a parameter
        try {//try is used if a false input is provided (Invalid Input)
            for (int i = 0; i < array.length; i++) {

                System.out.print("Student ID : ");
                int StudentID = input.nextInt();
                //array[i].setStudentMobile(StudentID);

                System.out.print("Student Name : ");
                String name = input.next();
                //array[i].setStudentName(name);


                System.out.print("Student Age : ");
                int age = input.nextInt();
                //array[i].setStudentAge(age);

                System.out.print("Student Address: ");
                String address = input.next();
                //array[i].setStudentAddress(address);

                System.out.print("Student Mobile : ");
                int mobile = input.nextInt();
                //array[i].setStudentMobile(mobile);
                array[StudentIndex] = new Student(StudentID, name, address, age, mobile);
                StudentIndex++;
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println(" Invalid Input ! ");
            menu.menu(array, array2);//display the menu
            initialise(array);//initialise the array again
        }
    }


    public static void addlecturer(Lecturer[] array2, Scanner input) {//scanner input is passed as a parameter
        try {//try is used if a false input is provided (Invalid Input)
            for (int i = 0; i < array2.length; i++) {

                System.out.print("Lecturer ID : ");
                int LecturerID = input.nextInt();
                array2[i].setLecturerID(LecturerID);

                System.out.print("Lecturer Name : ");
                String name = input.next();
                array2[i].setLecturerName(name);


                System.out.print("Lecturer Age : ");
                int age = input.nextInt();
                array2[i].setLecturerAge(age);

                System.out.print("Lecturer Address: ");
                String address = input.next();
                array2[i].setLecturerAddress(address);

                System.out.print("Lecturer Mobile : ");
                int mobile = input.nextInt();
                array2[i].setLecturerMobile(mobile);
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println(" Invalid Input ! ");
            menu.menu(array, array2);//display the menu
            initialise(array);//initialise the array again
        }
    }




/*
    public static void searchstudent(Student[] array, int StudentID) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getStudentID() == StudentID) {
                System.out.println("ID : " + array[i].getStudentID() + "Name : " + array[i].getStudentName() + " Coins Collected : " + array[i].getStudentAddress() + " Score Achieved : " + array[i].getStudentMobile());

            } else {
                System.out.println(" ");
                System.out.println(" Invalid Student ID ! ");
                menu.menu(array, array2);
                break;
            }
        }
    }*/

/*
    public static void main(String[] args) {
        initialise(array);
        menu.menu(array, array2);
    }


}  */