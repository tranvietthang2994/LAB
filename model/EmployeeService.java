package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeService  {

    List<Employee> listEmp;

    public EmployeeService(){
        listEmp = new ArrayList<>();
    }

    public boolean checkExistID(String id, List<Employee> empList){
        for(Employee emp : listEmp){
            if(emp.getPerId().equals(id)){
                return true;
            }
        }
        return false;
    }


    public void displayList(){
        if(!listEmp.isEmpty()){
            System.out.println("                          \t~~~~~~~~~~~~~~~~~~~~~~~~ List Student GPA ~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            for(Employee emp : listEmp){
                System.out.println(emp);
            }
        }else{
            System.out.println("List is Empty!");
        }
    }

    public void addEmp(){
        boolean checkID = false;
        String codeId;
        System.out.println("\nAdd new Employee");
        
        try {
            do{
                codeId = Validate.getStringFromInput("ID");
                //check empId validate
        
                if(checkExistID(codeId, listEmp)){
                    checkID = false;
                    System.out.println("ID has existed");

                }else{
                    checkID = true;
                }
        
            }while(!checkID);
        
        String perName = Validate.getStringFromInput("Name");

        System.out.print("Enter date (dd/MM/yyyy): ");
         Date perBirth = Validate.getDateFromInput();

         String perSex = Validate.getStringFromInput("Sex");

        String perCMND = Validate.getStringFromInput("CMND");

        String perPhone = Validate.getStringFromInput("Phone number");

        String perEmail = Validate.getStringFromInput("Email");

        String empLevel = Validate.getStringFromInput("Level");

        String empPosition = Validate.getStringFromInput("Position");

        int empSalary = Validate.getIntFromInput("salary");

        Employee emp = new Employee(codeId, perName, perBirth, perSex, perCMND, perPhone, perEmail, empLevel, empPosition, empSalary);

        listEmp.add(emp);
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
