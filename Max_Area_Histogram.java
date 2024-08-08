/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..Given an array of integers heights representing the histograms bar heights where the width
//  of each bar is 1.return area of largest rectangle in the histogram.
package stack_apna_college;
import java.util.*;
public class Max_Area_Histogram {
    public static void maxarea(int arr[])
    {
        int Areaofmax=0;
        int nsr[] =new int[arr.length];
        int nsl[] =new int[arr.length];
        Stack<Integer>s=new Stack<>();
        
        //next smaller right
        for(int i=arr.length-1;i>=0;i--)
        {
        while(!s.isEmpty() && arr[s.peek()]>=arr[i])
        {
            s.pop();
        }
        if(s.isEmpty())
        {
            nsr[i]=arr.length;
        }
        else
        {
            nsr[i]=s.peek();
        }
        s.push(i);
    }
        
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        
        //current area
        //width=j-i-1;(nsr[i]-nsl[i]-1)
        for(int i=0;i<arr.length;i++)
        {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currarea=height*width;
            Areaofmax=Math.max(currarea,Areaofmax);
            
        }
        System.out.println("Max area of histogram is:"+Areaofmax);
        
        
    }
    public static void main(String[]args)
    {
        int arr[]={2,1,5,6,2,3};
        maxarea(arr);
    }
}
