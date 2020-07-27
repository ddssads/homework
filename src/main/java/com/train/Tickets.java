package com.train;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Tickets {
    int totalTicket;
    int roundTripTicket;
    public Tickets(int totalticket,int roundtripticket){
        this.totalTicket = totalticket;
        this.roundTripTicket = roundtripticket;
    }
    public void priceOfTickets(){
        int totalprice = (roundTripTicket*1800)+(totalTicket-roundTripTicket)*1000;
        System.out.println("Total Tickets: " + totalTicket);
        System.out.println("Round-Trip: " + roundTripTicket);
        System.out.println("Total: " + totalprice);
    }
}
