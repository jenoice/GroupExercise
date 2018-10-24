/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodice;

public class Die 
{
   private final int LOWEST_DIE_VALUE = 1;
   private final int HIGHEST_DIE_VALUE = 6;
   private int random = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + 
           LOWEST_DIE_VALUE);
   
   public Die(int rad)
   {
     rad = random;
   }
   public void displayDice()
   {
    System.out.println("you rolled a " + random + "/nAmazing");
   }
}
