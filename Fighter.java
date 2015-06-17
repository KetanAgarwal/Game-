package main;

import java.util.*;
public class Fighter
{
   //Attributes with which player will play the game	
   public String name;
   public String qualities;
   public int rank;
   public double punchPower;
   public double kickPower;
   public double specialAbilityPower;

   public Fighter(String name,String qualities,int rank,double punchPower,double kickPower,double specialAbilityPower)
   {   
	   this.name=name;
	   this.qualities=qualities;
	   this.rank=rank;
	   this.punchPower=punchPower;
	   this.kickPower=kickPower;
	   this.specialAbilityPower=specialAbilityPower;
   }
   
   public String toString()
   {   
	   //returning the attributes to the player
	   return "Name:-" + this.name + "\nQualities:-" + this.qualities + "\n1- Rank:-" + this.rank + "\n2- Punch Power:-" + this.punchPower + "\n3- Kick Power:-" + this.kickPower + "\n4- Special Ability Power:-" + this.specialAbilityPower;
   }
   
   public static List<Fighter> defaultdeck()
   {   
	   //List of characters used in game
	   List<Fighter> deck=new ArrayList<Fighter>(); 
	   deck.add(new Fighter("Firen","Feral",9,7.5,8.0,8.5));
	   deck.add(new Fighter("Freeze","Feral",11,4.0,6.5,8.0));
	   deck.add(new Fighter("Deep","Resilient",12,9.0,5.5,7.0));
	   deck.add(new Fighter("John","Intelligent",10,8.0,4.5,7.5));
	   deck.add(new Fighter("Stirzen","Leadership",1,8.5,5.0,9.5));
	   deck.add(new Fighter("Firzee","Quick",2,4.5,7.5,9.0));
	   deck.add(new Fighter("Redbat","Leadership",3,5.0,3.5,6.0));
	   deck.add(new Fighter("Louis","Loyalty",4,9.5,6.0,6.5));
	   deck.add(new Fighter("Davis","Leadership",5,7.0,4.0,5.0));
	   deck.add(new Fighter("Dennis","Quick",6,5.5,9.5,5.5));
	   deck.add(new Fighter("Woody","Resilient",7,3.5,8.5,4.0));
	   deck.add(new Fighter("Rudolf","Skirmisher",8,3.0,7.0,4.5));
	   return deck;
   }
}
