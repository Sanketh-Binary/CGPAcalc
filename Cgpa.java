package com.company;

import java.sql.Array;
import java.util.Scanner;

public class Cgpa {

    public int num_of_sub; // number of subjects
    public int subPointsArr[]; // Array to store subject points
    public float  credArr[]; //Array to store Credits
    public float total_Credits=0;

    Cgpa(int n){             //   initializing........Subjects,and Size of Arrays

        this.num_of_sub=n;
        subPointsArr =new int[n];
        credArr=new float[n];
    }

    public float calculateCGPA(){        //calculating cgpa

        float resultCgpa=0;

        for(int i=0;i<num_of_sub;i++){

                resultCgpa+=subPointsArr[i]*credArr[i];

            }

        float CgpaG=resultCgpa/total_Credits;

        return CgpaG;
    }
     public void printSubPoints(){

         for(int i=0;i<num_of_sub;i++){
             System.out.print( subPointsArr[i] );
         }
     }

    public void printCredits(){

        for(int i=0;i<num_of_sub;i++){
            System.out.print(credArr[i]+ " ");
        }
    }


    public int printNoofSubjects(){
       return this.num_of_sub;
    }

     public  static void main(String args[]){


         Scanner s=new Scanner(System.in);
         System.out.println("-------------------------Welcome-------------------------------");
         System.out.print("Enter number of Subjects :");
         int n=s.nextInt();
         System.out.println("---------------------------WAIT--------------------------------------");

         Cgpa C=new Cgpa(n);
         System.out.println("No of Subjects are = "+ C.printNoofSubjects());
         System.out.println("Enter Each Subject Points OUT of 10");

         for (int i=0;i<C.num_of_sub;i++){
             System.out.print("Enter Subject "+ (i+1) +" = ");
             C.subPointsArr[i]=s.nextInt();  //reading points
         }

         System.out.println("---------------------------WAIT--------------------------------------");

         System.out.println("Please Enter Credits for Each Subject ");;

         for (int i=0;i<C.num_of_sub;i++){
             System.out.print("Enter Subject "+ (i+1) +" Credits = ");
             C.credArr[i]=s.nextFloat();         //reading Credits
             C.total_Credits+=C.credArr[i];     //Calculating Total Credits and Storing
          }

       System.out.println("Calculating Cgpa Based on the details provided......");

         System.out.println("Your CGPA is =  "+C.calculateCGPA());


     }




}
