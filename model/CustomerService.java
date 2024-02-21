package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    List<Customer> listCus;
    public CustomerService(){
        listCus = new ArrayList<>();
    } 

    public boolean checkExistID(String id, List<Customer> cusList){
        for(Customer cus : cusList){
            if(cus.getPerId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public void displayList(){
        if(!listCus.isEmpty()){
            System.out.println("                          \t~~~~~~~~~~~~~~~~~~~~~~~~ List Customer~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            for(Customer cus : listCus){
                System.out.println(cus);
            }
        }else{
            System.out.println("List is Empty!");
        }
    }

    public void addCus(){
        boolean checkID = false;
        String codeId;
        System.out.println("\nAdd new employee");
        try{

        
            do{
                codeId = Validate.getStringFromInput("ID");
                
                if(checkExistID(codeId, listCus)){
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

            String cusLevel = Validate.getStringFromInput("level");

            String cusAddress = Validate.getStringFromInput("Address");

            Customer cus = new Customer(codeId, perName, perBirth, perSex, perCMND, perPhone, perEmail, cusLevel, cusAddress);
            listCus.add(cus);
        }catch (ParseException e) {
            e.printStackTrace();
        }
      
    }

    public void editCus(){
        Scanner sc = new Scanner(System.in);
        try{

       
            boolean check = false;
            String perId;
            System.out.println("                          \t~~~~~~~~~~~~~~~~~~~~~~~~ EDIT Employee~~~~~~~~~~~~~~~~~~~~~~~~");
            do{

                perId = Validate.getStringFromInput("ID");
                if (checkExistID(perId, listCus)) {
                    System.out.println("~~~~~~~~~What type do you want to change?");
                    System.out.println(
                        "1: Name\n"+
                        "2: Date of birth\n"+
                        "3: Sex\n"+
                        "4: CMND\n"+
                        "5: Phone number\n"+
                        "6: Email\n"+
                        "7: Level\n"+
                        "8: Address"
                    );
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    check = true;
                }else{
                    System.out.println("ID has not Exist!!");
                    check = false;
                }
            }while(!check);

            int choice = Validate.getIntFromInput("Choice");
            
            switch (choice) {
                    case 1:
                        System.out.println("~~~~~~~~~What name you want to change?");
                        String name = sc.nextLine();
                        for(Customer cus : listCus){
                            if (cus.getPerId().equals(perId)) {
                                cus.setPerName(name);
                            }
                        }
                        break;
                    case 2: 
                        System.out.println("~~~~~~~~~What date of birth you want to change?");
                        try {
                            Date date = Validate.getDateFromInput();
                            for(Customer cus : listCus){
                                if (cus.getPerId().equals(perId)) {
                                    cus.setPerBirth(date);
                                }
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        System.out.println("~~~~~~~~~What SEX you want to change?");
                        String sex = sc.nextLine();
                        for(Customer cus : listCus){
                            if (cus.getPerId().equals(perId)) {
                                cus.setPerSex(sex);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("~~~~~~~~~What CMND you want to change?");
                        String CMND = sc.nextLine();
                        for(Customer cus : listCus){
                            if (cus.getPerId().equals(perId)) {
                                cus.setPerCMND(CMND);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("~~~~~~~~~What Phone number you want to change?");
                        String phoneNumber = sc.nextLine();
                        for(Customer  cus : listCus){
                            if ( cus.getPerId().equals(perId)) {
                                 cus.setPerPhone(phoneNumber);
                            }
                        }
                        break;
                    case 6:
                        System.out.println("~~~~~~~~~What Email you want to change?");
                        String email = sc.nextLine();
                        for(Customer  cus : listCus){
                            if ( cus.getPerId().equals(perId)) {
                                 cus.setPerEmail(email);
                            }
                        }
                        break;
                    case 7:
                        System.out.println("~~~~~~~~~What Level you want to change?");
                        String level = sc.nextLine();
                        for(Customer  cus : listCus){
                            if ( cus.getPerId().equals(perId)) {
                                 cus.setEmpLevel(level);
                            }
                        }
                        break;
                    case 8:
                        System.out.println("~~~~~~~~~What Address you want to change?");
                        String address = sc.nextLine();
                        for(Customer cus : listCus){
                            if ( cus.getPerId().equals(perId)) {
                                 cus.setEmpAddress(address);
                            }
                        }
                        break;
        
                    default:
                        System.out.println("!!!!!!!!!!!!!!!!None of choice please try again!!!!!!!!!!!!!!!!");
                    break;
            }

        }catch (NumberFormatException e) {
            System.out.println("!!!!!!!!!!!!!!!!Wrong Format input!!!!!!!!!!!!!!!!");
        }

    }
}
