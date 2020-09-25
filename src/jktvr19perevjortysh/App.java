/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19perevjortysh;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
class App {

    public void run() {
        System.out.println("--- Перевертыш ---");
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("В строке символов: " + str.length());
        System.out.print("Перевертыш: ");
        char[] chStr = str.toCharArray();
        char[] pChStr = new char[str.length()];
        for (int i = 0; i < pChStr.length; i++) {
           pChStr[i] = chStr[(pChStr.length-1) - i];
        }
        System.out.println(Arrays.toString(pChStr));
        String pStr = new String(pChStr);
        System.out.println(pStr);
        System.out.print("Второе слово этой строки: ");
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ",firstSpace+1);
        if(firstSpace < 0){
            System.out.println("Нет второго слова.");
        }else if(secondSpace < 0) {
            System.out.println(str.substring(firstSpace+1));
        }else {
            System.out.println(str.substring(firstSpace+1, secondSpace));
        }
        
    }
    
}
