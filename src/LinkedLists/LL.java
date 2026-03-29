package LinkedLists;

import com.sun.jdi.Value;

public class LL {

    private Node head;
    private Node tail;
    public int size;

    public LL (){
        this.size = 0;
    }

    public void traverse(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
//        Node node = new Node(val);
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPos(int val , int pos){
        if(pos==0){
            insertFirst(val);
            return;
        } else if (pos==size) {
            insertLast(val);
            return;
        }else{
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val,temp.next);
            temp.next = newNode;
            size++;
        }
    }

    //Insert Using recursion
    public void insertRec(int value , int pos){
        head = insertRec(value , pos , head);
    }
    private Node insertRec(int value , int pos , Node temp){
        if(pos == 0){
            Node node = new Node(value , temp);
            size++;
            return node;
         }

        temp.next = insertRec(value , pos-1 , temp.next);
        return temp;
    }

    public int delFirst(){
        int val = head.value;
        head = head.next;
        size--;

        if(head == null){
            tail = null;
            System.out.println("List is Empty");
        }
//        assert head != null;
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next=null; // important thing to do
        size--;
        return val;
    }

    public int delete(int idx){
        if(idx == size){
            return deleteLast();
        }
        if(idx == 0){
            return delFirst();
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }


    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }

        private Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
