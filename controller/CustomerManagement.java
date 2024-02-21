package controller;

import model.CustomerService;
import model.Validate;

public class CustomerManagement {
    CustomerService cusService = new CustomerService();

    public void choiceMenu (){
        boolean check = true;
        do{

        
            System.out.println("~~~~~~~~~~~~~Customer Management~~~~~~~~~~~~~");
            System.out.println(
                "1: Display list customers\n"+
                "2: Add new customer\n" + 
                "3: Edit customer\n"+
                "4:Return main menu"
            );

            int choice = Validate.getIntFromInput("choice");
            switch (choice) {
                case 1 -> cusService.displayList();
                case 2 -> cusService.addCus();
                case 3 -> cusService.editCus();
                case 4 -> check = false;
                default -> System.out.println("Wrong input");
            }

        }while(check);
        
    }
}
