package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Random rd = new Random();
        Collection coll = new ArrayList();
        while (coll.size()<20){
            int newRd = rd.nextInt(21);
            Integer random21 = new Integer(newRd);
            if(!coll.contains(random21)){
                coll.add(random21);
            }
        }
        return coll;
    }
}
