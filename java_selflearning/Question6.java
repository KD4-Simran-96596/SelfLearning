class ECommerceException extends Exception {
    public ECommerceException(String msg) {
        super(msg);
    }
}

class PaymentException extends ECommerceException {
    public PaymentException(String msg) {
        super(msg);
    }
}

class InventoryException extends ECommerceException {
    public InventoryException(String msg) {
        super(msg);
    }
}

class ShippingException extends ECommerceException {
    public ShippingException(String msg) {
        super(msg);
    }
}

public class TestException {
    public static void main(String[] args) {
        try {
            throw new PaymentException("Payment failed!");
        } catch (ECommerceException e) {
            System.out.println(e.getMessage());
        }
    }
}
