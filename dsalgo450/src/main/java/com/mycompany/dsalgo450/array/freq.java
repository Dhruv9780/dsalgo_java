/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dsalgo450.array;

/**
 *
 * @author Dhruv
 */
public class freq {

    static void printFreq(int arr[] , int n)
    {
        int count=1,i=1;
      while(i<n)
      {
      while(i<n && arr[i]==arr[i-1])
      {
      count++;
      i++;
      }
      System.out.print(arr[i-1]+" : "+count+" =>");
      count=1;
      i++;
      }
    }
    public static void main(String arg[])
    {
        int arr[] = {10, 10, 20, 30, 30, 30};

         printFreq(arr, arr.length);  
    }
}
