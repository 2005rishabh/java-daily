package linkedList;

class DLLNode {
    int data;
    DLLNode next, prev;

    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class revDLL {
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) return head;

        DLLNode current = head;
        DLLNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        return temp.prev;
    }

    public static void printDLL(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.prev = head;
        head.next.next = new DLLNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DLLNode(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original DLL:");
        printDLL(head);

        revDLL solution = new revDLL();
        head = solution.reverseDLL(head);

        System.out.println("Reversed DLL:");
        printDLL(head);
    }
}

