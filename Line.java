package com.bridgelabz.lineComparisonProblemUsingOOPS;

public class Line {
    Point p1;
    Point p2;
    static float length1;
    static float length2;


    float getLenght() {
        return (float) Math.sqrt( (p2.x - p1.x) ^ 2 + (p2.y - p1.y) ^ 2 );
    }

    void compareLines() {
        //check equality of lines and compare botth lines
        //use if else to check line are equals or not and greter or not

        if (length1 == length2) {
            System.out.println("Line 1 and Line 2 both are Equal ");
        }
        else if (length1 > length2) {
            System.out.println("Line 1 is Grater than Line 2 ");
        }
        else {
            System.out.println("Line 2 is Grater Then Line 1 ");
        }

    }
}
