package LinkedLists;

public class MainDLL {
    static void main(String[] args) {
        DLL list = new DLL();
//        list.insertFirst(12);
//        list.insertFirst(42);
//        list.insertFirst(32);
//        list.insertFirst(2);
        list.insertLast(21);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.display();
        System.out.println();
        list.insertAtPos(99,3);
        list.display();

    }
}
