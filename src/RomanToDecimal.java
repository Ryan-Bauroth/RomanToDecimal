import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RomanToDecimal {
    //https://www.geeksforgeeks.org/arrays-in-java/ hehe i steal
    static String[] vary = {"IV", "IX", "XL", "XC", "CD", "CM"};
    static int[] invalid = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] invalidStr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V", "IV", "I"};
    //roman.indexO
    /**
     * The main method for class RomToDec
ML     * @param args
     */
    public static void main(String[] args) {
        for(String roman : args){
            int decimal = romanToDecimal(roman);
            if(decimal > 0){
                System.out.println("Input: " + roman + " => output: " + decimal);
            }
            else if(decimal == -1){
                System.out.println("Input: " + roman + " => output: Invalid Input");
            }
            else if (decimal == -2){
                System.out.println("Input: " + roman + " => output: Logically Invalid Input");
            }
        }
    }
    private static int translate(String x){
        int sum = 0;
        switch(x) {
            case "I":
                sum = 1;
                break;
            case "V":
                sum = 5;
                break;
            case "X":
                sum = 10;
                break;
            case "L":
                sum = 50;
                break;
            case "C":
                sum = 100;
                break;
            case "D":
                sum = 500;
                break;
            case "M":
                sum = 1000;
                break;
            default:
                sum = -1;

        }
        return sum;
    }
    /**
     * Method "romanToDecimal" converts inputted roman values into decimal values
     * @param roman [String from args]
     * @returns int
     */
    public static int romanToDecimal(String roman){
        roman = roman.toUpperCase();
        int sum = 0;
        //basic roman to int:
        for(int i = 0; i < roman.length(); i++) {
            roman = roman.toUpperCase();
            String temp = roman.substring(i, i+1);
            sum += translate((temp));
            if(translate(temp) == -1){
                sum = -1;
                break;
            }
            //variants:
            for(int x = 0; x < vary.length; x++) {
                if(i < roman.length()-1) {
                    if (roman.substring(i, i + 2).equals(vary[x])) {
                        sum -= 2 * translate(roman.substring(i, i + 1));
                    }
                }
            }
        }
        if(sum != -1 && isInvalid(sum, roman))
            sum = -2;
        return sum;
    }
    private static boolean isInvalid(int dec, String expectedRoman){
        String roman = "";
        for(int i = 0; i < invalid.length; i++){
            while(dec - invalid[i] >= 0){
                roman += invalidStr[i];
                dec = dec - invalid[i];
            }
        }
        if(roman.equals(expectedRoman))
            return false;
        else
            return true;
    }
}
