package solid.isp;



public class TerminalPaymentService implements PayablePhoneNum, PayableCreditCard{


    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }
    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }




}
