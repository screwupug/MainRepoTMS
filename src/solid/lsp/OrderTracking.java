package solid.lsp;

public class OrderTracking {

    boolean isDelivered(int status) {
        if (status == 1) {
            return true;
        } else {
            return false;
        }
    }
}

class NumberOrderTracking extends OrderTracking {

    @Override
    boolean isDelivered(int status) {
        if (status == 1) {
            return true;
        } else if (status == 4){
            throw new RuntimeException();
        } else {
            return false;
        }
    }
}


