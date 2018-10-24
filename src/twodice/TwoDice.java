/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodice;

public class TwoDice {

    public static void main(String[] args) 
    {
     Die first = new Die(0);
     Die second = new Die(0);
     first.displayDice();
     System.out.println("");
     second.displayDice();
    }
    
}
