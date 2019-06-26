package kr.co.ticket;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        System.out.println("is start : " + audience.getBag().hasTicket());

        ticketSeller.sellTo(audience);

        System.out.println("is end : " + audience.getBag().hasTicket());
    }
}
