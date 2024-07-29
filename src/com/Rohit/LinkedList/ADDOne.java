package com.Rohit.LinkedList;

public class ADDOne {
    /* Linked list node */
    static class Node {
        int data;
        Node next;
    }
    /* Function to create a new node with given data */
    static Node newNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    private static Node reverseList(Node head) {
        if (head==null) return  null;
        if (head.next==null) return head;
        Node newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    // This function mainly uses addOneUtil().
    static Node addOne(Node head) {
        // reverse list
       Node rev=reverseList(head);

       Node temp=rev;
       Node temp2=null;
        int carry=1;
        int sum;

        while (temp!=null){
            sum=temp.data+carry;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp.data=sum;
            temp2=temp;
            temp=temp.next;
        }
        if (carry>0){
            temp2.next= newNode(carry);
        }
        return  reverseList(rev);
    }


    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    /* Driver code */
    public static void main(String[] args)
    {
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(8);

        System.out.print("List is ");
        printList(head);

        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
    }
}