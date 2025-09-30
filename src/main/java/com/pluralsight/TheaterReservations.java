package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println("Hello customer! Welcome to the reservation page!");
        System.out.println("Please enter your first name: ");
        String first = in.next();
        System.out.println("Please enter your last name: ");
        String last = in.next();
        System.out.println("To what date do you want to reserve?(DD/MM/YY) ");
        LocalDate userDate = LocalDate.parse(in.next(), formatter);
        System.out.println("How many tickets do you want? ");
        int numberOfTickets = in.nextInt();
        if(numberOfTickets>1){
            System.out.println(numberOfTickets + " tickets reserved for " + userDate + " under " + last + " " + first);
        }
        else {
            System.out.println("Ticket reserved for " + userDate + " under " + last + " " + first);
        }
        }
}
