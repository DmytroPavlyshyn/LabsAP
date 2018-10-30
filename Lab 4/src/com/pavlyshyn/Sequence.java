package com.pavlyshyn;

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private List items;
 //   private int next = 0;
    public Sequence(int size) {
        items = new ArrayList(size);
    }
    public void add(Object x) {
        items.add(x);
  //      if(next < items.length)
 //           items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String...args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        sequence.add(12);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}