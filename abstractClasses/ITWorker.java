package com.timurradko.itCompany.abstractClasses;

import com.timurradko.itCompany.CoffeeMaker;

public abstract class ITWorker implements CoffeeMaker {
    public boolean coffee;

    public ITWorker(boolean coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        System.out.print("- I made coffee! ");
        coffee = true;
    }
}
