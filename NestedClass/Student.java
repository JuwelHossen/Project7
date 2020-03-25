package NestedClass;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Student {



    public void displayStudentDetails() throws IOException {

        String nameStudent;
        int studentID;
        double studentGpa;
        String studentMajor;

        Name name =new Name();
        StudentId sid= new StudentId();
        Gpa gpa = new Gpa();
        Major major = new Major();

        nameStudent=name.getName();
        studentID=sid.id();
        studentGpa=gpa.getGpa();
        studentMajor=major.getMajor();
        System.out.println("");

        System.out.println("STUDENT NAME : "+ nameStudent);
        System.out.println("STUDENT ID:    "+ studentID);
        System.out.println("STUDENT GPA:   "+studentGpa);
        System.out.println("STUDENT MAJOR: "+ studentMajor);


    }
  //class 1
    private class Name
    {
        String studentName;
        Scanner input = new Scanner(System.in);


       public String getName() throws IOException
       {
           System.out.println("ENTER STUDENT NAME:");
           studentName=input.nextLine();
           return studentName;
       }



    }
    //class 2
    private class StudentId
    {
        Scanner input = new Scanner(System.in);
        private int studentid;

        public int id() throws IOException {
            System.out.println("ENTER STUDENT ID NUMBER :");
            studentid=input.nextInt();

            return studentid;

        }

    }
    //class 3
    private class Gpa
    {
        double gpa;
        Scanner input = new Scanner(System.in);

        public double getGpa()throws IOException
        {
            System.out.println("ENTER STUDENT GPA :");
            gpa=input.nextDouble();
            return gpa;
        }


    }

    //class 4
    private class Major
    {
        private String major;
        Scanner input = new Scanner(System.in);

        public String getMajor()throws IOException
        {
            System.out.println("ENTER STUDENT MAJOR :");
            major=input.nextLine();
            return major;
        }




    }



}
