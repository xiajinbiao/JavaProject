package com.bjpowernode.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReview2 {
    public static void main(String[] args) {


//        TreeSet<Temp> ts = new TreeSet<>();
        TreeSet<Temp> ts = new TreeSet<>(new Comparator<Temp>() {
            @Override
            public int compare(Temp o1, Temp o2) {
                return o1.i - o2.i;
            }
        });
        ts.add(new Temp(1));
        ts.add(new Temp(10));
        ts.add(new Temp(100));
        ts.add(new Temp(1000));
        ts.add(new Temp(10000));

        for (Temp item : ts) {
            System.out.println(item);
        }

        TreeSet<Temp2> ts2 = new TreeSet<>(new Temp2Comparator());
        ts2.add(new Temp2(1));
        ts2.add(new Temp2(10));
        ts2.add(new Temp2(100));
        ts2.add(new Temp2(1000));
        ts2.add(new Temp2(10000));

        for (Temp2 item : ts2) {
            System.out.println(item);
        }



    }
}


class Temp implements Comparable<Temp> {

    int i;

    public Temp(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(Temp o) {
        return this.i - o.i;
    }
}

class Temp2 {

    int i;

    public Temp2(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Temp2{" +
                "i=" + i +
                '}';
    }
}

  class Temp2Comparator implements Comparator<Temp2> {

      @Override
      public int compare(Temp2 o1, Temp2 o2) {
          return o2.i - o1.i;
      }
  }