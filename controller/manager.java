package controller;

import view.Menu;

public class manager extends Menu{
    EmployeeManagement employeeManagement = new EmployeeManagement();
    

    public manager(){
        super("\n~~~~~~~~~~~~~~~~~~~~~~~~~MANAGER~~~~~~~~~~~~~~~~~~~~~~~~~", new String[]{
            "Employee management",
            "Customer Management"
        });
    
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 -> employeeManagement.choiceMenu();
        }
    }
    
    public static void main(String[] args) {
        manager ma = new manager();
        ma.run();
    }
}
