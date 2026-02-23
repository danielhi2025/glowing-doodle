package PACKAGE_NAME;

public class RegularTicket extends Ticket {
    public RegularTicket(int id, String showName, String showDate,
                         int rowNumber, int seatNumber,
                         Customer ticketCustomer, double price) {
        super(id, showName, showDate, rowNumber, seatNumber, ticketCustomer, price);
    }
    @Override
    protected double calculatePrice(double basePrice) {
        return basePrice;
    }
}
