package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class EffectCollection {
    public static void main(String[] args)  {

        // ArrayList
        long startAL1 = System.nanoTime();
        ArrayList arrayList1 = new ArrayList(10000);
        add(arrayList1);
        get(arrayList1);
        remove(arrayList1);
        contains(arrayList1);
        long endAL1 = System.nanoTime();
        long timeAL1 = endAL1 - startAL1;

        long startAL10 = System.nanoTime();
        ArrayList arrayList10 = new ArrayList(100000);
        add(arrayList10);
        get(arrayList10);
        remove(arrayList10);
        contains(arrayList10);
        long endAL10 = System.nanoTime();
        long timeAL10 = endAL10 - startAL10;

        long startAL100 = System.nanoTime();
        ArrayList arrayList100 = new ArrayList(1000000);
        add(arrayList100);
        get(arrayList100);
        remove(arrayList100);
        contains(arrayList100);
        long endAL100 = System.nanoTime();
        long timeAL100 = endAL100 - startAL100;
        System.out.println("arrayList result: " + ((timeAL1+timeAL10+timeAL100)/3) +" nanosec");

        // LinkedList
        long startLL = System.nanoTime();

        LinkedList linkedList = new LinkedList();
        add(linkedList);
        get(linkedList);
        remove(linkedList);
        contains(linkedList);

        long endLL = System.nanoTime();
        long timeLL = endLL - startLL;
        System.out.println("linkedList result: " + timeLL+ " nanosec");

        // HashSet
        long startHS1 = System.nanoTime();
        HashSet hashSet1 = new HashSet(10000);
        add(hashSet1);
        remove(hashSet1);
        contains(hashSet1);
        long endHS1 = System.nanoTime();
        long timeHS1 = endHS1 - startHS1;

        long startHS10 = System.nanoTime();
        HashSet hashSet10 = new HashSet(100000);
        add(hashSet10);
        remove(hashSet10);
        contains(hashSet10);
        long endHS10 = System.nanoTime();
        long timeHS10 = endHS10 - startHS10;

        long startHS100 = System.nanoTime();
        HashSet hashSet100 = new HashSet(1000000);
        add(hashSet100);
        remove(hashSet100);
        contains(hashSet100);
        long endHS100 = System.nanoTime();
        long timeHS100 = endHS100 - startHS100;
        System.out.println("hashSet result: " + ((timeHS1+timeHS10+timeHS100)/3)+ " nanosec");

        // TreeSet
        long startTS = System.nanoTime();
        TreeSet treeSet = new TreeSet();
        add(treeSet);
        remove(treeSet);
        contains(treeSet);
        long endTS = System.nanoTime();
        long timeTS = endTS - startTS;
        System.out.println("treeSet result: " + timeTS+ " nanosec");

        try {
            FileWriter file = new FileWriter("result.doc");

            PrintWriter writer1 = new PrintWriter(file);

            writer1.println("---------------------------------------------");
            writer1.println("arrayList result: " + ((timeAL1+timeAL10+timeAL100)/3) + " nanosec");
            writer1.println("---------------------------------------------");
            writer1.println("linkedList result: " + timeLL + " nanosec");
            writer1.println("---------------------------------------------");
            writer1.println("hashSet result: " + ((timeHS1+timeHS10+timeHS100)/3) +" nanosec");
            writer1.println("---------------------------------------------");
            writer1.println("hashSet result: " + timeTS +" nanosec");
            writer1.println("---------------------------------------------");
            writer1.close();

        } catch (IOException ex) {
            System.out.println("ERROR ");
        }
    }

    public static void add(List list) {
        for (int i = 0; i < 100; i++)
            list.add(new Object());
    }

    public static void add(Set set) {
        for (int i = 0; i < 100; i++)
            set.add(i);

    }

    public static void get(List list) {
        for (int i = 0; i < 100; i++)
            list.get(i);
    }

    public static void contains(List list) {
        for (int i = 0; i < 100; i++)
            list.contains(new Object());
    }

    public static void contains(Set set) {
        for (int i = 0; i < 100; i++)
            set.contains(i);
    }

    public static void remove(List list) {
        for (int i = 0; i < 100; i++)
            list.remove(0);
    }

    public static void remove(Set set) {
        for (int i = 0; i < 100; i++)
            set.remove(i);

    }



}

