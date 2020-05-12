package Linkedlist;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class LinkedList {

  //head of list
  static Node head;

  //thsi inner class is used to create a node
  static class Node {
    int data;
    Node next;
    Node(int x) {
      data = x;
      next = null;
    }
  }

  static class List {
    void insertBegin(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head      = temp;
    }

    void print() {
      Node curr = head;
      while (curr != null) {
        System.out.print(curr.data);
        curr = curr.next;
      }
    }
  }

  public static void main(String[] args) {
    List l = new List();
    l.insertBegin(20);
    l.insertBegin(10);
    l.insertBegin(5);
    l.print();
  }
}
