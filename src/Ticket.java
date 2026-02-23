package PACKAGE_NAME;

public abstract class Ticket {
    protected final int id;
    protected final String showName;
    protected final String showDate;
    protected final int rowNumber;
    protected final int seatNumber;
    protected final Customer ticketCustomer;
    protected double price;
    public Ticket(int id, String showName, String showDate,
                  int rowNumber, int seatNumber,
                  Customer ticketCustomer, double price) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.ticketCustomer = ticketCustomer;
        this.price = calculatePrice(price);
    }
    protected abstract double calculatePrice(double basePrice);
    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Customer getTicketCustomer() {
        return ticketCustomer;
    }

    public double getPrice() {
        return price;
    }
}
