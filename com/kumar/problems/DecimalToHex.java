package com.kumar.problems;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String args[])
    {
        int num,counter=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        num = sc.nextInt();
        convDecToHex(num);

        /*to store maximum 32 digits of a number*/
        String hexVal="";
        int dig;    // to store digits
        while(num > 0){
            dig= num%16;
            switch(dig)
            {
                case 15:
                    hexVal+="F"; break;
                case 14:
                    hexVal+="E"; break;
                case 13:
                    hexVal+="D"; break;
                case 12:
                    hexVal+="C"; break;
                case 11:
                    hexVal+="B"; break;
                case 10:
                    hexVal+="A"; break;
                default:
                    //System.out.println("dig:"+dig);
                    hexVal+=Integer.toString(dig);
            }
            num = num/16;
        }

        for(counter=hexVal.length()-1;  counter>=0; counter--) {
            //System.out.print(hexVal.charAt(counter));
        }
    }

    /** virtu interview practice
     * all 1 can be changed to I, all 0 can be changed to O, other AEs are unchanged, if there are 2-9 returns 'ERROR', otherwise it will be modified after returning String
     * @param num
     */
    static void convDecToHex(int num){
        int dig;    // to store digits
        String hexVal="";
        while(num > 0){
            dig= num%16;
            switch(dig)
            {
                case 0:
                    hexVal+="O";break;
                case 1:
                    hexVal+="I";break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    hexVal+="ERROR";break;

                case 15:
                    hexVal+="F"; break;
                case 14:
                    hexVal+="E"; break;
                case 13:
                    hexVal+="D"; break;
                case 12:
                    hexVal+="C"; break;
                case 11:
                    hexVal+="B"; break;
                case 10:
                    hexVal+="A"; break;
                default:
                    //System.out.println("dig:"+dig);
                    hexVal+=Integer.toString(dig);
            }
            num = num/16;
        }

        for(int counter=hexVal.length()-1;  counter>=0; counter--)
            if(hexVal.length()>0){
                System.out.println("current hexVal:"+hexVal);
                System.out.print(hexVal);
            }else
                System.out.print(hexVal.charAt(counter));

    }
}
