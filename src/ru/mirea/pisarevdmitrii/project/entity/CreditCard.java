package ru.mirea.pisarevdmitrii.project.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return number.equals(that.number) && date.equals(that.date) && cvv.equals(that.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, date, cvv);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
