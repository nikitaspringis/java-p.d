package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet centu skaitu: ");
        int centi = sc.nextInt();

        int eiro = centi / 100;
        centi -= eiro * 100;

        if (centi % 10 == 1 && centi != 11) System.out.println(eiro + " eiro un " + centi + " cents");
        else System.out.println(eiro + " eiro un " + centi + " centi");

    }
}
