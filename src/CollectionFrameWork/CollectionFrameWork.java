package CollectionFrameWork;

import java.util.*;

public class CollectionFrameWork {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        //collection and list is interface not the class we cant create object of it

        ArrayList<Integer> list2 = new ArrayList<>();
        //common methods
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println("List 2 Is : " + list2);
        list2.remove(3);
        System.out.println("List 2 Is : " + list2);
        System.out.println("List2 Is Contains 3 : " + list2.contains(3));

        System.out.println("Size Of List2 Is : " + list2.size());

        System.out.println("IsEmpty On collection : " + collection.isEmpty());

        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println("Collection Added On collection : " + collection);
        collection.clear();
        System.out.println("Collection Clear On collection : " + collection);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);

        list2.addAll(list3);
        System.out.println("Collection Added On list3 : " + list2);

        list2.removeAll(list3);
        System.out.println("Collection Removed On list3 : " + list2);

        Iterator iterator = list2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("List is : " + list);
        list.add(30);
        list.add(31);
        list.add(32);
        list.add(33);
        System.out.println("List is : " + list);

        Object[] arr = list.toArray();
        System.out.println("Array is : " + Arrays.toString(arr));

    }
}
