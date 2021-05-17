package SinglyLinkList;

import java.util.Scanner;

public class SearchElement {
    Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public boolean search(int ele){
        Node current = head;
        boolean isFound = false;
        while( current != null){
            int count = 0;
            if(current.data == ele){
                isFound = true;
            }
            current = current.next;
        }
        return isFound;
    }

    public static void main(String[] args) {
        SearchElement se = new SearchElement();

        se.head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(12);
        Node fourth = new Node(5);

        se.head.next = second;
        second.next = third;
        third.next = fourth;
        se.display();
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        System.out.println(se.search(search));
    }
}
