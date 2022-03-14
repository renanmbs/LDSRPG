/*Character Creation and game Intialization
Brielle Hours Login: 12 hours
Renan Hours Login: 16 hours*/

//Import libraries
import java.io.*;
import java.util.*;

//Class
public class CharacterCreation
{

  //Function to present game's menu
  static int greetings(int menu) {

    Scanner scan = new Scanner (System.in); //Start Scanner (user input)

    //Menu
    System.out.println("-----------------------------------------------------");
    System.out.println("Welcome to Choose the Right - RPG game");
    System.out.println("Choose from the following commands to start the game");
    System.out.println("  Press 1 for a new game");
    System.out.println("  Press 2 to continue a game");
    System.out.println("  Press 3 for instructions");
    System.out.println("  Press 4 to try out the test character");
    System.out.println("  Press 5 to exit");
    System.out.println("-----------------------------------------------------");

    //Get user's choice on menu
    menu = scan.nextInt();

    //Handle choice
    switch (menu){

      //New game
      case 1:
          System.out.println("New game");
          break;

      //Continue game
      case 2:
          System.out.println("Continue game");
          break;

      //Instructions
      case 3:
          System.out.println("Instructions? There are no instructions");
          break;

      //Test Character
      case 4:
          System.out.println("Test Character");
          System.out.println();
          break;

      //Exit game
      case 5:
          System.out.println("Exiting...");
          System.exit(0);
          break;
    }

    //Return choice
    return menu;

  }

  //Function to roll information about player
  static void roll() {

    //Variables
    Random r = new Random (); //Generate random number

    int SpiritualityPoints = 0; //Spirituality points

    //Weaknesses
    String Weakness = "Slacking Off";

    //Resistances
    int ResistLust = 0;
    int ResistAnger = 0;
    int ResistIdolality = 0;
    int ResistVanity = 0;
    int ResistSpeech = 0;
    int ResistPhysical = 0;

    //Talents
    int TalentEducation = 0;
    int TalentMusic = 0;
    int TalentArt = 0;
    int TalentWriting = 0;
    int TalentSpeaking = 0;
    int TalentAthletics = 0;

    //Generate number for Spirituality Points and print the result
    SpiritualityPoints = r.nextInt(10) + 1;
    SpiritualityPoints = SpiritualityPoints + 10;
    System.out.println("Spirituality Points: " + SpiritualityPoints);
    System.out.println();

    //Print out statment for Weakness
    System.out.println("Weakness: " + Weakness);
    System.out.println();

    /*RESISTANCE*/
    //Generate random numbers for all of the resistances and print the results
    ResistLust = r.nextInt(100) + 1;
    ResistAnger = r.nextInt(100) + 1;
    ResistIdolality = r.nextInt(100) + 1;
    ResistVanity = r.nextInt(100) + 1;
    ResistSpeech = r.nextInt(100) + 1;
    ResistPhysical = r.nextInt(100) + 1;

    //Print resistances
    System.out.println("Resistances:");
    System.out.println("  Lust Resistance: " + ResistLust);
    System.out.println("  Anger Resistance: " + ResistAnger);
    System.out.println("  Idolality Resistance: " + ResistIdolality);
    System.out.println("  Vanity Resistance: " + ResistVanity);
    System.out.println("  Speech Resistance: " + ResistSpeech);
    System.out.println("  Physical Resistance: " + ResistPhysical);
    System.out.println();

    /*TALENTS*/
    //Generate random numbers for all of the talents and print the results
    TalentEducation = r.nextInt(20) + 1;
    TalentMusic = r.nextInt(20) + 1;
    TalentArt = r.nextInt(20) + 1;
    TalentWriting = r.nextInt(20) + 1;
    TalentSpeaking = r.nextInt(20) + 1;
    TalentAthletics = r.nextInt(20) + 1;

    //Print talents
    System.out.println("Talents:");
    System.out.println("  Education Talent: " + TalentEducation);
    System.out.println("  Music Talent: " + TalentMusic);
    System.out.println("  Art Talent: " + TalentArt);
    System.out.println("  Writing Talent: " + TalentWriting);
    System.out.println("  Speaking Talent: " + TalentSpeaking);
    System.out.println("  Athletics Talent: " + TalentAthletics);
    System.out.println();

  }//End Roll

