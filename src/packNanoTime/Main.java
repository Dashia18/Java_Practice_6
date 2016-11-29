package packNanoTime;

import java.util.*;

/**
 * Created by Daria Serebryakova on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        int N = 150000;


//1 - LIST
        System.out.println("ArrayList: ");
        List<Integer> aList= new ArrayList<>();
        //1
            long startTimeaList1 = System.nanoTime();
            for (int i = 0; i < N; i++){
                aList.add(1+i);
            }
            long estimatedTimeaList1 = System.nanoTime() - startTimeaList1;
            System.out.println("add(el)------->" + estimatedTimeaList1/N);
        //2
            long startTimeaList2 = System.nanoTime();
            for (int i = 0; i < N; i++){
                aList.get(5);
            }
            long estimatedTimeaList2 = System.nanoTime() - startTimeaList2;
            System.out.println("get(ind)------>" + estimatedTimeaList2/N);
        //3
            long startTimeaList3 = System.nanoTime();
            for (int i = 0; i < N/2; i++){
                aList.remove(i);
            }
            long estimatedTimeaList3 = System.nanoTime() - startTimeaList3;
            System.out.println("remove(ind)--->" + estimatedTimeaList3/N);



        System.out.println("LinkedList:");
        List<Integer> lList= new LinkedList<>();
        //1
            long startTimelList1 = System.nanoTime();
            for (int i = 0; i < N; i++){
                lList.add(1+i);
            }
            long estimatedTimelList1 = System.nanoTime() - startTimelList1;
            System.out.println("add(el)------->" + estimatedTimelList1/N);
        //2
            long startTimelList2 = System.nanoTime();
            for (int i = 0; i < N; i++){
                lList.get(5);
            }
            long estimatedTimelList2 = System.nanoTime() - startTimelList2;
            System.out.println("get(ind)------>" + estimatedTimelList2/N);
        //3
            long startTimelList3 = System.nanoTime();
            for (int i = 0; i < N/2; i++){
                lList.remove(i);
            }
            long estimatedTimelList3 = System.nanoTime() - startTimelList3;
            System.out.println("remove(ind)--->" + estimatedTimelList3/N);


//2 - SET

        System.out.println("HashSet:");
        Set<Integer> set1 = new HashSet<>();

        //1
        long startTimehset1 = System.nanoTime();
        for (int i = 0; i < N; i++){
           set1.add(i+4*(6-8));
        }
        long estimatedTimehset1 = System.nanoTime() - startTimehset1;
        System.out.println("add(el)------->" + estimatedTimehset1/N);
        //2
            long startTimehset2 = System.nanoTime();
            for (int i = 0; i < N; i++){
                set1.contains(134);
            }
            long estimatedTimehset2 = System.nanoTime() - startTimehset2;
            System.out.println("contains(el)-->" + estimatedTimehset2/N);
        //3
        long startTimehset3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set1.remove(i);
        }
        long estimatedTimehset3 = System.nanoTime() - startTimehset3;
        System.out.println("remove(ind)--->" + estimatedTimehset3/N);

        System.out.println("LinkedHashSet:");
        Set<Integer> set2 = new LinkedHashSet<>();

        //1
        long startTimeLhset1 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set2.add(i+4*(6-8));
        }
        long estimatedTimeLhset1 = System.nanoTime() - startTimeLhset1;
        System.out.println("add(el)------->" + estimatedTimeLhset1/N);
        //2
        long startTimeLset2 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set2.contains(134);
        }
        long estimatedTimeLset2 = System.nanoTime() - startTimeLset2;
        System.out.println("contains(el)-->" + estimatedTimeLset2/N);
        //3
        long startTimeLhset3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set2.remove(i);
        }
        long estimatedTimeLhset3 = System.nanoTime() - startTimeLhset3;
        System.out.println("remove(ind)--->" + estimatedTimeLhset3/N);

        System.out.println("TreeSet:");
        Set<Integer> set3 = new TreeSet<>();

        //1
        long startTimeTreehset1 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set3.add(i+4*(6-8));
        }
        long estimatedTimeTreehset1 = System.nanoTime() - startTimeTreehset1;
        System.out.println("add(el)------->" + estimatedTimeTreehset1/N);
        //2
        long startTimeTreehset2 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set3.contains(134);
        }
        long estimatedTimeTreehset2 = System.nanoTime() - startTimeTreehset2;
        System.out.println("contains(el)-->" + estimatedTimeTreehset2/N);
        //3
        long startTimeTreehset3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            set3.remove(i);
        }
        long estimatedTimeTreehset3 = System.nanoTime() - startTimeTreehset3;
        System.out.println("remove(ind)--->" + estimatedTimeTreehset3/N);

//3 - MAP

        System.out.println("HashMap:");
        Map<Integer, Integer> map1 = new HashMap<>();

        //1
        long startTimehmap1 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map1.put(i, i+4*(6-8));
        }
        long estimatedTimehmap1 = System.nanoTime() - startTimehmap1;
        System.out.println("put(ind,el)--->" + estimatedTimehmap1/N);
        //2
        long startTimehmap2 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map1.get(134);
        }
        long estimatedTimehmap2 = System.nanoTime() - startTimehmap2;
        System.out.println("get(key)------>" + estimatedTimehmap2/N);
        //3
        long startTimehmap3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map1.remove(i);
        }
        long estimatedTimehmap3 = System.nanoTime() - startTimehmap3;
        System.out.println("remove(ind)--->" + estimatedTimehmap3/N);


        System.out.println("LinkedHashMap:");
        Map<Integer, Integer> map2 = new LinkedHashMap<>();

        //1
        long startTimelmap1 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map2.put(i, i+4*(6-8));
        }
        long estimatedTimelmap1 = System.nanoTime() - startTimelmap1;
        System.out.println("put(ind,el)--->" + estimatedTimelmap1/N);
        //2
        long startTimelmap2 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map2.get(134);
        }
        long estimatedTimelmap2 = System.nanoTime() - startTimelmap2;
        System.out.println("get(key)------>" + estimatedTimelmap2/N);
        //3
        long startTimelmap3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map2.remove(i);
        }
        long estimatedTimelmap3 = System.nanoTime() - startTimelmap3;
        System.out.println("remove(ind)--->" + estimatedTimelmap3/N);



        System.out.println("TreeMap:");
        Map<Integer, Integer> map3 = new TreeMap<>();

        //1
        long startTimeTmap1 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map3.put(i, i+4*(6-8));
        }
        long estimatedTimeTmap1 = System.nanoTime() - startTimeTmap1;
        System.out.println("put(ind,el)--->" + estimatedTimeTmap1/N);
        //2
        long startTimeTmap2 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map3.get(134);
        }
        long estimatedTimeTmap2 = System.nanoTime() - startTimeTmap2;
        System.out.println("get(key)------>" + estimatedTimeTmap2/N);
        //3
        long startTimeTmap3 = System.nanoTime();
        for (int i = 0; i < N; i++){
            map3.remove(i);
        }
        long estimatedTimeTmap3 = System.nanoTime() - startTimeTmap3;
        System.out.println("remove(ind)--->" + estimatedTimeTmap3/N);
    }
}
