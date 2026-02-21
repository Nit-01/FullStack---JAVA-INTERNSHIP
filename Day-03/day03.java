class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class day03 {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node temp = first;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}

// The program first creates three nodes with values 10, 20, and 30. Each node stores data and a reference 
// to the next node. The nodes are then connected using the next reference.
// The traversal starts from the first node and continues until the reference becomes null. During traversal, 
// the data of each node is printed on the screen.