  //Function to print out a grid
  static void Grid(){

   int[][] array = new int[10][10]; //Create new 10x10 array

      for(int row = 0; row < 10; row++) //Rows
      {
      	for(int col = 0; col < 10; col++) //Columns
      	{
      		System.out.print(array[row][col]); //Print grid Row x Columns

         }

         System.out.println(); //Print Space
      }
  }//End Grid

  //Main function
  public static void main (String[] agrs)

   {
      //Variables
      Scanner in = new Scanner (System.in); //Start Scanner (user input)

      String name = ""; //Name of character

      int SpiritualityPoints = 0; //Spirituality points

      //Weaknesses
      String Weakness = "Slacking Off";

      //Choices by user
      int reroll = 0;
      int menu =  0;
      int continue_game = 0;

      //Start greeting menu
      menu = greetings(menu);

      //If 'New Game' is chosen
      if(menu == 1){

        //Prompt user to enter their character's name
        System.out.print("Please enter your character's name: ");
        name = in.nextLine();
        System.out.println();
        System.out.println("Character's name: " + name);
        System.out.println();

         //Roll information
         roll();

         //Ask for reroll
         System.out.print("Do you want to continue on with these numbers or re-roll? \nEnter 1 to Continue and 2 to Re-Roll:");
         reroll = in.nextInt();
         System.out.println();

         //If the person wants to reroll
         while(reroll == 2){

         //Roll Again
         roll();

         //Ask again for reroll
         System.out.print("Do you want to continue on with these numbers or re-roll? \nEnter 1 to Continue and 2 to Re-Roll:");
         reroll = in.nextInt();
         System.out.println();
         }


        //If the person is satisfied
        if(reroll ==  1){

          System.out.println("Loading game");

      }

    } //End 'New Game'

    //If 'Continue Game' is chosen
    if(menu == 2){

      //Arbitrary name
      name = "My current name";

      //Confirmation to play with that character
      System.out.println("Would  you like to continue with: " + name);
      System.out.println("Press 1 to continue or 2 to restart options ");
      continue_game = in.nextInt();

      //If it is to continue game
      if(continue_game == 1){
        System.out.println("Continuing game... " );
      }

      //If it is not to continue that game
      else{
        System.out.println("Restarting menu... " );
      }

    } //End 'Continue Game'

    //If 'Try out the test character' is chosen
    if(menu == 4){

       Random r = new Random (); //Generate random number

       name = "Test"; //Arbitrary name

       SpiritualityPoints = 0; //Spirituality points

       //Weaknesses
       Weakness = "Slacking Off";

       //Resistances
       int ResistLust = 1;
       int ResistAnger = 10;
       int ResistIdolality = 25;
       int ResistVanity = 50;
       int ResistSpeech = 75;
       int ResistPhysical = 100;

       //Talents
       double TalentEducation = 0;
       double TalentMusic = 0;
       double TalentArt = 0;
       double TalentWriting = 0;
       double TalentSpeaking = 0;
       double TalentAthletics = 0;

       //Percent Chance
       double percentChanceLust = 10.1;
       double percentChanceAnger = 11;
       double percentChanceIdol = 12.5;
       double percentChanceVanity = 15;
       double percentChanceSpeech = 17.5;
       double percentChancePhysical = 20;
       double percentChanceRandom = 0;

       //Holds the value of the tile being placed
       String tile = "";

       System.out.println("Character's name: " + name);
       System.out.println();

       //Generate number for Spirituality Points and print the result
       SpiritualityPoints = r.nextInt(10) + 1;
       SpiritualityPoints = SpiritualityPoints + 10;
       System.out.println("Spirituality Points: " + SpiritualityPoints);
       System.out.println();

       //Print out statment for Weakness
       System.out.println("Weakness: " + Weakness);
       System.out.println();

       //Print resistances
       System.out.println("Resistances:");
       System.out.println("  Lust Resistance: " + ResistLust);
       System.out.println("  Anger Resistance: " + ResistAnger);
       System.out.println("  Idolality Resistance: " + ResistIdolality);
       System.out.println("  Vanity Resistance: " + ResistVanity);
       System.out.println("  Speech Resistance: " + ResistSpeech);
       System.out.println("  Physical Resistance: " + ResistPhysical);
       System.out.println();

       /*TALENTS*/
       //Generate random numbers for all of the talents and print the results
       TalentEducation = r.nextInt(20) + 1;
       TalentMusic = r.nextInt(20) + 1;
       TalentArt = r.nextInt(20) + 1;
       TalentWriting = r.nextInt(20) + 1;
       TalentSpeaking = r.nextInt(20) + 1;
       TalentAthletics = r.nextInt(20) + 1;

       //Print talents with 2 decimal places
       System.out.println("Talents:");
       System.out.println("  Education Talent: " + TalentEducation);
       System.out.println("  Music Talent: " + TalentMusic);
       System.out.println("  Art Talent: " + TalentArt);
       System.out.println("  Writing Talent: " + TalentWriting);
       System.out.println("  Speaking Talent: " + TalentSpeaking);
       System.out.println("  Athletics Talent: " + TalentAthletics);
       System.out.println();

       //Ask for confirmation
       System.out.println("Press 1 to continue....");
       continue_game = in.nextInt(); //Get confirmation from user input

       //If it is to continue game
       if(continue_game == 1){
        System.out.println("Continuing game... " );
        System.out.println();

        int randomTemptation = r.nextInt(6); //Random temptation
        String randomTemptationString = "";

        //Handle random temptation generated
        switch (randomTemptation){

          //random temptation = 1
          case 0:
              randomTemptationString = "LTempt"; //Lust
              break;

          //random temptation = 2
          case 1:
              randomTemptationString = "ATempt"; //Anger
              break;

          //random temptation = 3
          case 2:
              randomTemptationString = "ITempt"; //Idolatry
              break;

          //random temptation = 4
          case 3:
              randomTemptationString = "VTempt"; //Vanity
              break;

          //random temptation = 5
          case 4:
              randomTemptationString = "STempt"; //Speech
              break;

          //random temptation = 6
          case 5:
            randomTemptationString = "Ptempt"; //Physical
            break;

        }

        //Print random temptation
        System.out.println("The randomly selected temptation was: " + randomTemptationString);
        System.out.println();

        //Double array to hold 100 tiles
        String[][] tiles = new String[10][10]; //Array size 10x10

    /*Generate 100 tiles*/

    //Rows
    for(int row = 0; row < 10; row++){
        //Columns
        for(int column = 0; column < 10; column++){

            //Set percentages
            int tile_chosen = r.nextInt(6);

            //Handle random tile generated
            switch (tile_chosen){

              //tile = 1
              case 0:
                  tile = "L"; //Lust
                  break;

              //tile = 2
              case 1:
                  tile = "A"; //Anger
                  break;

              //tile = 3
              case 2:
                  tile = "I"; //Idolatry
                  break;

              //tile = 4
              case 3:
                  tile = "V"; //Vanity
                  break;

              //tile = 5
              case 4:
                  tile = "S"; //Speech
                  break;

              //tile = 6
              case 5:
                tile = "P"; //Physical
                break;
            }

            tiles[row][column] = tile; //Populate the array with the tile values
        }

      }

    /*Print grid*/
    //For all strings in tiles put in a single array
    for(String[] temporary_tiles: tiles){
        //For all strings in array temporary_tiles put in a single string
        for(String tile_string: temporary_tiles){

          System.out.print(tile_string + " "); //Print tile value (tile_string)

        }

        System.out.println(); //Print space
    }

      }//End If

    }//End Test

  } //End main

} //End class
