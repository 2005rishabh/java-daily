package linkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return; 
        
        node.val = node.next.val;  
        node.next = node.next.next; 
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original list:");
        printList(head);

        Solution solution = new Solution();
        solution.deleteNode(head.next); 

        System.out.println("List after deleting node 5:");
        printList(head);
    }
}
