package factory_2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("What type of ship (U/H/R): ");
			if(kb.hasNextLine()) {
				String typeOfShip = kb.nextLine();
				theEnemy = shipFactory.makeEnemyShip(typeOfShip);
				if(theEnemy != null) {
					doStuffEnemy(theEnemy);
				} else {
					System.out.println("Please enter U, R, or H next time");
				}
			}
			
		}
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}
