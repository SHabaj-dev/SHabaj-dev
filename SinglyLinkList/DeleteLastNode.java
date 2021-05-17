package SinglyLinkList;


public class DeleteLastNode {
    private Node head;

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
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void deleteLastNode(){
        Node current = head;
        Node prev = null;
        while (null != current.next){
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        DeleteLastNode dln = new DeleteLastNode();
        dln.head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(12);
        Node fourth = new Node(6);

        dln.head.next = second;
        second.next = third;
        third.next = fourth;

        dln.display();
        dln.deleteLastNode();
        dln.display();
    }
}
