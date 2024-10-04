package Week5.ArrayPractice;
// 1. java method to calculate sum & average of all elements of an integer Array size 10.

import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {

        int size = 10;
        int array1[] = new int[size];
        int array2[] = {10,20,40,23,45,56};
        char chArray[] = new char[size];
        char chArray2[] = {'H', 'e', 'L', 'l', 'o'};
        String s1 = "Hello";
        s1 = "hello world, how are you";
        String stringarray[] = new String[size];
        Scanner in = new Scanner(System.in);
        

        SumAvg(array2);
        
        // for(int i = 0;i<array2.length;i++)
        // {
        //     System.out.println(array2[i]);
        // }
        
        // System.out.println("Enter 10 integers for array1: ");
        // for(int i = 0;i<array1.length;i++)
        // {
        //     array1[i] = in.nextInt();
        // }

        // System.out.println(array1.length);
        // System.out.println(array2.length);
        // System.out.println(chArray.length);
        // System.out.println(chArray2.length);
        // System.out.println(s1.length());
        // System.out.println(stringarray.length);
    }
    public static void SumAvg(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / arr.length));
    }

}
