package PACKAGE_NAME;

public class TicketManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Ticket Management System ===\n");
        Customer vipCustomer = new Customer(
                1,
                "John",
                "Doe",
                "john@example.com",
                "123 Main St",
                CustomerType.VIP,
                20.0  // $20 discount
        );

        Customer regularCustomer = new Customer(
                2,
                "Jane",
                "Smith",
                "jane@example.com",
                "456 Elm St",
                CustomerType.REGULAR,
                null  // No discount
        );
        Show show = new Show(1, "Concert Night", "2026-03-15");
        Ticket vipTicket = new VIPTicket(
                1,
                show.getName(),
                show.getDate(),
                5,   // Row
                10,  // Seat
                vipCustomer,
                100.0  // Base price
        );

        Ticket regularTicket = new RegularTicket(
                2,
                show.getName(),
                show.getDate(),
                5,   // Row
                11,  // Seat
                regularCustomer,
                50.0  // Base price
        );
        show.addTicket(vipTicket);
        show.addTicket(regularTicket);
        System.out.println("VIP Ticket:");
        System.out.println("  Customer: " + vipTicket.getTicketCustomer().getFirstName());
        System.out.println("  Base Price: $100.00");
        System.out.println("  Discount: $" + vipCustomer.getCustomerDiscount());
        System.out.println("  Final Price: $" + vipTicket.getPrice());
        System.out.println();
        System.out.println("Regular Ticket:");
        System.out.println("  Customer: " + regularTicket.getTicketCustomer().getFirstName());
        System.out.println("  Price: $" + regularTicket.getPrice());
        System.out.println();
        System.out.println("Show: " + show.getName());
        System.out.println("Total Revenue: $" + show.calculateRevenue());
        System.out.println();
        System.out.println("=== Food Voucher Test ===");
        SimpleFoodVoucher foodVoucher = new SimpleFoodVoucher();
        vipCustomer.takeFoodVoucher(foodVoucher);
        vipCustomer.eatFood();
        regularCustomer.eatFood();
        System.out.println("\n=== Error Handling Test ===");
        try {
            Ticket invalidTicket = new VIPTicket(
                    3,
                    show.getName(),
                    show.getDate(),
                    6,
                    1,
                    regularCustomer,  // Regular customer!
                    100.0
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}
