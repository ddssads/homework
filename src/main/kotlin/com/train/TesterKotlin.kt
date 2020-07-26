package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    var totaltickets = 0
    while(totaltickets != -1) {
        print("Please enter number of tickets: ")
        totaltickets = scanner.nextInt()
        print("How many round-trip tickets: ")
        var roundtriptickets = scanner.nextInt()
        var ticketprice = Ticket(totaltickets, roundtriptickets)
        ticketprice.print()
        print("Enter the -1 if you don't buy anymore")
        totaltickets = scanner.nextInt()
    }
}

class Ticket(var totaltickets : Int, var roundtriptickets : Int){
    fun print(){
        var totalPrice = (totaltickets-roundtriptickets)*1000+(roundtriptickets*1800);
        println("Total Tickets: $totaltickets")
        println("Round-Trip: $roundtriptickets")
        println("Total: $totalPrice")
    }
}