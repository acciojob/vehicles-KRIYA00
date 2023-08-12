package com.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
      /* List<Integer> li=new ArrayList<>();
       li.add(1);
       Collection<Integer> lis=new PriorityQueue<>();
       li.iterator();*/

    }
}