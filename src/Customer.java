package PACKAGE_NAME;

public class Customer {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String deliveryAddress;
    private final CustomerType customerType;
    private final Double customerDiscount; // Can be null
    private FoodVoucher foodVoucher; // Not final, can be assigned later
    public Customer(int id, String firstName, String lastName,
                    String email, String deliveryAddress,
                    CustomerType customerType, Double customerDiscount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }
    public void takeFoodVoucher(FoodVoucher foodVoucher) {
        this.foodVoucher = foodVoucher;
    }

    public void eatFood() {
        if (foodVoucher != null) {
            foodVoucher.eat();
        } else {
            System.out.println("No food voucher available.");
        }
    }
}
