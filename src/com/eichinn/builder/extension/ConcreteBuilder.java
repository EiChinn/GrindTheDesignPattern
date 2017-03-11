package com.eichinn.builder.extension;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class ConcreteBuilder {
    //require
    private String contractId;
    private long beginDate;
    private long endDate;

    //option
    private String personName;
    private String companyName;
    private String otherData;

    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    public String getContractId() {
        return contractId;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getOtherData() {
        return otherData;
    }

    public InsuranceContract build() {
        return new InsuranceContract(this);
    }
}
