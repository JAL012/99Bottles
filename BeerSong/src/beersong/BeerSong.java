/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author jheryllezama
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ninety_Nine_Bottles_of_Beer(); //Calls Method for Displaying "99 Bottles of Beer" Song
    }
    
    public static void Ninety_Nine_Bottles_of_Beer(){
        
        //Counter (Initialized To 99 Beers)
        int beer = 99;
        
        //While Loop (Condition: Until There is 1 Beer Left)
        while (beer != 1) {
            
            //First Verse (Default)
            System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer");
            
            //Decrease Beer By One (For each Loop)
            beer -= 1;
            
            //Second Verse (1 Beer Left)
            if (beer == 1){
                System.out.println("take one down, pass it around, " + beer + " bottle of beer on the wall.");
                System.out.println(); //Formatting Output
            }
            
            //Second Verse (Default)
            else {
                System.out.println("take one down, pass it around, " + beer + " bottles of beer on the wall.");
                System.out.println(); //Formatting Output
            }
        }
        
        //First Verse (1 Beer Left)
        System.out.println(beer + " bottle of beer on the wall, " + beer + " bottle of beer");
        
        //Second Verse (1 Beer Left)
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
        System.out.println(); //Formatting Output
    }
    
}
