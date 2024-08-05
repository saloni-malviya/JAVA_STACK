/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........JAVA PROGRAM FOR PUSH AT THE BOTTOM OF STACK (O(N))................
package stack_apna_college;
import java.util.*;
public class Push_bottom_ofStack {
    public static void pushBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s,data);
        s.push(top);
        
    }
    public static void main(String[]args)
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
           
        }
    }
}
