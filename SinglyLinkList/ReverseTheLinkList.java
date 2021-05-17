package SinglyLinkList;

public class ReverseTheLinkList {
    Node head;

    private static class Node{
        int data;
        Node next;

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

    public void revers(Node head){
        if(head == null){
            System.out.println(head);
        }
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        System.out.println(prev);
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        head.next = second;
        second.next = third;
        third.next = fourth;

        ReverseTheLinkList rtll = new ReverseTheLinkList();
        rtll.display();
        rtll.revers(head);


    }
}
