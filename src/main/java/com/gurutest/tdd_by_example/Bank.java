package com.gurutest.tdd_by_example;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();
    Money reduce(Expression source, String toCurrency) {
     /*   if(source instanceof Money){
            return (Money) source;
        }
        Sum sum = (Sum) source;
        return sum.reduce(toCurrency);
    }*/
        return source.reduce(toCurrency);
    }
    public int rate(String from, String to) {
        if (from.equals(to)){
            return 1;
        }
        return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }

}
