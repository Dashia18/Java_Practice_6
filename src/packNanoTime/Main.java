package packNanoTime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daria Serebryakova on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        int N = 100000;



        System.out.println("ArrayList: ");
        List<Integer> aList= new ArrayList<>();
        //1
            long startTimeaList1 = System.nanoTime();
            for (int i = 0; i < N; i++){
                aList.add(1+i);
            }
            long estimatedTimeaList1 = System.nanoTime() - startTimeaList1;
            System.out.println("add  " + estimatedTimeaList1);
        //2
            long startTimeaList2 = System.nanoTime();
            for (int i = 0; i < N; i++){
                aList.get(i);
            }
            long estimatedTimeaList2 = System.nanoTime() - startTimeaList2;
            System.out.println("get  " + estimatedTimeaList2);



        System.out.println("LinkedList:");
        List<Integer> lList= new LinkedList<>();
        //1
            long startTimelList1 = System.nanoTime();
            for (int i = 0; i < N; i++){
                lList.add(1+i);
            }
            long estimatedTimelList1 = System.nanoTime() - startTimelList1;
            System.out.println("add  " + estimatedTimelList1);
        //2
            long startTimelList2 = System.nanoTime();
            for (int i = 0; i < N; i++){
                lList.get(i);
            }
            long estimatedTimelList2 = System.nanoTime() - startTimelList2;
            System.out.println("get  " + estimatedTimelList2);







    }
}
