package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person{
 
   
    String empLevel;
    String empPosition;
    int empSalary;
  

    public Employee(String perId, String perName, Date perBirth, String perSex, String perCMND, String perPhone,
            String perEmail, String empLevel, String empPosition, int empSalary) {
        super(perId, perName, perBirth, perSex, perCMND, perPhone, perEmail);
        this.empLevel = empLevel;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
    }
    public Employee(String perId, String empLevel, String empPosition, int empSalary) {
        super(perId);
        this.empLevel = empLevel;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
    }
    public String getEmpLevel() {
        return empLevel;
    }
    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }
    public String getEmpPosition() {
        return empPosition;
    }
    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Employee ["+"perID ="+perId+",perName = "+perName+",perBirth= "+dateFormat.format(perBirth)+",perSex= "+perSex+",perCMND = "+perCMND+",perPhone= "+perPhone+",perEmail= "+perEmail+",empLevel=" + empLevel + ", empPosition=" + empPosition + ", empSalary=" + empSalary + "]";
    }
    

    
}
