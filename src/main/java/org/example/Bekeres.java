package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bekeres {
    private static Scanner src = new Scanner(System.in);
    private String szoveg;
    public static char[] tomb;
    public List<Character> lista;  // Nem statikus lista

    // Konstruktor
    public Bekeres() {
        this.lista = new ArrayList<>();  // Lista inicializálása
    }

    public Bekeres(char szoveg) {
        this.szoveg = String.valueOf(szoveg);
        this.lista = new ArrayList<>();  // Lista inicializálása
    }

    public String getSzoveg() {
        return szoveg;
    }

    public String beker() {
        while (true) {
            this.szoveg = this.src.nextLine();
            if (szoveg.length() >= 15) {
                this.tomb = szoveg.toCharArray();
                // Lista feltöltése a karakterekkel
                for (char c : tomb) {
                    this.lista.add(c);
                }
                break;
            } else {
                kiir("A szöveg túl rövid.");
            }
        }
        return szoveg;
    }

    public static void veszovelMegjelenit() {
        for (int i = 0; i < tomb.length; i++) {
            if (i > 0) {
                kiir(",");
            }
            kiir("" + tomb[i]);
        }
    }

    public void kotoJelelMegjelenit() {
        for (int i = 0; i < lista.size(); i++) {
            if (i > 0) {
                kiir("-"); // Kötőjel a karakterek között
            }
            kiir("" + lista.get(i)); // A lista i-edik eleme
        }
    }

    public static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}
