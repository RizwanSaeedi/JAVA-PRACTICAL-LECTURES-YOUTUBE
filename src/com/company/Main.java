package com.company;

public class Main
{

    public static void main(String[] args)
    {

        String subjects[] = {"CS 101", "MTH 101", "MGT 101"};

        int marks[] = {5, 10, 5};
        System.out.println("Subjects : Marks");

        int answer = getAverage(marks);
        System.out.println(answer);

        //for (int i = 0; i < 3; i++)
        //{
            //System.out.println(subjects[i] + " : " + marks[i]);
        //}


    }

    static int getSum(int marks[])
    {
        int sum = 0;
        for (int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
        }
        return sum;
    }

    static int getAverage(int marks[]){
        int average = 0;
        int sum = getSum(marks);
        average = sum / marks.length;
        return  average;
    }
}
