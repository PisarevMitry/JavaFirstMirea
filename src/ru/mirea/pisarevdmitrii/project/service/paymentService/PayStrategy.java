package ru.mirea.pisarevdmitrii.project.service.paymentService;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
