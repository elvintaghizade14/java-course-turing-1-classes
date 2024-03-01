package az.edu.turing.module02.lesson09;

public final class OrderStatus {

/*    public static final String ACCEPTED = "ACCEPTED";
    public static final String SHIPPED = "SHIPPED";
    public static final String DELIVERED = "DELIVERED";
    public static final String CANCELED = "CANCELED";*//*
    */

    private OrderStatus() {
    }
/*    public static *//*final*//* String findStatus(String status) {
        if (ACCEPTED.equalsIgnoreCase(status)) {
            return ACCEPTED;
        } else if (SHIPPED.equalsIgnoreCase(status)) {
            return SHIPPED;
        } else if (DELIVERED.equalsIgnoreCase(status)) {
            return DELIVERED;
        } else {
            return null;
        }
    }*/

    public static /*final*/ OrderStatusEnum findStatusV2(String status) {
        return OrderStatusEnum.valueOf(status);
    }
}
