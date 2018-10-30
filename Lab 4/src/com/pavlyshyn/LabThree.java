package com.pavlyshyn;

import java.util.*;

public class LabThree {

    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Gerbil> gerbils = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
        System.out.println("Task 2");
        SimpleCollection.main();
        System.out.println("Task 4");
        ShowMovie.main();
        System.out.println("Task 7");
        UniqueElement.main();
        System.out.println("Task 8");
        for (Iterator<Gerbil> iterator = gerbils.iterator(); iterator.hasNext(); iterator.next().hop()) ;

        System.out.println("Task 11");
        List<Collection<String>> ListOfCollections =
                Arrays.<Collection<String>>asList(
                        new ArrayList<String>(),
                        new LinkedList<String>(),
                        new HashSet<String>(),
                        new TreeSet<String>());
        for (Collection<String> item : ListOfCollections) {
            ShowMovie.fill(item);
        }
        for (Collection<String> item : ListOfCollections) {
            iteratorPrint(item.iterator());
        }
        System.out.println("Task 11");
        List<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)), integers2 = new LinkedList<>(integers);
        System.out.println(integers);
        iteratorReverse(integers2);
        System.out.println(integers2);
        System.out.println("Task 14");
        LinkedList<Integer> integers3 = new LinkedList<>();
        ListIterator<Integer> integerListIterator = integers3.listIterator();
        for (int i = 0; i < 6; i++) {
            integerListIterator.add(i);
            if (i % 2 == 0) {
                integerListIterator.previous();
            }
        }
        System.out.println(integers3);

        System.out.println("Task 17");
        Map<String, Gerbil> stringGerbilMap = new HashMap<>();
        stringGerbilMap.put("Fuzzy", new Gerbil(1));
        stringGerbilMap.put("Joe", new Gerbil(2));
        stringGerbilMap.put("Mike", new Gerbil(3));
        stringGerbilMap.put("Jerry", new Gerbil(4));
        stringGerbilMap.put("Kitty", new Gerbil(5));
        stringGerbilMap.put("Ben", new Gerbil(6));
        stringGerbilMap.put("Josh", new Gerbil(7));
        stringGerbilMap.put("Perry", new Gerbil(8));
        Iterator<Map.Entry<String, Gerbil>> stringIterator = stringGerbilMap.entrySet().iterator();
        while (stringIterator.hasNext()) {
            Map.Entry<String, Gerbil> stringGerbilEntry = stringIterator.next();
            System.out.print(stringGerbilEntry.getKey() + " = ");
            stringGerbilEntry.getValue().hop();
        }
        System.out.println("Task 18");
        Map<String, Gerbil> linkedStringGerbilMap = new LinkedHashMap<>();
        String[] listOfKeys = stringGerbilMap.keySet().toArray(new String[0]);
        Arrays.sort(listOfKeys);
        for (String key : listOfKeys) {
            linkedStringGerbilMap.put(key, stringGerbilMap.get(key));
        }
        for (String key : linkedStringGerbilMap.keySet()) {
            System.out.print(key + " = ");
            linkedStringGerbilMap.get(key).hop();
        }
        System.out.println("Task 19");
        Set<Integer> integerHashSet  = new HashSet<>(), integerLinkedHashSet = new LinkedHashSet<>();
        for(int i=0; i< 8; i++) {
            integerHashSet.add(new Random().nextInt(20));
        }
        System.out.println(integerHashSet);
        Integer[] ints = integerHashSet.toArray(new Integer[0]);
        Arrays.sort(ints);
        for(int item:ints){
            integerLinkedHashSet.add(item);
        }
        System.out.println(integerLinkedHashSet);
        System.out.println("Task 24");
        Map<String,Gerbil> stringGerbilMap2 = new LinkedHashMap<>(stringGerbilMap);
        Map<String,Gerbil> stringGerbilMap3 = new LinkedHashMap<>();

        String[] strings = stringGerbilMap2.keySet().toArray(new String[0]);
        Arrays.sort(strings);
        for(String key: strings){
            stringGerbilMap3.put(key,stringGerbilMap2.get(key));
            System.out.println(key+ " = " + stringGerbilMap3.get(key));
        }

        System.out.println("Task 27");
        Queue<Command> commands = new LinkedList<>();
        Producer.produce(commands);
        Consumer.consume(commands);
        System.out.println("Task 28");
        PriorityQueue<Double>doublePriorityQueue = new PriorityQueue<Double>();
        for(int i =0 ; i<10; i++){
            doublePriorityQueue.offer(new Random().nextDouble());
        }
        printPrirityQueue(doublePriorityQueue);
    }
    static void printPrirityQueue(PriorityQueue<Double> priorityQueue){
        for(Object data = priorityQueue.poll(); data != null;
            data = priorityQueue.poll())
            System.out.println(data + " ");
    }
    static void iteratorReverse(List<Integer> integers) {
        ListIterator<Integer> fwd = integers.listIterator();
        ListIterator<Integer> rev =
                integers.listIterator(integers.size());
        int mid = integers.size() >> 1;
        for (int i = 0; i < mid; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }

    static void iteratorPrint(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
    }

}
