/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........JAVA PROGRAM FOR DUPLICATE PARANTHESIS.....................
package stack_apna_college;
import java.util.*;
public class Duplicate_Paranthesis {
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            //closing
            if(ch==')')
            {
                int count=0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                    
                }
                if(count<1)
                {
                    return true;
                }
                
            }
            else
            {
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String[]args)
    {
        String str1="(a+b)";
        String str2="(((a+b)))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
