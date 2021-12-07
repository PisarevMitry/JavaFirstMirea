package ru.mirea.pisarevdmitrii.project.entity;

public class CreditCard {

    private int amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        validateCreditCard();
    }

    public void validateCreditCard() {
        amount = 10000;
        //Получаем баланс на стороне платежной системы, проверяем корректность данных
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
