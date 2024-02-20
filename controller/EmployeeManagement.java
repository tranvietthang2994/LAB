package controller;

import model.EmployeeService;
import model.Validate;

public class EmployeeManagement {
    EmployeeService empService = new EmployeeService();
    public void choiceMenu (){
        System.out.println("~~~~~~~~~~~~~Employee Management~~~~~~~~~~~~~");
        System.out.println(
            "1: Display list employees\n"+
            "2: Add new employee\n" + 
            "3: Edit employee\n"+
            "4:Return main menu"
        );

        int choice = Validate.getIntFromInput("choice");
        switch (choice) {
            case 1 -> empService.displayList();
            case 2 -> empService.addEmp();
            default -> System.out.println("NUll");
        }

        
    }

   
}

