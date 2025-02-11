package solid.dip;

class Cash {
    public void doTransaction(int amount) {
        //logic
    }
}


class Shop {

    // Нарушение принципа DIP - класс зависит от конкретной реализации
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(Object order, int amount){
        payments.doTransaction(amount);
    }
}


class Main {
    public static void main(String[] args) {
        Payments cash = new NewCash();
        BankCard card = new BankCard();
        Shop shop = new Shop(card);
        shop.doPayment(null, 100);
    }
}


interface Payments {
    void doTransaction(int amount);
}

class NewCash implements Payments {
    @Override
    public void doTransaction(int amount) {
        System.out.println("by cash");
    }
}

class BankCard implements Payments {
    @Override
    public void doTransaction(int amount) {
        System.out.println("by bank");
    }
}

class PhonePayment implements Payments {
    @Override
    public void doTransaction(int amount) {
        System.out.println("by phone");
    }
}