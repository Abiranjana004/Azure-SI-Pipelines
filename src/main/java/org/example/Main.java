package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


           double PA = scanner.nextDouble();
           double Time = scanner.nextDouble();
           double RI = scanner.nextDouble();
           double SI = ( Time * PA * RI) / 100 ;
           System.out.println("The Simple interest is  " + SI);
           scanner.close();
        }
    }





