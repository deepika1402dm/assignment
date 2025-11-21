interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new Cash();
        p1.pay(2500);
        p2.pay(1500);
        p3.pay(500);
    }
}
