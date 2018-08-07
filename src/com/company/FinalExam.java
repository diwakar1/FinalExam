package com.company;

/**
 * Created by diwakarsharma on 8/6/18.
 */
public class FinalExam extends GradeActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        double numericScore;
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach =100/numQuestions;
        numericScore =100-(numMissed*pointsEach);

        setScore(numericScore);


    }

    public double getPointsEach()

    {
        return pointsEach;
    }

    public int getNumMissed(){
        return numMissed;
    }
    }



