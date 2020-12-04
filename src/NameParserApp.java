/*
Kearstin Carden
11/24/2020
Program accepts a name from the user and outputs the first, last and middle from
the entry.
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        name = name.trim();
        
        int index1 = name.indexOf(" ");
        if(index1 == -1){
            //must have first and last name.
            System.out.println("Name not in valid format.");
        }
        else {
            int index2 = name.indexOf(" ", index1 + 1);
            //if only two spaces
            if(index2 == -1){
                //cutting out the names using the spaces as identifiers 
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
            }
            else {
                int index3 = name.indexOf(" ", index2 + 1);
                //if three spaces
                if(index3 == -1){
                    //cutting out the names using the spaces as identifiers 
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    System.out.println("First name: " + firstName);
                    System.out.println("Middle name: " + middleName);
                    System.out.println("Last name: " + lastName);
                }
                //if more than three spaces
                else {
                    //Can only have three spaces.
                    System.out.println("Name not in valid format.");
                }
                
            }
        }
    }
}
