package model;
public class Customer {
    String empLevel;
    String empAddress;
    public String getEmpLevel() {
        return empLevel;
    }
    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    @Override
    public String toString() {
        return "Customer [empLevel=" + empLevel + ", empAddress=" + empAddress + "]";
    }

    
}
