package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Lecturer array_lec[] = new Lecturer[1];
    static Student arr_Student[] = new Student[1];
    static Module arr_Module[] = new Module[2];
    static Degree arr_Degree[] = new Degree[1];
    static  Marks array_Marks[] = new  Marks[1];
    static int StudentIndex;
    static int LecturerIndex;
    static int ModuleIndex;
    static int MarksIndex;

   private static Scanner sc = new Scanner(System.in);//scanner input

    public static void main(String[] args) {
        menu();
    }

    public static void menuOptions() {
        System.out.println("\t \t\t\t ~~~~~~~~~~~~~~~ WELCOME TO UNIVERCITY REGISTATION ~~~~~~~~~~~~~~~~~ ");
        System.out.println("                                                                          ");
        System.out.println("\t \t\t\t -------------------------'S' to Add student------------------------ ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t -------------------------'L' to add lecturer ---------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t -------------------------'D' to Add degree ------------------------ ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'M' Add modules--------------------------");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'VS' view students ---------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'VL' view lecturer ---------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'VM' view modules----------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'VD' view Degrees----------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ------------------'ML' to selsect modules for degree--------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ------------------'VL' to add students for degree------------------ ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ---------------------------'MR' Add marks-------------------------- ");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t ----------------------'CM' to Calculate average---------------------");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t -----------------------------'E' to Exit----------------------------");
        System.out.println("\t \t\t\t|                                                                   |");
        System.out.println("\t \t\t\t --------------------------------------------------------------------");
    }

    public static void menu(){

        menuOptions();
        System.out.println(" Please enter a number to proceed >>>> ");

        do {
            String input = sc.next();//gets the input from the user

            switch (input) {

                case "S":
                    AddStudent();//add student method is called
                    break;

                case "L":
                    AddLecturer();//add lecturer method is called
                   break;

                case "D":
                    AddDegree();//add Degree method is called
                    //  menu(array, array2);//after completion display the menu again
                    break;

                case "M":
                    AddModule();//add Module method is called
                    break;

                case "ML":
                    AssignModules();//add AssignModules method is called
                    break;

                case "VS":
                    viewstudents();//add viewstudents method is called
                    break;

                case "VD":
                    viewdegrees();//add viewDegree method is called
                    break;

                case "VL":
                    viewlecturer();//add viewLecturer method is called
                    break;

                case "VM":
                    viewModules();//add viewModules method is called
                    break;

                case "MR":
                    AddMarks();//add AddMarks method is called
                    break;

                case "CM":
                    calculateMarks();//add calculateMarks method is called
                    break;

                default://executes if an invalid input is provided
                    System.out.println(" ");
                    System.out.println(" Invalid Input !");//displays
                    menu();//returns to the menu
            }
            menuOptions();
            System.out.println(" Please enter a number to proceed >>>> ");
        }
        while (sc.hasNext());
    }


    public static void AddStudent(){

        System.out.print(" ");
        System.out.print("\t\t---------- Enter Student Details -----------");
        System.out.print(" ");
        System.out.print("\n\t\t\t      Student ID : ");
        int ID = input.nextInt();
        System.out.print("\t\t\t      Student Name : ");
        String name = input.next();
        System.out.print("\t\t\t      Student Address: ");
        String address = input.next();

    Student StuDetails = new Student(ID,name,address );
    arr_Student[StudentIndex] = StuDetails;
    StudentIndex++;
    }



    public static void  AddLecturer(){

        System.out.print(" ");
        System.out.print("\t\t---------- Enter Lecturer Details -----------");
        System.out.print(" ");
        System.out.print("\n\t \t\t      Lecturer ID : ");
        String ID = input.next();
        System.out.print("\t \t\t     Lecturer Name : ");
        String name = input.next();
        System.out.print("\t \t\t      Module ID : ");
        String ModuleID = input.next();
        System.out.print("\t \t\t      Module Name :");
        String ModuleName = input.next();
        System.out.print("\t \t\t      Address :");
        String address = input.next();


        Lecturer LecDetails = new Lecturer(ID,name, ModuleName, ModuleID, address);
        array_lec[LecturerIndex] = LecDetails;
        LecturerIndex++;
    }


    private static int AssignModules() {
        if(arr_Degree == null)
        {
            System.out.println("\t \t Please add degrees first");
            return 0;
        }

        System.out.println("\t \t Please select a Degree:");
        for (Degree d :arr_Degree){
            System.out.println(d.getDegreeId() + ". " + d.getDegreeName());
        }

        int degreeLocation = sc.nextInt() - 1;
        Module module;

        while (true){
            System.out.println("Select module:");
            try{
            for(Module m : arr_Module){
                System.out.println(m.getModuleId() + ". " + m.getModuleName());
            }
            }catch (Exception ex){
                //end of avaliable items
                System.out.println("");
            }
            System.out.println("Enter module code");
            String moduleCode = input.nextLine();
            module = GetModule(moduleCode);

            if(module != null){
                arr_Degree[degreeLocation].AddModule(module);
            }

            System.out.println("Do you want to assign another module? (Yes - 1/ No - 0): ");
            if(sc.nextInt() == 0){
                break;
            }
        }

        return 1;
    }


    private static void AddModule() {
        String moduleId="null";
        String moduleName="null";
        Lecturer moduleLeader= null;


        if(arr_Module == null)
        {
            System.out.println("How many modules do want to add?");
            arr_Module = new Module[sc.nextInt()];
        }

        for (int i = 0; i < arr_Module.length; i++){
            if(arr_Module[i] == null)
            {
                System.out.print(" ");
                System.out.print("\t\t---------- ADD MODULES -----------");
                System.out.print(" ");
                System.out.print("\n \t \t\t         Module ID: ");
                String ID = input.next();
                System.out.println("\t \t\t Please enter Module name: " );
                 moduleName = input.next();
                System.out.println("\t \t\t Please enter Module Leader id: " );
                 String id = input.next();


            if(i == (arr_Module.length - 1))
                System.out.println("\t \t\t Module array is full");
        }

        Module AddModule = new Module(moduleId, moduleName, moduleLeader);
        arr_Module[ModuleIndex] = AddModule;
        ModuleIndex++;
    }}


    private static Module GetModule(String code){
        for(Module m : arr_Module){
            if(m.getModuleId().equals(code)){
                return m;
            }
        }
        return null;
    }


    private static void AddDegree() {
        if(arr_Degree == null)
        {
            System.out.println("How many degrees do want to add?");
            arr_Degree = new Degree[sc.nextInt()];
        }

        for (int i = 0; i < arr_Degree.length; i++){
            if(arr_Module == null)
            {
                System.out.println("Please add modules first");
                break;
            }

            if(arr_Degree[i] == null)
            {
                System.out.println("Please enter degree name: ");
                arr_Degree[i] = new Degree((i + 1), sc.next(), arr_Module.length);
                System.out.println("Do you want to add another degree? (Yes - 1/ No - 0): ");
                if(sc.nextInt() == 0)
                    break;
            }

            if(i == (arr_Degree.length - 1))
                System.out.println("Degree array is full");
        }
    }


    public static void  AddMarks(){

        System.out.print(" ");
        System.out.print("\t \t---------- Enter Marks -----------");
        System.out.print(" ");
        System.out.print("\n\t \t\t     Student ID : ");
        String ID = input.next();
        System.out.print("\t \t\t      Module ID : ");
        String ModuleID = input.next();
        System.out.print("\t \t\t     cw Marks :");
        int cwMarks = input.nextInt();
        System.out.print("\t \t\t      ICT marks :");
        int ICTMarks = input.nextInt();
        System.out.print(" ");


        Marks AddMarks = new Marks(ID, ModuleID,cwMarks,ICTMarks);
        array_Marks[MarksIndex] = AddMarks;
        MarksIndex++;
    }

    private static void viewdegrees() { //view lecturer

        System.out.println(" ");
        System.out.println("\t \t-------------------VIEW DEGREES------------------------");
        if (arr_Degree != null) {
            for (Degree d : arr_Degree) {
                System.out.println("\t\t\tDegree ID : " + d.getDegreeId() + "\n \t\t\t  Degree name : " + d.getDegreeName());
                System.out.println(" ");
            }
        } else {
            System.out.println("\t \t\t no degrees to be viewed.");
        }
    }


    private static void viewModules() { //view module
        System.out.println(" ");
        System.out.println("\t \t ------------------MODULE VIEW---------------------");
        if (arr_Module != null) {
            for (Module module : arr_Module) {

                System.out.println("\t \t\t Module ID : " + module.getModuleId() + "\n \t\t\t Module name : " + module.getModuleName());
                System.out.println(" ");
            }
        } else {
            System.out.println("\t \t\t No modules to be viewed.");
        }

    }


    private static void viewstudents() {//view student

        System.out.println(" ");
        System.out.println("\t \t\t -----------------STUDENT VIEW-------------------");
        if (arr_Student != null) {
            for (Student st : arr_Student) {
                System.out.println("\t \t\t student ID : " + st.getStudentID() + "\n \t \t\t Student name : " + st.getName());
                System.out.println(" ");
            }
        } else {
            System.out.println("\t \t\t No students to be viewed.");
        }

    }


    private static void viewlecturer() {


        System.out.println(" ");
        System.out.println("\t \t\t --------------- LECTURER VIEW -------------------");
        if (array_lec != null) {//view lecturer
            for (Lecturer d : array_lec) {
                System.out.println("\t \t\t lecturer ID : " + d.getLecturerID() + "\n \t \t\t Lecturer name : " + d.getName());
                System.out.println(" ");
            }
        } else {
            System.out.println("\t \t\t No lecturers to be viewed.");
        }

    }

    private static int calculateMarks() {

        System.out.println(" ");
        System.out.println("\t \t\t ----------------- CALCULATE MARKS --------------------");

        if (array_Marks!= null) {
            Student student;

            for (Student st : arr_Student) {
                System.out.println("\n \t \t\t StudentID :  " + st.getStudentID() + "\n \t \t\tStudent name : " + st.getName());


                Marks marks;
                for (Marks mk :array_Marks) {
                    int average = (mk.getCwMarks() + mk.getICTMarks()) / 2;

                    System.out.println(" \t \t\t Course Work :  " + mk.getCwMarks() + "\n \t \t\t Examination : " + mk.getICTMarks() + "\n \t \t\t Average : " + average);
                    System.out.println(" ");

                    BufferedWriter writer = null;
                    try {
                        File filetoWrite  = new File("file.txt");
                        writer = new BufferedWriter(new FileWriter(filetoWrite));
                        writer.write("StudentID : " + st.getStudentID() +"  |  "+ "\t Student name : " +st.getName()  +"  |  "+ "\t Course Work : "+  mk.getCwMarks()+"  |  "+ "  |  "+ "\t ICT : " + mk.getICTMarks()+ "  |  "+  "\t Average : " + average);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            // Close the writer regardless of what happens...
                            writer.close();
                        } catch (Exception e) {
                        }
                    }


                }
            }
        }
        return 0;
    }

    }
