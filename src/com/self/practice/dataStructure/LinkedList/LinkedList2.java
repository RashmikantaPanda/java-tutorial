package com.self.practice.dataStructure.LinkedList;


public class LinkedList2 {
    public class Node{
        int data;
       Node next;

        public Node(int d)
        {
            this.data=d;
            this.next=null;
        }

    }
   Node head=null;
   Node curr;
    public void InsertEnd( int data)
    {
        Node newNode=new Node(data);
//       newNode.data=data;
//       newNode.next=null;
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {

            curr=newNode;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void display()
    {
        curr=head;
        while(curr.next!=null)
        {
            System.out.println(curr.data+"  ");
        }
    }

    public static void main(String args[])
    {
        LinkedList2 list2=new LinkedList2();
        list2.InsertEnd(45);
        list2.InsertEnd(75);
        list2.InsertEnd(85);
        list2.InsertEnd(15);
        list2.InsertEnd(95);
        list2.InsertEnd(35);
        list2.display();
    }
}

