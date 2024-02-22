/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Facility;
import model.House;
import model.Room;
import model.Villa;
import repository.FacilityRepository;
import view.Menu;

/**
 *
 * @author DELL
 */
public class FacilityService extends Menu {

    static List<Facility> listFacility = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public FacilityService() {
    }

    public FacilityService(String td, String[] mc) {
        super(td, mc);
        addCung();
    }

    public static List<Facility> getListFacility() {
        return listFacility;
    }

    public static void setListFacility(List<Facility> listFacility) {
        FacilityService.listFacility = listFacility;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList getmChon() {
        return mChon;
    }

    public void setmChon(ArrayList mChon) {
        this.mChon = mChon;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                displayFacility();
                break;
            }

            case 2 -> {
                addNewFacility();
                break;
            }

            case 3 -> {
                displayListFacilityMaintainence();
                break;
            }
            case 4 -> {
                return;
            }
        }
    }

    public static void displayFacility() {
        System.out.println("+----------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 List of Student                                                |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------|");
        System.out.println(String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |", "Service code", "Service name", "Area", "Price", "Quantity of people", "Type", "Floor"));
        System.out.println("|--------------|--------------|--------------|--------------|----------------------|--------------|--------------|");
        for (Facility facility : listFacility) {
            System.out.println(facility.toString());
        }
        System.out.println("+----------------------------------------------------------------------------------------------------------------+");
    }

    public static void addNewFacility() {
        String[] mc = {"Add New Villa",
            "Add New House",
            "Add New Room",
            "Back to menu"};

        MenuCase2 menuCase2 = new MenuCase2("Choose 1", mc);
        menuCase2.run();
    }

    public static void addCung() {
        if (listFacility.isEmpty()) {
            listFacility.add(new Villa("SVVL-0001", "Villa", 100, 10000, 8, 1, 3));
            listFacility.add(new House("SVHO-0001", "House", 70, 7000, 4, 2, 1));
            listFacility.add(new Room("SVRO_0001", "Room", 40, 3500, 2, 3, 1));
        }
    }

    public static void displayListFacilityMaintainence() {
        String choice = "ÿ";
        do {
            System.out.println("Nhap vao service ID: ");
            String svID = sc.nextLine();

            for (Facility facility : listFacility) {
                if (svID.equals(facility.getSvID())) {

                }
            }
        } while (choice.equalsIgnoreCase("y"));
    }

    static class MenuCase2 extends Menu<String> {

        public MenuCase2() {
        }

        public MenuCase2(String td, String[] mc) {
            super(td, mc);
        }

        @Override
        public void execute(int n) {
            switch (n) {
                case 1 -> {
                    System.out.println("Enter service ID: ");
                    String svID = getSvIDFromInput("ID");
                    listFacility.add(addFacility(svID));
                    displayFacility();
                    break;
                }

                case 2 -> {
                    System.out.println("Enter service ID: ");
                    String svID = getSvIDFromInput("ID");
                    listFacility.add(addFacility(svID));
                    displayFacility();
                    break;
                }

                case 3 -> {
                    System.out.println("Enter service ID: ");
                    String svID = sc.nextLine();
                    listFacility.add(addFacility(svID));
                    displayFacility();
                    break;
                }
                case 4 -> {
                    return;
                }

            }
        }
    }

    public static Facility addFacility(String svID) {
        System.out.println("Enter service name: ");
        String svName = sc.nextLine();
        System.out.println("Enter area: ");
        double svArea = sc.nextDouble();
        System.out.println("Enter Price: ");
        double svPrice = sc.nextDouble();
        System.out.println("Enter the quantity of people: ");
        int svPeople = sc.nextInt();
        System.out.println("Enter the type of service: ");
        int svType = sc.nextInt();
        System.out.println("Enter the floors: ");
        int svFloor = sc.nextInt();
        Facility nFacility = new Facility(svID, svName, svArea, svPrice, svPeople, svType, svFloor);
        return nFacility;
    }
}
