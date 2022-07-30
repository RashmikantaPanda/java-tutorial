package com.self.practice.dataStructure.LinkedList;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList1 {
    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node first=null;
    public Node last=null;


    public void addNodeAtEnd(int data) {  //insert at end
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }

    }

    public void addNodeAtBegining(int data) throws IOException {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void InsertAtAny(int pos,int data)
    {
        Node newNode=new Node(data);
        Node curr;
        Node prev = null;
        curr=first;
        int key=0,count=0;
        while(curr!=null&&key!=pos)
        {

            prev=curr;
            if(key!=pos)
                key++;
            curr=curr.next;
            if(curr==null)
            {
                System.out.println("Key not found ! Insertion Not Possible!!!");
            }
            // curr=curr.next;
        }
        prev.next=newNode;
        newNode.next=curr;

    }
    public void display()
    {
        Node current=first;
        if(first==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            System.out.println("Nodes of the linkedList are : ");
            while(current!=null)
            {
                System.out.print(current.data+"\t");
                current=current.next;
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[])throws Exception
    {
        LinkedList1 list1=new LinkedList1();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int value=0;
        int input;
        while(value!=4)
        {
            System.out.println("\n1.InsertAtBegeing \n2.InsertAtEnd \n5.InsertAtAny \n3.Display \n4.Exit");
            System.out.println("Enter your choice : ");
            value=Integer.parseInt(br.readLine());

            switch (value)
            {
                case 1: System.out.println("Enter the data value of the node to be insert : ");
                    input=Integer.parseInt(br.readLine());
                    list1.addNodeAtBegining(input);
                    break;
                case 2: System.out.println("Enter the data value of the node to be insert : ");
                    input=Integer.parseInt(br.readLine());
                    list1.addNodeAtEnd(input);
                    break;

                case 5: System.out.println("Enter the key &  data value of the node to be insert : ");
                    int key=Integer.parseInt(br.readLine());
                    input=Integer.parseInt(br.readLine());
                    list1.InsertAtAny(key,input);
                    break;

                case 3 : list1.display();
                    break;
                case 4 : value=4;
                    break;
                default:System.out.println("Wrong Choice");
                    break;
            }
        }
    }

}
