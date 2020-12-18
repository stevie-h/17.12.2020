/* HW 17/12/2020
1. write for-loop which prints the numbers from 100 to 1000 in 100 steps: 100, 200, 300, .... 1000
2. write for-loop which prints numbers from 5 to -10 (minus)
3. *etar: use for-loop to print the power of 2: 1, 2, 4, 8, 16, 32, 64, ... 2048
4. generate a random number from 1-3
   use switch-case to print the number in hebrew.
   for exmaple if 1 was generated -> print "ehad", 2 -> print "shtaim" , 3 -> print "shalosh"
*/


package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
      
        int index;
        //ex1
        for (index = 100; index <= 1000; index += 100)
        {
            System.out.print(index + " ");
        }

        //ex2
        System.out.println();
        for (index = 5; index >= -10; index--)
        {
            System.out.print(index + " ");
        }

        //ex3
        System.out.println();
        int c_power = 1;
        for (index = 0; index <= 11; index++)
        {
            System.out.print(c_power + " ");
            c_power *= 2;
        }

        //ex4
        System.out.println();
        Random r = new Random();
        int rand = r.nextInt(3) + 1;
        switch (rand)
        {
            case 1:
                System.out.println("ehad");
                break;
            case 2:
                System.out.println("shtaim");
                break;
            case 3:
                System.out.println("shalosh");
                break;
        }

    }
}
