package main;

import java.util.*;

import main.Fighter;
public class card
{
	public static void main(String[] args) 
	{
	       //Calling list of Fighters form Fighter Class
		   List<Fighter>fighters=Fighter.defaultdeck();
		   List<Fighter> playerOneCards=new ArrayList<Fighter>();
		   List<Fighter> playerTwoCards=new ArrayList<Fighter>();
		   
		   //Shuffling of the Cards
		   Collections.shuffle(fighters);
		   
		   //Distribution of Cards to Players
		   int index=0;
		   for(Fighter someFighter:fighters)
		   {
			  if(index%2==0) 
			  {
				  playerOneCards.add(someFighter);
			  }
		      else
		      {
			   playerTwoCards.add(someFighter);
		      }index++;
		   }  
		  
		   //Working of Game
		   do
		   {
			  int lastIndex=playerOneCards.size()-1; 
		      //Displaying the Card to the player
			  Collections.shuffle(playerOneCards);
			  Collections.shuffle(playerTwoCards);
			  System.out.println("\n\n\n");
			  System.out.println(playerOneCards.get(lastIndex));
		      System.out.println("\nPlease choose any one of the following.\n");
		      @SuppressWarnings("resource")
			  Scanner playerChoice =new Scanner(System.in);
		      String choice=playerChoice.nextLine();
		      System.out.println(playerTwoCards.get(lastIndex));
		   
		      //Condition statements showing what will happen according to the choice of the player
        	   switch (choice)
           {
             case "1":  //When the player wants to play with Rank
             if(playerOneCards.get(lastIndex).rank<playerTwoCards.get(lastIndex).rank)
             {  //If player wins
                System.out.println("\nYour character's Rank is lower than your opponents hence you WIN");
                playerOneCards.add(playerTwoCards.get(lastIndex));
                playerTwoCards.remove(lastIndex);
             }
             else 
             {	//If player loses 
                System.out.println("\nYour character's Rank is greater than your opponents hence you LOSE");	
                playerTwoCards.add(playerOneCards.get(lastIndex));
                playerOneCards.remove(lastIndex); 
             }break;
             
             case "2":   //When the player wants to play with Punch Power
             if(playerOneCards.get(lastIndex).punchPower>playerTwoCards.get(lastIndex).punchPower)
             {  //If player wins
            	System.out.println("\nYour character's Punch Power is greater than your opponents hence you WIN");
            	playerOneCards.add(playerTwoCards.get(lastIndex));
            	playerTwoCards.remove(lastIndex);
             }
             else 
             {  //If player loses
            	System.out.println("\nYour character's Punch Power is lower than your opponents hence you LOSE");
            	playerTwoCards.add(playerOneCards.get(lastIndex));
            	playerOneCards.remove(lastIndex);
             } 

             break;
             
             case "3":  // When the player wants to play with Kick Power
             if(playerOneCards.get(lastIndex).kickPower>playerTwoCards.get(lastIndex).kickPower)
             {  //If player wins
                System.out.println("\nYour character's Kick Power is greater than your opponents hence you WIN");
                playerOneCards.add(playerTwoCards.get(lastIndex));
                playerTwoCards.remove(lastIndex);
             }
             else
             {  //If player loses
            	System.out.println("\nYour character's Kick Power is lower than your opponents hence you LOSE");
            	playerTwoCards.add(playerOneCards.get(lastIndex));
            	playerOneCards.remove(lastIndex);
             }
             break;
             
             case "4":   //When the player wants to play with Special Ability
             if(playerOneCards.get(lastIndex).specialAbilityPower>playerTwoCards.get(lastIndex).specialAbilityPower)
             {  //If player wins
            	System.out.println("\nYour character's Special Ability Power is greater than your opponents hence you WIN");
            	playerOneCards.add(playerTwoCards.get(lastIndex));
            	playerTwoCards.remove(lastIndex);
             }
             else  
             {  //If player loses
            	System.out.println("\nYour character's Special Anility Power is lower than your opponents hence you LOSE");
            	playerTwoCards.add(playerOneCards.get(lastIndex));
            	playerOneCards.remove(lastIndex);
             } 
             
             default:System.out.println("You can choose only four options.");
           }//Process continues until one of the player's number of cards reduces to zero
         }while (playerOneCards.size()!=0 && playerTwoCards.size()!=0);	   
	}
   
}
