package org.example;

public class CustomerRegistration extends RegistrationPage {
    @Override
    public void newCustomerRegistration() {
        super.newCustomerRegistration();
    }

    @Override
    public void newStaffMemberRegistration() {
        super.newStaffMemberRegistration();
    }

    public void cancelCustomers(){
        System.out.println("cancel all inactive customers");
    }


}
