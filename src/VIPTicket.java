package PACKAGE_NAME;

public class VIPTicket extends Ticket {
    public VIPTicket(int id, String showName, String showDate,
                     int rowNumber, int seatNumber,
                     Customer ticketCustomer, double price) {
        super(id, showName, showDate, rowNumber, seatNumber, ticketCustomer, price);
    }
    @Override
    protected double calculatePrice(double basePrice) {
        if (ticketCustomer.getCustomerType() != CustomerType.VIP) {
            throw new IllegalArgumentException(
                    "Customer is not a VIP, cannot purchase VIP ticket."
            );
        }
        double discount = ticketCustomer.getCustomerDiscount() != null
                ? ticketCustomer.getCustomerDiscount()
                : 0;

        return basePrice - discount;
    }
}
