public class List {
    private Node head;
    private class Node{
        private Node next;
        private int value;
    }
    public void reverse() {
        Node current = head;
        Node next = null;
        Node previous = null;
        while (current != null) {
            head = current;
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    }
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            head.next = head;
        }
        head = node;
    }
    public Node addBack(int value) {
        Node node = new Node();
        node.value = value;
        Node current = head;

        if (current == null) {
            head = node;
        } else {
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
        return node;
    }
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }
    public boolean contains(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }
}

