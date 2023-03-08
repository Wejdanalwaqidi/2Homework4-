public class Test {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list=new CircularlyLinkedList<>();
//        System.out.println(list.isEmpty());
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
//      CircularlyLinkedList n= list.clone();
//        for (int i = 0; i <n.size() ; i++) {
//            System.out.println(n.first());
//            list.rotate();
//        }
//        System.out.println(list.size2());

        CircularlyLinkedList<Integer> list2=new CircularlyLinkedList<>();
        list2.addFirst(3);
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);

//        System.out.println(list.equals(list2));
//        list2.addLast(13);
        System.out.println(list.SameSeq(list2));
    }
}