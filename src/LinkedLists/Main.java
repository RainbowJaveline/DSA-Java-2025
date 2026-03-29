package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        System.out.println(node.size);

//        list.insertFirst(12);
//        list.insertFirst(25);
//        list.insertFirst(27);
//        list.insertFirst(55);
//        list.insertFirst(90);

        list.insertLast(12);
        list.insertLast(24);
        list.insertLast(33);
        list.insertLast(45);

        list.insertAtPos(19,3);
        list.insertRec(77,2);
        list.traverse();
        System.out.println();
//        System.out.println(list.delFirst());
//        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        list.traverse();
        System.out.println();
        System.out.println(list.size);
//        System.out.println(node.size);
    }



}