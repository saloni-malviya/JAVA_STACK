/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........JAVA PROGRAM FOR REVERSE STRING USING STACK...............
package stack_apna_college;
import java.util.*;
public class Reverse_String_using_Stack {
    public static String reverseStr(String str)
    {
        Stack<Character> s=new Stack<>();
        int index=0;
        while(index<str.length())
        {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
        
    }
    public static void main(String[]args)
    {
        String s="abc";
        String r=reverseStr(s);
        System.out.println(r);
    }
}
