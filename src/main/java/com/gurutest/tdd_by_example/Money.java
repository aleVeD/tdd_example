package com.gurutest.tdd_by_example;

public class Money implements Expression {

    protected int amount;
    protected String currency;
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money reduce(String to){
        return this;
    }

    protected String currency() {
        return currency;
    }

    public static Money dollar(int dollar){
        return new Money(dollar, "USD");
    }
    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.currency.equals(money.currency);
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, this.currency);
    }

    public Expression plus(Money addend){
        return new Sum(this, addend);
    }
}
