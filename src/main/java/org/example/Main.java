package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym banku!");
        System.out.println("Wprowadz imie");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Wprowadz nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Wprowadz numer pesel");
        int pesel = scanner.nextInt();

        User user1 = new User(name, surname, pesel);

        int select;
        do {
            System.out.println("Menu\n 1.Informacja o koncie\n 2.Wplata pieniedzy\n 3.Wyplata pieniedzy\n 4.Wyjscie");

            System.out.println("Co bys chcial zrobic?");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("1.Informacja o koncie");
                    user1.userDetails();
                    break;
                case 2:
                    System.out.println("2.Ile chcesz wplacic pieniedzy? ");
                    double moneyToDeposit = scanner.nextDouble();
                    user1.deposit(moneyToDeposit);
                    System.out.println("Saldo Twojego konta wynosi:" + user1.getBalance());
                    break;
                case 3:
                    System.out.println("3. Wyplata pieniedzy");
                    double moneyWithdraw = scanner.nextDouble();
                    user1.withdraw(moneyWithdraw);
                    System.out.println("Saldo Twojego konta wynosi: " + user1.getBalance());
                    break;
                case 4:
                    System.out.println("4.Do zobaczenia! :)");
                    break;
            }
        }
        while(select!=4);
    }
}