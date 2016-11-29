package myLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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

        System.out.println("size of array = " + mList.size());

        Iterator<Integer> iter1 = mList.iterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next() + " ");
        }
        System.out.println();


        System.out.println("Remove element " + mList.remove(2));

        System.out.println(mList);
        System.out.println("Index by element " + mList.index(3) + "\nElement by index = " + mList.get(2));
        System.out.println("Prev element before set " + mList.set(2, 8));

        System.out.println(mList);

        //toArray convert
        System.out.println("toArray convert");
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

        System.out.println();
        System.out.println("MyLinkedList");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
            int n = 1000;
            //time measurement
            System.out.print("add: ");
            long startTimeMyList = System.nanoTime();
                for (int i = 0; i < n; i++){
                    myLinkedList.add(1+i);
                }
            long estimatedTimeMyList = System.nanoTime() - startTimeMyList;
            System.out.println(estimatedTimeMyList);

            //time measurement
            System.out.print("get: ");
            long startTimeMyList2 = System.nanoTime();
            for (int i = 0; i < n; i++){
                myLinkedList.get(i);
            }
            long estimatedTimeMyList2 = System.nanoTime() - startTimeMyList2;
            System.out.println(estimatedTimeMyList2);

        System.out.println("LinkedList");

        List<Integer> list = new LinkedList<>();
            //time measurement
             System.out.print("add: ");
            long startTimeList = System.nanoTime();
                for (int i = 0; i < n; i++){
                    list.add(1+i);
                }
            long estimatedTimeList = System.nanoTime() - startTimeList;
            System.out.println(estimatedTimeList);

            //time measurement
            System.out.print("get: ");
            long startTimeList2 = System.nanoTime();

            for (int i = 0; i < n; i++){
                list.get(i);
            }
            long estimatedTimeList2 = System.nanoTime() - startTimeList2;
            System.out.println(estimatedTimeList2);





    }


}
