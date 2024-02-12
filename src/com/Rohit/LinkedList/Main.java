package com.Rohit.LinkedList;

public class Main {
    public static void main(String[] args) {
//LinkedList list = new LinkedList();
//        list.insertEnd(0);
//        list.insertFirst(3);
//        list.insertFirst(9);
//        list.insertFirst(11);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertEnd(20);
//        list.insertEnd(33);
//        list.insertEnd(99);
//        list.insertAt(111,-1);
//
//        list.display();
//        System.out.println(list.size());
////       System.out.println(list.getElement(8));
////        list.delete(0);
//        list.display();
//        System.out.println(list.size());
//           System.out.println(list.deleteFirst());
//           System.out.println(list.deleteLast());
////           list.delete(8);
//           list.display();
//           System.out.println(list.size());
////           System.out.println(list.find(99));
        DoublyLinkedDataStructure list = new DoublyLinkedDataStructure();
        list.insertTail(55);
        //list.displayByH();
        list.insertHead(3);
        list.insertHead(4);
        list.insertHead(2);
        list.insertHead(9);
//        list.insertTail(55);
        list.insertAtIndx(3,1);
       // 9 2 4 3 55
        list.displayByH();
//        System.out.println("\n"+list.deleteFirst());
//        list.displayByH();
//        System.out.println("\n"+list.deleteLast());
//        list.displayByH();
        System.out.println("\n"+list.size());
        System.out.println("\n"+list.deleteIndex(5));
        list.displayByH();
        System.out.println();
        System.out.println(list.getElement(3));
        System.out.println(list.find(1));
       // list.displayByT();
//        list.insertEnd(0);
//        list.insertFirst(9);
//        list.insertFirst(11);
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertEnd(20);
//        list.insertEnd(33);
//        list.insertEnd(99);
//        list.insertAt(111,-1);

    }
}
