/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsarrays;

import java.util.Scanner;

/**
 *
 * @author Enubs
 */
public class DSArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Person person1 = new Person("DELA CRUZ", "JUAN", "RUIZ", "DAVAO CITY", 25);
//        System.out.println(person1.getFirstname() + " " +
//                person1.getMiddlename().charAt(0) + ". " +
//                person1.getLastname() + ", " + 
//                person1.getAge() + "\n" +
//                person1.getAddress());

        Person[] persons = new Person[3];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < persons.length; i++){
            System.out.print("Firstname: ");
            String firstname = input.nextLine();
            System.out.print("Middlename: ");
            String middlename = input.nextLine();
            System.out.print("Lastname: ");
            String lastname = input.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());
            System.out.print("Address: ");
            String address = input.nextLine();
            persons[i] = new Person(lastname, firstname, middlename, address, age);
        }
        
        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getFirstname() + " " +
                persons[i].getMiddlename().charAt(0) + ". " +
                persons[i].getLastname() + ", " + 
                persons[i].getAge() + "\n" +
                persons[i].getAddress());
        }
    }
    
}
