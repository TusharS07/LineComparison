package com.bridgelabz.lineComparisonProblemUsingOOPS;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        //create obj for line class
        //for line 1
        Line line1 = new Line();
        line1.p1 = new Point(); //create obj for line one start points
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Co-ordinator For Line-1 (x,y) :- ");
        line1.p1.x = sc.nextInt(); //get (x,y) coordinator
        line1.p1.y = sc.nextInt(); //get (x,y) coordinator

        line1.p2 = new Point(); //create obj for line one start points
        System.out.println("Enter End Co-ordinator For Line-1 (x,y) :- ");
        line1.p2.x = sc.nextInt(); //get (x,y) coordinator
        line1.p2.y = sc.nextInt(); //get (x,y) coordinator

        System.out.println();
        //Length of line one
        Line.length1 = line1.getLenght();
        System.out.println("Length of Line 1 = " + Line.length1);


        System.out.println();
        //create obj for line class
        //for line 2
        Line line2 = new Line();
        line2.p1 = new Point(); //create obj for line Two start points
        System.out.println("Enter Start Co-ordinator For Line-2 (x,y) :- ");
        line2.p1.x = sc.nextInt(); //get (x,y) coordinator
        line2.p1.y = sc.nextInt(); //get (x,y) coordinator

        line2.p2 = new Point(); //create obj for line Two start points
        System.out.println("Enter End Co-ordinator For Line-2 (x,y) :- ");
        line2.p2.x = sc.nextInt(); //get (x,y) coordinator
        line2.p2.y = sc.nextInt(); //get (x,y) coordinator

        System.out.println();
        //Length of line one
        Line.length2 = line2.getLenght();
        System.out.println("Length of Line 2 = " + Line.length2);

        System.out.println();


        //check equality of lines and compare botth lines
        //use if else to check line are equals or not and greter or not

        Line line = new Line();
        line.compareLines();


    }
}
