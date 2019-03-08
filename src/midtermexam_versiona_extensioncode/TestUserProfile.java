/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author tavin
 */
public class TestUserProfile {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name.");
        String userID = sc.nextLine();
        System.out.println("Please enter your favourite movie genre.");
        System.out.println("Comedy, Drama, Action, Mystery");
        String genre = sc.nextLine();
        UserProfile u1 = new UserProfile(userID, genre);
        System.out.println("User Profile successfully created.");
        
    }
    
}
