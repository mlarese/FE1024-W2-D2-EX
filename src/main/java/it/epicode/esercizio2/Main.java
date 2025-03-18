package it.epicode.esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Inserisci il numero di elementi da inserire: ");

        int n = scanner.nextInt();
        List<Integer> lista = randomList(n);
        List<Integer> listaInversa = listaInvera(lista);

        System.out.println("-------------------------");
        System.out.println("Stampa la lista: ");
        System.out.println("-------------------------");
        System.out.println(lista);
        System.out.println("-------------------------");
        System.out.println("Stampa la lista inversa: ");
        System.out.println("-------------------------");
        System.out.println(listaInversa);
        System.out.println("-------------------------");
        System.out.println("Stampa pari: ");
        System.out.println("-------------------------");
        stampaPariDispari(lista, true);

        System.out.println("-------------------------");
        System.out.println("Stampa dispari: ");
        System.out.println("-------------------------");
        stampaPariDispari(lista, false);


    }

    public static void stampaPariDispari( List<Integer> lista, Boolean stampaPari) {
        System.out.println("Stampa pari/dispari ");
        for (int i = 0; i < lista.size(); i++) {
            if (stampaPari) {
                boolean isPari = lista.get(i) % 2 == 0;

                if (isPari) {
                    System.out.println(lista.get(i));
                }
            } else {
                boolean isDispari = lista.get(i) % 2 != 0;
                if (isDispari) {
                    System.out.println(lista.get(i));
                }
            }
        }

    }

    public static List listaInvera(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            listaInversa.add(lista.get(i));
        }

        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInversa.add(lista.get(i));
        }

        return listaInversa;
    }

    public static List<Integer> randomList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 100);
            list.add(num );
        }

        Collections.sort(list);
        return list;
    }

}
