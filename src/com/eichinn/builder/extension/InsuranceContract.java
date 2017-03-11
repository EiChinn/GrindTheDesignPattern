package com.eichinn.builder.extension;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class InsuranceContract {
    //require
    private final String contractId;
    private final long beginDate;
    private final long endDate;

    //option
    private final String personName;
    private final String companyName;
    private final String otherData;

    private InsuranceContract(Builder builder) {
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

    public static class Builder {
        //require
        private final String contractId;
        private final long beginDate;
        private final long endDate;

        //option
        private String personName = "";
        private String companyName = "";
        private String otherData = "";

        public Builder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        /********** builder的类setter方法，可对单个数据进行合法性校验，不合法则抛出IllegalStateException **********/
        public Builder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }
        /********** builder的类setter方法，可对单个数据进行合法性校验，不合法则抛出IllegalStateException **********/


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

        /**
         * build方法创建目标对象。
         * 创建目标对象之前，可在此对所有数据进行约束规则校验，不符合条件则抛出IllegalStateException
         * @return
         */
        public InsuranceContract build() {
            if (isStringEmpty(contractId)) {
                throw new IllegalStateException("ContractId can't be empty");
            }

            if (isStringEmpty(personName) && isStringEmpty(companyName)) {
                throw new IllegalStateException("PersonName and CompanyName can't all be empty");
            }

            if (!isStringEmpty(personName) && !isStringEmpty(companyName)) {
                throw new IllegalStateException("PersonName and CompanyName can't all be not empty");

            }
            return new InsuranceContract(this);
        }

        private boolean isStringEmpty(String string) {
            return string == null || string.trim().length() == 0;
        }
    }

}
