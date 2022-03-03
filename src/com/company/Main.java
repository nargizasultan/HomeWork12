package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>evenNums=new ArrayList<>();
        ArrayList<Integer>oddNumbers=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <=50; i++) {
            list.add(random.nextInt(100));

        }
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0){
                evenNums.add(i);

            }else{
                oddNumbers.add(i);

            }

        }
        System.out.println("Even number: ");
        for (int i = 0; i < evenNums.size(); i++) {
            System.out.print(evenNums.get(i)+", ");

        }
        System.out.println();
        System.out.println("Odd numbers: ");
        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i)+", ");

        }

    }
}
