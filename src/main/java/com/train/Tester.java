package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicket = 0;
        while( totalTicket != -1) {
            System.out.print("Please enter number of tickets: ");
            totalTicket = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            int roundTripTicket = scanner.nextInt();
            Tickets tickets = new Tickets(totalTicket, roundTripTicket);
            tickets.priceOfTickets();
            System.out.print("Enter the -1 if you don't buy anymore");
            totalTicket = scanner.nextInt();
        }
    }
}
