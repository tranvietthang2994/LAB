package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import controller.Validation;

public class EmployeeService  {

    List<Employee> listEmp;

    public EmployeeService(){
        listEmp = new ArrayList<>();
    }

    public boolean checkExistID(String id, List<Employee> empList){
        for(Employee emp : empList){
            if(emp.getPerId().equals(id)){
                return true;
            }
        }
        return false;
    }


    public void displayList(){
        if(!listEmp.isEmpty()){
            System.out.println("                          \t~~~~~~~~~~~~~~~~~~~~~~~~ List Employee~~~~~~~~~~~~~~~~~~~~~~~~");
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
        
            do{
                codeId = Validation.getEmpIDFromInput("ID");
                //check empId validate
        
                if(checkExistID(codeId, listEmp)){
                    checkID = false;
                    System.out.println("ID has existed");

                }else{
                    checkID = true;
                }
        
            }while(!checkID);
        
        String perName = Validation.getPerNameFromInput("Name");

         Date perBirth = Validation.getBirthFromInput("date of birth");

         String perSex = Validation.getStringFromInput("Sex");

        String perCMND = Validation.getPerCMNDFromInput("CMND");

        String perPhone = Validation.getPerPhoneFromInput("Phone number");

        String perEmail = Validation.getStringFromInput("Email");

        String empLevel = Validation.getStringFromInput("Level");

        String empPosition = Validation.getStringFromInput("Position");
        
        int empSalary = Validation.getIntFromInput("salary");

        Employee emp = new Employee(codeId, perName, perBirth, perSex, perCMND, perPhone, perEmail, empLevel, empPosition, empSalary);

        listEmp.add(emp);
        
       
    }

    public void editEmp(){
        Scanner sc = new Scanner(System.in);
        try {
            
        
        boolean check = false;
        String perId;
        System.out.println("                          \t~~~~~~~~~~~~~~~~~~~~~~~~ EDIT Employee~~~~~~~~~~~~~~~~~~~~~~~~");
        do{

            perId = Validation.getEmpIDFromInput("ID");
            if (checkExistID(perId, listEmp)) {
                System.out.println("~~~~~~~~~What type do you want to change?");
                System.out.println(
                    "1: Name\n"+
                    "2: Date of birth\n"+
                    "3: Sex\n"+
                    "4: CMND\n"+
                    "5: Phone number\n"+
                    "6: Email\n"+
                    "7: Level\n"+
                    "8: Position\n"+
                    "9: Salary"

                );
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                check = true;
            }else{
                System.out.println("ID has not Exist!!");
                check = false;
            }
        }while(!check);

        int choice = Validation.getIntFromInput("Choice");
        switch (choice) {
            case 1:
                System.out.println("~~~~~~~~~What name you want to change?");
                String name = Validation.getPerNameFromInput("Name");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setPerName(name);
                    }
                }
                break;
            case 2: 
                 System.out.println("~~~~~~~~~What date of birth you want to change?");
                
                    Date date = Validation.getBirthFromInput("date of birth");
                    for(Employee emp : listEmp){
                        if (emp.getPerId().equals(perId)) {
                            emp.setPerBirth(date);
                        }
                    }
                
                break;
            case 3:
                System.out.println("~~~~~~~~~What SEX you want to change?");
                String sex = Validation.getStringFromInput("Sex");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setPerSex(sex);
                    }
                }
                break;
            case 4:
                 System.out.println("~~~~~~~~~What CMND you want to change?");
                String CMND = Validation.getPerCMNDFromInput("CMND");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setPerCMND(CMND);
                    }
                }
                break;
            case 5:
                System.out.println("~~~~~~~~~What Phone number you want to change?");
                String phoneNumber = Validation.getPerPhoneFromInput("Phone number");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setPerPhone(phoneNumber);
                    }
                }
                break;
            case 6:
                 System.out.println("~~~~~~~~~What Email you want to change?");
                String email = Validation.getStringFromInput("Email");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setPerEmail(email);
                    }
                }
                break;
            case 7:
                System.out.println("~~~~~~~~~What Level you want to change?");
                String level = Validation.getStringFromInput("Level");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setEmpLevel(level);
                    }
                }
                break;
            case 8:
                System.out.println("~~~~~~~~~What Position you want to change?");
                String position = Validation.getStringFromInput("Position");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setEmpPosition(position);
                    }
                }
                break;
            case 9:
                System.out.println("~~~~~~~~~What Salary you want to change?");
                int salary = Validation.getIntFromInput("salary");
                for(Employee emp : listEmp){
                    if (emp.getPerId().equals(perId)) {
                        emp.setEmpSalary(salary);
                    }
                }
                break;

            default:
                System.out.println("!!!!!!!!!!!!!!!!None of choice please try again!!!!!!!!!!!!!!!!");
                break;
        }

        } catch (NumberFormatException e) {
            System.out.println("!!!!!!!!!!!!!!!!Wrong Format input!!!!!!!!!!!!!!!!");
        }


    }
}
