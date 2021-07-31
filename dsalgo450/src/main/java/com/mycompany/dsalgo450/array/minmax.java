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
public class minmax {
    
    static class Pair
    {
        int min;
        int max;
    }
    
    static Pair getminmax(int arr[]) 
    {
    Pair minmax = new Pair();
    int i;
    if(arr.length %2==0)
    {
        if(arr[0]>arr[1])
        {
        minmax.max = arr[0];
        minmax.min = arr[1];
        }else
        {
        minmax.min = arr[0];
        minmax.max = arr[1];
        }
        i=2;
    }
    else{
        minmax.max=arr[0];
        minmax.min =arr[0];
        i=1;
    }
    
    while(i < arr.length -1)
    {
    if(arr[i] > arr[i+1])
        {
            if(arr[i]> minmax.max)
                {
                    minmax.max = arr[i];
                }
            if(arr[i+1] < minmax.min)
                {
                    minmax.min =arr[i+1];
                }
        }
    else{
            if(arr[i]< minmax.min)
                {
                    minmax.min = arr[i];
                }
            if(arr[i+1] > minmax.max)
                {
                    minmax.max =arr[i+1];
                }
    
    }
       i += 2;
    }
    return minmax;
    }           
           
    public static void main(String a[])
    {
         int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = getminmax(arr);
        
        System.out.println("\nMinimum element is"+ minmax.min);
        System.out.println("\nMaximum element is"+ minmax.max);
       
    }
}