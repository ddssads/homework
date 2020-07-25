package com.train;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Tickets {
    int totalticket;
    int roundtripticket;
    public Tickets(int totalticket,int roundtripticket){
        this.totalticket = totalticket;
        this.roundtripticket = roundtripticket;
    }
    public void priceoftickets(){
        int totalprice = (roundtripticket*1800)+(totalticket-roundtripticket)*1000;
        System.out.println("Total Tickets: " + totalticket);
        System.out.println("Round-Trip: " + roundtripticket);
        System.out.println("Total: " + totalprice);
    }
}
