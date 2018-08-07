package com.company;

import java.util.Scanner;

/**
 * Created by diwakarsharma on 8/6/18.
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int questions;
        int missed;
        FinalExam exam;
        System.out.println("How many questions in the final exam");
        questions= input.nextInt();
        System.out.println("how many questions did the student missed?");
        missed= input.nextInt();
        exam = new FinalExam( questions,missed);

        System.out.println("Each question counts "+ exam.getPointsEach());
        System.out.println("the exam score is: "+ exam.getScore());
        System.out.println("the final grase is "+ exam.getGrade());


       /* double testScore;
        GradeActivity gradeActivity =new GradeActivity();
        System.out.println("Enter numeric test scoe: ");
        testScore = input.nextDouble();
        gradeActivity.setScore(testScore);
        System.out.println(" the grade has for test is  "+ gradeActivity.getGrade());
*/
    }
}
