package model;

import java.util.Date;

public abstract class Person {
    String perId;
    String perName;
    Date perBirth;
    String perSex;
    String perCMND;
    String perPhone;
    String perEmail;

    
    
    public Person(String perId) {
        this.perId = perId;
    }
    public Person(String perId, String perName, Date perBirth, String perSex, String perCMND, String perPhone,
            String perEmail) {
        this.perId = perId;
        this.perName = perName;
        this.perBirth = perBirth;
        this.perSex = perSex;
        this.perCMND = perCMND;
        this.perPhone = perPhone;
        this.perEmail = perEmail;
    }
    public String getPerId() {
        return perId;
    }
    public void setPerId(String perId) {
        this.perId = perId;
    }
    public String getPerName() {
        return perName;
    }
    public void setPerName(String perName) {
        this.perName = perName;
    }
    public Date getPerBirth() {
        return perBirth;
    }
    public void setPerBirth(Date perBirth) {
        this.perBirth = perBirth;
    }
    public String getPerSex() {
        return perSex;
    }
    public void setPerSex(String perSex) {
        this.perSex = perSex;
    }
    public String getPerCMND() {
        return perCMND;
    }
    public void setPerCMND(String perCMND) {
        this.perCMND = perCMND;
    }
    public String getPerPhone() {
        return perPhone;
    }
    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone;
    }
    public String getPerEmail() {
        return perEmail;
    }
    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }
    @Override
    public String toString() {
        return "Person [perId=" + perId + ", perName=" + perName + ", perBirth=" + perBirth + ", perSex=" + perSex
                + ", perCMND=" + perCMND + ", perPhone=" + perPhone + ", perEmail=" + perEmail + "]";
    }

    
}
