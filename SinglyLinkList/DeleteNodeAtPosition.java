package SinglyLinkList;

public class DeleteNodeAtPosition {
    Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data =data;
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

    public void deleteAtPos(int pos){
        int count = 1;
        if(pos == 1){
            head = head.next;
        }else{
            Node prev = head;
            while(count < pos -1){
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next = current.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeAtPosition dnap = new DeleteNodeAtPosition();

        dnap.head = new Node(10);
        Node second = new Node(5);
        Node third = new Node(9);
        Node fourth = new Node(11);

        dnap.head.next = second;
        second.next = third;
        third.next = fourth;

        dnap.display();
        int pos = 2;
        dnap.deleteAtPos(pos);
        dnap.display();
    }
}
