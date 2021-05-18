package SinglyLinkList;

public class FindingTheMiddleOfLinkList {
    Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node middle(Node head){
        if(head == null){
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return  slowPtr;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        FindingTheMiddleOfLinkList fm = new FindingTheMiddleOfLinkList();

         fm.head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(1);
        Node fourth = new Node(11);
//        Node fifth = new Node(15);

        fm.head.next = second;
        second.next = third;
        third.next = fourth;
//        fourth.next = fifth;

        fm.display();

        Node Middle = fm.middle(fm.head);
        System.out.println(Middle.data);


    }
}
