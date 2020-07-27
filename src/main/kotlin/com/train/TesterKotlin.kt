package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    var totalTickets = 0
    while(totalTickets != -1) {
        print("Please enter number of tickets: ")
        totalTickets = scanner.nextInt()
        print("How many round-trip tickets: ")
        var roundTripTickets = scanner.nextInt()
        var ticketPrice = Ticket(totalTickets, roundTripTickets)
        ticketPrice.print()
        print("Enter the -1 if you don't buy anymore")
        totalTickets = scanner.nextInt()
    }
}

class Ticket(var totalTickets : Int, var roundTripTickets : Int){
    fun print(){
        var totalPrice = (totalTickets-roundTripTickets)*1000+(roundTripTickets*1800);
        println("Total Tickets: $totalTickets")
        println("Round-Trip: $roundTripTickets")
        println("Total: $totalPrice")
    }
}