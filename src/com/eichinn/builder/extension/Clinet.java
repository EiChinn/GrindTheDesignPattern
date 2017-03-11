package com.eichinn.builder.extension;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class Clinet {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("001", 245L, 789L);
        InsuranceContract insuranceContract = builder.setCompanyName("ei_chinn").setPersonName("shana").setOtherData("otherData").build();
        insuranceContract.someOperation();
    }
}
