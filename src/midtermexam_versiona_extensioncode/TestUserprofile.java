/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author jaina
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        System.out.println("Enter your userID: ");
        String userID = scanner.nextLine();
        
        System.out.println("Choose your favourite genre: ");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int chosenGenreIndex = scanner.nextInt();
        String chosenGenre = genres[chosenGenreIndex - 1];
        
        UserProfile userProfile = new UserProfile(userID, chosenGenre);
        
        System.out.println("Your userProfile was created successfully!");
    }
}
