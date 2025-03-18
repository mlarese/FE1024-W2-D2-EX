package it.epicode.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> rubrica = new HashMap<>();

    public static void inserisciNominativo(String nome, String telefono){
        rubrica.put(nome, telefono);
    }
    public static void cancellaNominativo(String nome) {
        rubrica.remove(nome);
    }
    public static String cercaPersono(String telefono) {
        for (String nome : rubrica.keySet()) {
            String telefonoCorrente = rubrica.get(nome);

            if (telefonoCorrente.equals(telefono)) {
                return nome;
            }
        }
        return null;
    }
    public static String cercaTelefono(String nome){
        return rubrica.get(nome);
    }

    public static void stampaRubrica() {
        for (String nome : rubrica.keySet()) {
            String telefono = rubrica.get(nome);
            System.out.println(nome + " - " + telefono);
        }
    }



    public static void main(String[] args) {

        inserisciNominativo("Mario Rossi", "1234567890");
        inserisciNominativo("Luca Bianchi", "0987654321");
        inserisciNominativo("Paolo Verdi", "1111111111");
        inserisciNominativo("Giuseppe Neri", "2222222222");

        System.out.println("-------------------------");
        System.out.println("Cerca persona per numero");
        String nome = cercaPersono("0987654321");
        if(nome != null)  System.out.println("Il nome corrispondente al numero di telefono è: " + nome);
        else  System.out.println("Il numero di telefono non è presente nella rubrica");

        System.out.println("-------------------------");
        System.out.println("Cerca telefono per nome");

        String telefono = cercaTelefono("Mario Rossi");
        System.out.println("Il telefono di Mario Rossi é: " + telefono);

        System.out.println("-------------------------");
        System.out.println("Cancella nominativo");
        cancellaNominativo("Mario Rossi");

        System.out.println("-------------------------");
        System.out.println("Stampa rubrica");
        stampaRubrica();

    }
}
