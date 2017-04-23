/**
 * Created by emily on 18/12/2016.
 */

import java.util.Scanner;

public class Player{
    private char player = 'X';
    private int xcoord;
    private int ycoord;

    public Player(){
        setx(3);
        sety(3);


    }

    public char getValue(){
        return player;
    }

    public void setx(int x){
        xcoord = x;
    }

    public void sety(int y){
        ycoord = y;
    }

    public int getx(){
        return xcoord;
    }

    public int gety(){
        return ycoord;
    }


    public void ScannerTest(Scanner keyboard) {

            System.out.println("Enter command: ");
            String input = keyboard.next();

            if (input != null) {
                if("w".equals(input)){
                    if(ycoord ==0) {
                        System.out.println("Invalid move");

                    }
                    else{
                        ycoord -= 1;
                    }
                }
                else if("a".equals(input)){
                    if(xcoord ==0) {
                        System.out.println("Invalid move");

                    }
                    else{
                        xcoord -=1;
                    }
                }
                else if("s".equals(input)){
                    if(xcoord ==10) {
                        System.out.println("Invalid move");

                    }
                    else{
                        ycoord +=1;
                    }

                }
                else if("d".equals(input)){
                    if(xcoord ==10) {
                        System.out.println("Invalid move");

                    }
                    else{
                        xcoord +=1;
                    }

                }
                else {
                    System.out.println("Invalid command");

                }
                keyboard.reset();
            }

    }


}
