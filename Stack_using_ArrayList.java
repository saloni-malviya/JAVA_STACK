/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........JAVA PROGRAM FOR IMPLEMENT STACK USING ARRAYLIST.................
package stack_apna_college;
import java.util.ArrayList;
public class Stack_using_ArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        
        //CHECK STACK IS EMPTY OR NOT
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        
        //PUSH IN STACK
        public static void push(int data)
        {
            list.add(data);
        }
        
        //POP IN STACK
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        //PEEK IN STACK
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    
    public static void main(String[]args)
    {
        Stack s=new Stack();
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
