package kr.co.ticket;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 사람의 가방에는 돈이 있거나 돈+초대장이 있는 경우가 있다.
     * @param amount
     */
    public Bag(long amount){
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
