
public class Program {
    public static void main(String[] args) {
        System.out.println(String.format("%-16s %5s %-8s %6s", "Spaceline", "Days", "Trip", "Price"));
        System.out.println("=========================================");
        for (int x = 0; x <= 10; x++) {
            System.out.println(Ticket.ticketBuilder());
        }
    }
}
