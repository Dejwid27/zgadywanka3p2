import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        int wylosowanaLiczba = (int) (Math.random() * 100 + 1);
        System.out.println(wylosowanaLiczba);


        System.out.println(wylosowanaLiczba);


        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int wpisanaLiczba = klawiatura.nextInt();

        if (wpisanaLiczba == wylosowanaLiczba) {
            System.out.println("Wygrana");
        } else {
            System.out.println("pudlo");
        }
        int roznica = wpisanaLiczba > wylosowanaLiczba
                ? wpisanaLiczba - wylosowanaLiczba
                : wylosowanaLiczba - wpisanaLiczba;
        System.out.println("Pomylka o" + roznica);

        roznica = roznica / 10;
        switch (roznica) {
            case 0:
                System.out.println("Bardzo blisko");
            case 1:
                System.out.println("Blisko");
            case 2:
                System.out.println("dosc blisko");
            default:
                System.out.println("Slabo");
        }
        {
            System.out.println(
                    switch (roznica) {
                        case 0 -> "bardzo dobrze";
                        case 1 -> "dobrze";
                        case 2 -> "doscdobrze";
                        default -> "slabo";
                    }
            );

            for (int i = 0; i < 10; i++) {
                System.out.println("Podaj liczbe");
                wpisanaLiczba = klawiatura.nextInt();
                if (wpisanaLiczba == wylosowanaLiczba) {
                    System.out.println("Wygrana");
                    break;
                }
            }
            do {
                System.out.println("Podaj liczbę");
                wpisanaLiczba = klawiatura.nextInt();
                if (wpisanaLiczba > wylosowanaLiczba) {
                    System.out.println("Wpisano za duzo");
                } else if (wpisanaLiczba < wylosowanaLiczba) {
                    System.out.println("Wpisano za malo");
                }
            }
            while (wpisanaLiczba != wylosowanaLiczba);
            System.out.println("WYGRANa");
        }

        //zadanie dom8
        String haslo = "";
        String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
        String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String znakiSpecjalne = "!@#$%^&*()-_=+/?.,><";
        String cyfry = "1234567890";

        int losowa;

        for (int i = 0; i < 5; i++) {
            losowa = (int) (Math.random() + maleLitery.length());
            haslo = haslo + maleLitery.charAt(losowa);
            losowa = (int) (Math.random() + duzeLitery.length());
            haslo = haslo + duzeLitery.charAt(losowa);
            losowa = (int) (Math.random() + znakiSpecjalne.length());
            haslo = haslo + znakiSpecjalne.charAt(losowa);
            losowa = (int) (Math.random() + cyfry.length());
            haslo = haslo + cyfry.charAt(losowa);
        }
        System.out.println("wygenerowane haslo: " + haslo);
    }
}