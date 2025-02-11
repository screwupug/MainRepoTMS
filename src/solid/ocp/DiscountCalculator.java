package solid.ocp;

class WrongDiscountCalculator {

    // При добавлении нового типа клиента придется менять код
    double calculateDiscount(String customerType, double price) {
        if (customerType.equals("VIP")) {
            return price * 0.2;
        } else if (customerType.equals("Regular")) {
            return price * 0.1;
        } else if (customerType.equals("Gold")) {
            return price * 0.3;
        }
        return 0;
    }
}


// Теперь можно добавлять новые скидки без изменения DiscountCalculator
interface DiscountStrategy {
    double applyDiscount(double price);
}

class VipDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}

class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.1;
    }
}

class GoldDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.3;
    }
}

class DiscountCalculator {
    double calculateDiscount(DiscountStrategy strategy, double price) {
        return strategy.applyDiscount(price);
    }
}


