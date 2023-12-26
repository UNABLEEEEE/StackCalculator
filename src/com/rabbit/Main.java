package com.rabbit;

public class Main {
    public static void main(String[] args) {
        int time = 1000;
        int [] result = Rabbit.rabbit(time);
        System.out.println("兔子可能藏在如下的洞中：");
        for (int i = 0; i < 10; i++) {
            if(result[i] != 0){
                System.out.println("第" + result[i] + "号洞");
            }
        }
    }
}
