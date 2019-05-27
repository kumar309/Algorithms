package com.kumar.problems;

/**
 There is going to be a sale during this month.
 You are interested in a particular item and you found that different Vendors have different prices during different time periods.
 You collected the following information:

 Vendor => (start date, end date, price) both sides inclusive
 A => (1, 5, $20)
 B => (3, 6, $15)
 C => (2, 8, $25)
 D => (7, 12, $18)
 E => (1, 31, $22)
 As you can see, there are conflicting entries. You need to print out a non-conflicting schedule of prices, taking the best price from each period:

 e.g.
 (1, 2, $20), (3, 6, $15), (7, 12, $18), (13, 31, $22)

 */

/**
 input.txt:
 1, 5, $20
 3, 6, $15
 2, 8, $25
 7, 12, $18
 1, 30, $22

 output:
 1, 2, $20
 3, 6, $15
 7, 12, $18
 13, 31, $22
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BestPriceFromNonConflictingSchedule {

    public static void main(String [] args){
        int [] bestPrice = new int[32];

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Kumar\\IdeaProjects\\Algorithms\\com\\kumar\\problems\\input.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] elements = line.split(",");
                int startDate = Integer.parseInt(elements[0].trim());
                int endDate = Integer.parseInt(elements[1].trim());
                int price = Integer.parseInt(elements[2].trim().substring(1));

                for (int i = startDate; i <= endDate; i++){
                    if (bestPrice[i] == 0 || price < bestPrice[i]){
                        bestPrice[i] = price;
                    }
                }
//System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int previous = 0;
        int start = 0;
        for (int i = 0; i < bestPrice.length; i++){
            if (bestPrice[i] != previous){
                if (start > 0){
                    System.out.println(start + ", " + (i - 1) + ", $" + previous);
                }
                start = i;
                previous = bestPrice[i];
            }
            if (i == 31 && bestPrice[i] != 0){
                System.out.println(start + ", " + i + ", $" + previous);
            }
        }
    }
}