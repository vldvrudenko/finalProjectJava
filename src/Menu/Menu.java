package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;


        do{
            System.out.println("Welcome to our program");
            System.out.println("1: Start watching information");
            System.out.println("2: Start finding and booking your plane");
            System.out.println("3: Delete yor booking");
            System.out.println("4: My trips");
            System.out.println("5: Exit");
            command = scanner.nextLine();
            switch (command){

                case "1":
                    startFindingInfo();
                    break;

                case "2":
                    startFindingPlane();
                    break;
                case "3":
                    deleteYourBooking();
                    break;

                case "4":
                    myTrip();
                    break;
                default:
                    System.out.println("Command not recognized! Make your choise");

            }
    }
        while (command.equals("5"));

    }
}
