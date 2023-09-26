package com.mycompany.project1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        
        int n,i,first,last,count,s; int arr[];
        
        Scanner xyz = new Scanner(System.in);
        n = xyz.nextInt();
        arr = new int[n];
        for(i=0;i<n;i++)
        {
        arr[i]=xyz.nextInt();
        }
        count=0;
        for(first=0;first<n;first++)
        {
           s=0;
           for(last=first;last<n;last++)
           {
               s+=arr[last];
               if(s<0)
               {
                   count++;
               }
           } 
        }
        System.out.println(count);
        xyz.close();  
    }
    
}
