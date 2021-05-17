package SinglyLinkList;

import java.util.List;

public class InsertionAtPosition {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private void insertPosition(int data, int pos){
        ListNode node = new ListNode(data);
        if(pos == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode prev = head;
            int count = 1;
            while(count < pos -1){
                prev = prev.next;
                count++;
            }

            ListNode current = prev.next;
            node.next = current;
            prev.next = node;
        }
    }

    public static void main(String[] args) {
        InsertionAtPosition iap = new InsertionAtPosition();
        iap.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(12);
        ListNode fourth = new ListNode(13);

        iap.head.next = second;
        second.next = third;
        third.next = fourth;

        iap.display();
        System.out.println("Inserting at position 2.");
        iap.insertPosition(14, 2);
        iap.display();

        System.out.println("Insertion at position 4.");
        iap.insertPosition(17, 4);

        iap.display();
    }
}
