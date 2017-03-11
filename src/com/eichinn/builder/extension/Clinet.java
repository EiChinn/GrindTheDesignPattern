package com.eichinn.builder.extension;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class Clinet {
    public static void main(String[] args) {
        InsuranceContract insuranceContract = new InsuranceContract.Builder("001", 245L, 789L).setPersonName("shana").setOtherData("otherData").build();
        insuranceContract.someOperation();
    }
}
