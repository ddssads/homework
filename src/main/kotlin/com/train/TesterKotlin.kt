package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totaltickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundtriptickets = scanner.nextInt()
    var ticketprice = Ticket(totaltickets,roundtriptickets)
    ticketprice.print()
}

class Ticket(var totaltickets : Int, var roundtriptickets : Int){
    fun print(){
        var totalPrice = (totaltickets-roundtriptickets)*1000+(roundtriptickets*1800);
        println("Total Tickets: $totaltickets")
        println("Round-Trip: $roundtriptickets")
        println("Total: $totalPrice")
    }
}