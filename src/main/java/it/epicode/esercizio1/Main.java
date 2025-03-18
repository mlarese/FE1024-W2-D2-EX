package it.epicode.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        System.out.println("Inserisci il numero di parole da scrivere");


        try {
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Inserisci la parola numero " + (i + 1));
                String word = scanner.nextLine();
                if(!words.add(word)) {
                    duplicates.add(word);
                }
            }
            System.out.println("-------------------------");
            System.out.println("Le parole duplicate sono: " + duplicates);
            System.out.println("-------------------------");

            System.out.println("-------------------------");
            System.out.println("Le parole distinte sono: " + words.size());
            System.out.println("-------------------------");


            System.out.println("-------------------------");
            System.out.println("Le parole distinte sono: " + words);
            System.out.println("-------------------------");


        } catch (Exception e) {
            System.out.println("Inserisci un numero valido");

        }
        scanner.close();


    }
}
