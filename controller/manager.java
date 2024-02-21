package controller;

import view.Menu;

public class manager extends Menu{
    EmployeeManagement employeeManagement = new EmployeeManagement();
    CustomerManagement customerManagement = new CustomerManagement();

    public manager(){
        super("\n~~~~~~~~~~~~~~~~~~~~~~~~~MANAGER~~~~~~~~~~~~~~~~~~~~~~~~~", new String[]{
            "Employee management",
            "Customer Management"
        });
    
    }

    @Override
    public void execute(int choice) {
        boolean check = true;
        

            switch (choice) {
                case 1-> employeeManagement.choiceMenu();
                case 2 -> customerManagement.choiceMenu();
                default -> {
                    System.out.println("Wrong input");
                    check = false;
            }
            }
       
    }
    
    public static void main(String[] args) {
        manager ma = new manager();
        ma.run();
    }
}
