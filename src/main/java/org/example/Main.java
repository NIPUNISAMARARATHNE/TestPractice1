package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        CustomerRegistration customerRegistration = new CustomerRegistration();
        customerRegistration.newCustomerRegistration();

        System.out.println();

        StaffRegistration staffRegistration = new StaffRegistration();
        staffRegistration.newStaffMemberRegistration();

        System.out.println();

        CustomerRegistration cancelCustomer1 = new CustomerRegistration();
        cancelCustomer1.cancelCustomers();
    }
}

