/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.............JAVA PROGRAM FOR VALID PARANTHESIS......................
package stack_apna_college;
import java.util.*;
public class Valid_Paranthesis {
    public static boolean isValid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                s.push(ch);
            }
            else
            {
                //closing bracket
                if(s.isEmpty())
                {
                    return false;
                    
                }
                if((ch==')' && s.peek()=='(') ||
                   (ch=='}' && s.peek()=='{') ||
                   (ch==']' && s.peek()=='['))
                {
                   s.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        String str="()[]{}";
        System.out.println(isValid(str));
    }
}
