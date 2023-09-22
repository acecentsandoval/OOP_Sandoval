/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

/**
 *
 * @author Acecent Sandoval
 */

import java.util.*;

public class Conversion {

    public String toBinary(int num) {
        if (num == 0) {
            return "0"; 
        }

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            binary.insert(0, remainder); 
            num = num / 2;
        }
        return binary.toString();
    }

    public String toOctal(int nums) {
        if (nums == 0) {
            return "0"; 
        }

        StringBuilder octal = new StringBuilder();
        while (nums > 0) {
            int remainder = nums % 8;
            octal.insert(0, remainder); 
            nums = nums / 8;
        }
        return octal.toString();
    }

    public String toHex(int num) {
        if (num == 0) {
            return "0"; 
        }

        StringBuilder hex = new StringBuilder();
        while (num > 0) {
            int remainder = num % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder); 
            } else {
                hexDigit = (char) ('A' + (remainder - 10)); 
            }
            hex.insert(0, hexDigit); 
            num = num / 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Converter to Binary, Octal, Hex");
        System.out.println("Enter a number");
        int num = user.nextInt();
        Conversion c = new Conversion();
        System.out.println("Binary: " + c.toBinary(num));
        System.out.println("Octal: " + c.toOctal(num));
        System.out.println("Hex: " + c.toHex(num));
        user.close();
    }
}
