/**
 * Created by emily on 18/12/2016.
 */
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Player{
    private char player = 'X';
    private int xcoord;
    private int ycoord;
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    public Player(){
        setx(1);
        sety(1);

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


    public void ScannerTest() {

        Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter command (quit to exit):");
            String input = keyboard.nextLine();

            if (input != null) {
                if("w".equals(input)){
                    ycoord += 1;
                }
                else if("a".equals(input)){
                    xcoord +=1;
                }
                else if("s".equals(input)){
                    xcoord -=1;
                }
                else if("d".equals(input)){
                    ycoord -=1;
                }

            }

        keyboard.close();
    }
}
