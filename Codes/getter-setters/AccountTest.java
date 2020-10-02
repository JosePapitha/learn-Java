/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class AccountTest {
public static void main (String args[]){
   Scanner input = new Scanner(System.in);
   Account myAccount = new Account();
   System.out.println("Initial Value of name : " +myAccount.getName());
   System.out.println("Please enter the name :");
   String theName = input.nextLine();
   myAccount.setName(theName);
   System.out.println("\n Name in object Account : " + myAccount.getName());
   
}   
}
