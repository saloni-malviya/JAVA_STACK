/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....................JAVA PROGRAM FOR IMPLEMENT STACK USING LINKEDLIST...................
package stack_apna_college;
import java.util.*;
public class Stack_using_Linkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
        static class Stack{
            static Node head=null;
            
            public static boolean isEmpty()
            {
                return head==null;
            }
            
             //push
            public static void push(int data)
            {
                Node newnode=new Node(data);
                if(isEmpty())
                {
                    head=newnode;
                    return; 
                }
                newnode.next=head;
                head=newnode;
            }
            
            //pop
            public static int pop()
            {
                int top=head.data;
                head=head.next;
                return top;
            }
            
            //peek
            public static int peek()
            {
                if(isEmpty())
                {
                    return -1;
                }
                return head.data;
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
}
