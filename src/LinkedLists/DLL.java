package LinkedLists;

public class DLL {

    private Node head;
    private Node tail;
    public int size;

    public DLL(){
        this.size = 0;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
//        System.out.println();
//        System.out.println("Print in reverse");
//        while(last!=null){
//            System.out.print(last.value+" -> ");
//            last = last.prev;
//        }
//        System.out.print("START");
    }


    public void insertFirst(int val){
//        if(head == null){
//            head = tail;
//        }
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;

        size++;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
//            node.prev = null;
//            head = node;
//            return;
        }
        Node node = new Node(val);
        Node last = head;
        for (int i = 1; i < size; i++) {
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev = last;
        size++;
    }

    public void insertAtPos(int val , int pos){
        if(pos == 0){
            insertFirst(val);
        }
        if(pos==size){
            insertLast(val);
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    private class Node{
        int value;
        Node next;
        Node prev;


        private Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        private Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}
