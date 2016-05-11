/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_design_pattern;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        
         // Create the factory object
	        EnemyShipFactory shipFactory = new EnemyShipFactory();
	         
	        // Enemy ship object
	         
	        EnemyShip theEnemy = null;
	         
	        Scanner userInput = new Scanner(System.in);
	         
	        System.out.print("What type of ship? (U / R / B)");
	         
	        if (userInput.hasNextLine()){
	             
	            String typeOfShip = userInput.nextLine();
	         
	            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
	             
	            if(theEnemy != null){
	                 
	                doStuffEnemy(theEnemy);
	                 
	            } else System.out.print("Please enter U, R, or B next time");
	         
	        }
    }  

	     
    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followHeroShip();

        anEnemyShip.enemyShipShoots();

    }
        
}
