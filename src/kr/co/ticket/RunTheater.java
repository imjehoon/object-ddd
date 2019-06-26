package kr.co.ticket;

public class RunTheater {

    public static void main(String[] args){

        Bag bag = new Bag(100L, new Invitation());
        Audience audience = new Audience(bag);

        Ticket ticket = new Ticket(10L);

        TicketOffice ticketOffice = new TicketOffice(100L, ticket, ticket);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        theater.enter(audience);
    }
}
