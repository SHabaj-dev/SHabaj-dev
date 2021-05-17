package SinglyLinkList;

public class DeleteLFirstNode {
    Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void deleteFirstNode(){
        Node current = head.next;
        head = current;
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
        DeleteLFirstNode dfn = new DeleteLFirstNode();
        dfn.head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(12);
        Node fourth = new Node(6);

        dfn.head.next = second;
        second.next = third;
        third.next = fourth;

        dfn.display();
        dfn.deleteFirstNode();
        dfn.display();
    }
}
