package com.eichinn.builder.extension;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class InsuranceContract {
    //require
    private String contractId;
    private long beginDate;
    private long endDate;

    //option
    private String personName;
    private String companyName;
    private String otherData;

    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();


        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.otherData = builder.getOtherData();
    }

    public void someOperation() {
        System.out.println("Now in Insurance Contract someOperation == " + this.contractId);
    }
}
