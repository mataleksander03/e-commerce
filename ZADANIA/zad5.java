//import java.util.*;
//
//public class zad5 {
//    public static void main(String[] args) {
//        // utwórz mapę: klient → kolejka (z historią ostatnich 3 produktów)
//        M...;
//
//        // przykładowe dane zamówień (klient, produkt)
//        String[][] orders = {
//                {"Anna", "kawa"},
//                {"Jan", "sok"},
//                {"Anna", "herbata"},
//                {"Jan", "czekolada"},
//                {"Anna", "ciastko"},
//                {"Jan", "woda"},
//                {"Anna", "sok"},
//                {"Jan", "ciasto"}
//        };
//
//        // przetwarzanie zamówień
//        for (String[] order : orders) {
//            String client = order[0];
//            String product = order[1];
//
//            // jeśli klient nie istnieje, dodaj nową kolejkę
//            history.computeIfAbsent(client, k -> new ArrayDeque<>());
//
//            Queue<String> queue = history.get(client);
//
//            // dodaj nowy produkt i jeśli więcej niż 3 – usuń najstarszy
//            q...;
//            if (q...) {
//                q...;
//            }
//        }
//
//        // wypisz historię ostatnich 3 produktów dla każdego klienta
//        System.out.println("Historia zamówień klientów (ostatnie 3 produkty):");
//        for (M...) {
//            S...;
//        }
//    }
//}
