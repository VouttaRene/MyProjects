/*Main Game data for Mastermind
    by René Voutta

    Version 0.2 -- 
    Changes:    -

    Version 0.1 -- 18.08.2020
    Changes:    -create rough Structure
                -added class StartGame
                -added method StartGame.gameStart()
                -added method StartGame.createSoughtAfterList()
                -added Getter and Setter for count and soughtAfterList
*/

public class Mastermind{

    public static void main(String[]args){

        System.out.println("Willkomen zu Mastermind!");

        StartGame game = new StartGame();
        game.setCount(4);

        game.gameStart();

    }
}