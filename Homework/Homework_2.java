package homework;

import java.util.ArrayList;

public class Homework_2 {

    public static void main(String[] args) {

        //დავალება_1

        for (int i = 1; i < 30; i++) {                                          //ვარიანტი_1

            if (i % 2 == 1) {
                System.out.println(i);


            }

        }
        for (int i = 1; i < 30; i += 2) {                                         //ვარიანტი_2
            System.out.println(i);
        }


        int[][] array = {{1, 2, 3, 4}, {5, 6, 7}};

        for (int i = 0; i < array.length; i++) {



        }
      //დავალება_2

          int minim = 0;
          int maxim = 100;
          double x = Math.random()*(maxim-minim+1)+1;
        System.out.println(x);
          int y = (int)(Math.random()*(maxim-minim+1)+minim);
        System.out.println(y);

      // დავალება _3

        double [] arr = {25.5, 12, 19.5, 11.5};
        double sum = 0.0;
            for (int b = 0; b < arr.length; b++){
            sum += arr[b];}
           double arit = (sum / arr.length);
            System.out.println(arit);




     // დავალება_4

        int araay[] = {11,16,5,23};
        int min = araay[0];
        for (int k = 1; k < araay.length; k++){
            if (araay[k] < min)
                min = araay[k];}
            System.out.println(min);







    }


 }


