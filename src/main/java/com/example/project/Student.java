package com.example.project;

public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores = 0.0;
    private int testScoreCount = 0;
    private double highestTestScore = 0.0;
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore; //random double number
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        accumulatedTestScores = newTestScore + accumulatedTestScores;
        highestTestScore = newTestScore;
        testScoreCount++;
        
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
       double avg = averageTestScore();
        if (avg >= 65){
            return true;
        }else 
        return false;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
    double averageTestScore = accumulatedTestScores/testScoreCount;
        return averageTestScore;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 