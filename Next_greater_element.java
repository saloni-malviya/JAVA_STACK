/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........JAVA PROGRAM FOR PRINT NEXT GREATER ELEMENT........................

package stack_apna_college;
import java.util.*;
public class Next_greater_element {
    public static void main(String[]args)
    {
        Stack<Integer> s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextG[]=new int[arr.length];
        
       
        for(int i=arr.length-1;i>=0;i--)
        {
            //1st step
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            //2nd step
            if(s.isEmpty())
            {
                nextG[i]=-1;
            }
            else
            {
                nextG[i]=arr[s.peek()];
            }
            //3rd step
            s.push(i);
        }
        //print nextGreater
        for(int i=0;i<nextG.length;i++)
        {
            System.out.print(nextG[i]+" ");
        }
        System.out.println();
    }
}
