import java.util.Scanner;
/*
Name: Megan Ianni
Date: 12/1/2020
This program prints out your first and last name or the first, middle, and 
last name when the first and last or full name is entered.
*/
public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        name = name.trim();
        
        int index1 = name.indexOf(" ");
        if (index1 == -1) {
            System.out.println("Name not in valid format.");
        } else {
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1) {
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name:  " + firstName);
                System.out.println("Last name:  " + lastName);
            } else {
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    System.out.println("First name:     " + firstName);
                    System.out.println("Middle name:     " + middleName);
                    System.out.println("Last name:     " + lastName);
                } else {
                    System.out.println("Name not in valid format.");
                }
            }
        }
    }
}
