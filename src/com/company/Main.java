package com.company;

public class Main
{
    public static void main(String[] args)
    {

        String subjects[] = {"CS 101", "MTH 101", "MGT 101"};

        int marks[] = {50, 30, 66};

        String[] results = getResults(subjects, marks);

        for (int i = 0; i < results.length; i++)
        {
            System.out.println(results[i]);
        }

    }

    static String[] getResults(String subject[], int marks[])
    {
        String results[] = new String[3];

        for (int i = 0; i < subject.length; i++)
        {
            if (marks[i] < 40)
            {
                results[i] = "Student is Fail In : " + subject[i] + " Due To Marks : " + marks[i];
            } else
            {
                results[i] = "Student is Pass In : " + subject[i];
            }
        }
        return results;
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

    static int getAverage(int marks[])
    {
        int average = 0;
        int sum = getSum(marks);
        average = sum / marks.length;
        return average;
    }
}
