/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......JAVA PROGRAM FOR IMPLEMENT STACK USING COLLECTION FRAMEWORK.................
package stack_apna_college;
import java.util.*;
public class Stack_using_Collection_framework {
    public static void main(String[]args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
