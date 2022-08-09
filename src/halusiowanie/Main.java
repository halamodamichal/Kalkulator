package halusiowanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pierwsza = scanner1();
        int druga = scanner2();
        String operacja = scanner3();
        wykonanie(operacja, pierwsza, druga);

    }

    public static int scanner1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisz liczbę pierwszą:");
        return scanner.nextInt();
    }
    public static int scanner2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisz liczbę drugą:");
        return scanner.nextInt();
    }
    public static String scanner3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co wykonać? Wypisz jeden znak '+', '-', '*', '/'");
        return scanner.nextLine();
    }
    public static void Dodawanie (int pierwsza, int druga) {
        int result = pierwsza + druga;
        System.out.println("Wynik dodawania to:" + " " + result);
    }

    public static void Odejmowanie (int pierwsza, int druga) {
        int result = pierwsza - druga;
        System.out.println("Wynik odejmowania to:" + " " + result);
    }
    public static void Mnozenie (int pierwsza, int druga) {
        int result = pierwsza * druga;
        System.out.println("Wynik mnożenia to:" + " " + result);
    }

    public static void Dzielenie (int pierwsza, int druga) {
        if (pierwsza == 0 || druga == 0) {
            System.out.println("Wynik dzielenia to:" + "0");
        } else {
            int result = pierwsza / druga;
            System.out.println("Wynik dzielenia to:" + " " + result);
        }
    }
    public static void wykonanie (String corobic, int pierwsza, int druga) {
        if (corobic.equals("+")) {
            Dodawanie(pierwsza, druga);
        } else if (corobic.equals("-")) {
            Odejmowanie(pierwsza, druga);
        } else if (corobic.equals("*")) {
            Mnozenie(pierwsza, druga);
        } else if (corobic.equals("/")) {
            Dzielenie(pierwsza, druga);
        } else {
            System.out.println("Niepoprawny znak do wykonania operacji!");
        }
    }

    {

    }
}
