package com.tms.lesson9;

import java.util.*;

public class RepetitionSearchService implements ServiceNumber {
    @Override
    public void findRepetitions(List<Integer> list) {
        Map<Integer, Integer> mp2 = new HashMap<Integer, Integer>();
        Set<Integer> unique = new HashSet<Integer>(list);
        for (Integer key : unique) {
            mp2.put(key, Collections.frequency(list, key));
        }
        System.out.println(mp2);
    }
}
