package chapter6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class Example {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(2);
        System.out.println(l);
        Set<String> s = new HashSet<>();
        s.add("leuxs");
        s.add("byd");
        for (String city : s) {
            System.out.println(city);
        }

        Iterator<String> iter = s.iterator();
        while(iter.hasNext()){
           System.out.println(iter.next());
        }
        System.out.println(s.contains("byd"));
    }
    
}