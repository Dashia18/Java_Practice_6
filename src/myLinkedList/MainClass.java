package myLinkedList;

import java.util.Iterator;

/**
 * Created by Daria Serebryakova on 25.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> mList = new MyLinkedList<>();

        mList.add(1);
        mList.add(2);
        mList.add(3);
        mList.add(1,4);
        mList.add(2,5);
        mList.add(2,6);
        mList.add(0,0);

        System.out.println("size of array = " +mList.size());

        Iterator<Integer> iter1 = mList.iterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next() + " ");
        }
        System.out.println();


        System.out.println("Remove element " + mList.remove(2));

        System.out.println(mList);
        System.out.println("Element by " + mList.index(5) + " ind = " + mList.get(3));
        System.out.println("Prev element before set " + mList.set(2, 8));

        System.out.println(mList);

        Integer[] arr = new Integer[mList.size()];
        for (int i=0; i < mList.size(); i++)
        {
            //1
            arr[i] = (Integer)mList.toArray()[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i < mList.size(); i++)
        {
            //2
            System.out.print(mList.toArray()[i] + " ");
        }


        mList.clear();
        System.out.println("\nClear List, size of array = " +mList.size());





    }


}
