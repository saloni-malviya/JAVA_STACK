/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........JAVA PROGRAM FOR REVERSE A STACK..................
package stack_apna_college;
import java.util.*;
public class Reverse_Stack {
    public static void pushBotom(Stack<Integer>s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBotom(s,data);
        s.push(top);
    }
    
    //reverse stack
    public static void reverseSTCK(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        
        int top=s.pop();
        reverseSTCK(s);
        pushBotom(s,top);
    }
    
    //print stack
    public static void print(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    
    public static void main(String[]args)
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       // print(s);
        reverseSTCK(s);
        print(s);
    }
}
