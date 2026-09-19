package CollectionFrameWork;

import java.util.*;

public class LinkdedList43 {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        //add
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("Linked List Is : " + ll);

        //remove
        ll.remove(2);

        //addAll
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll.addAll(ll2);
        System.out.println("Linked List Is After addAll : " + ll);

        //removeAll

        ll.removeAll(ll2);
        System.out.println("Linked List Is After removeAll : " + ll);
        //size() and clear()
        System.out.println("Size of ll Is : " + ll.size());
        ll2.clear();
        System.out.println("Linked List Is After Clear : " + ll2);

        //iterator
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println("Element Is : " + it.next());
        }

        LinkedList<Integer> ll3 = new LinkedList<>();

        ll3.add(1);
        ll3.add(2);
        ll3.add(3);
        ll3.add(4);
        System.out.println("Linked List : " + ll3);
        System.out.println("Index of Three Is :" + ll3.indexOf(3));


        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(1);
        q.add(3);
        q.add(4);

        System.out.println("Queue Is : " + q);
        System.out.println("Peeking.... : " + q.peek());
        System.out.println("Pooling.... : " + q.poll());
        System.out.println("After Polling... : " + q);
        q.offer(3);
        System.out.println("After Offering... : " + q);

        Deque<Integer> d = new LinkedList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        System.out.println("Deque Is : " + d);



        d.pollLast();
        System.out.println("Deque Is : " + d);

    }
}
