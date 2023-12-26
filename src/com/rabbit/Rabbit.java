package com.rabbit;

public class Rabbit {
    public static int[] rabbit(int n) {
        int [ ] result = new int[10];
        RingLinkedList rl = new RingLinkedList();
        for (int i = 0; i < 10; i++) {
            rl.insert(i,1);
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            rl.revise(pos % 10);
            pos = pos + i + 2;
        }
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if(rl.isZero(i)){
                result[j] = i + 1;
                j++;
            }
        }
        return result;
    }
}
