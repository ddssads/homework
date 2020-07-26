package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalticket = 0;
        while( totalticket != -1) {
            System.out.print("Please enter number of tickets: ");
            totalticket = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            int roundtripticket = scanner.nextInt();
            Tickets tickets = new Tickets(totalticket, roundtripticket);
            tickets.priceoftickets();
            System.out.print("Enter the -1 if you don't buy anymore");
            totalticket = scanner.nextInt();
        }
    }
}
