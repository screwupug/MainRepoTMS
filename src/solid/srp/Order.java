package solid.srp;

/*
Этот класс делает слишком много:
Считает сумму заказа.
Сохраняет заказ в базу данных.
Отправляет уведомление.
 */
class WrongOrder {
    public void calculateTotal() { /* Логика расчета цены */ }
    public void saveToDatabase() { /* Логика сохранения в БД */ }
    public void sendEmail() { /* Логика отправки письма */ }
}

// Каждый класс отвечает только за свою задачу
class Order {
    void calculateTotal() { /* Логика расчета цены */ }
}

class OrderRepository {
    void saveToDatabase(Order order) { /* Логика сохранения в БД */ }
}

class EmailService {
    void sendEmail(Order order) { /* Логика отправки письма */ }
}
