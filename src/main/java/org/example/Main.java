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

        User user1=new User(name, surname, pesel);

        System.out.println("Menu\n 1.Informacja o koncie\n 2.Wplata pieniedzy\n 3.Wyplata pieniedzy\n 4.Wyjscie" );

        System.out.println("Co bys chcial zrobic?");
        int select= scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("1.Informacja o koncie");
                break;
            case 2:
                System.out.println("2.Wplata pieniedzy");
                break;
            case 3:
                System.out.println("3. Wyplata pieniedzy");
                break;
            case 4:
                System.out.println("4.Wyjscie");
                break;
        }
    }


}