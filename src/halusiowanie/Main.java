package halusiowanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int pierwsza = scanner1(scanner);
        int druga = scanner2(scanner);
        String operacja = scanner3(scanner2);
        wykonanie(operacja, pierwsza, druga);

    }

    public static int scanner1(Scanner scanner) {
        System.out.println("Wypisz liczbę pierwszą:");
        return scanner.nextInt();
    }
    public static int scanner2(Scanner scanner) {
        System.out.println("Wypisz liczbę drugą:");
        return scanner.nextInt();
    }
    public static String scanner3(Scanner scanner2) {
        System.out.println("Co wykonać? Wypisz jeden znak '+', '-', '*', '/'");
        return scanner2.nextLine();
    }
    public static void dodawanie(int pierwsza, int druga) {
        int result = pierwsza + druga;
        System.out.println("Wynik dodawania to:" + " " + result);
    }

    public static void odejmowanie(int pierwsza, int druga) {
        int result = pierwsza - druga;
        System.out.println("Wynik odejmowania to:" + " " + result);
    }
    public static void mnozenie(int pierwsza, int druga) {
        int result = pierwsza * druga;
        System.out.println("Wynik mnożenia to:" + " " + result);
    }

    public static void dzielenie(int pierwsza, int druga) {
        if (pierwsza == 0 || druga == 0) {
            System.out.println("Wynik dzielenia to:" + "0");
        } else {
            int result = pierwsza / druga;
            System.out.println("Wynik dzielenia to:" + " " + result);
        }
    }
    public static void wykonanie (String corobic, int pierwsza, int druga) {
        if (corobic.equals("+")) {
            dodawanie(pierwsza, druga);
        } else if (corobic.equals("-")) {
            odejmowanie(pierwsza, druga);
        } else if (corobic.equals("*")) {
            mnozenie(pierwsza, druga);
        } else if (corobic.equals("/")) {
            dzielenie(pierwsza, druga);
        } else {
            System.out.println("Niepoprawny znak do wykonania operacji!");
        }
    }

    {

    }
}
