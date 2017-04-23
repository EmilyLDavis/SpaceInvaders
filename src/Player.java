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
                    xcoord -=1;
                }
                else if("s".equals(input)){
                    ycoord +=1;
                }
                else if("d".equals(input)){
                    xcoord +=1;
                }
                keyboard.reset();
            }


       // keyboard.close();
    }

   /* public void keyPressed (KeyEvent e) {
        int c = e.getKeyCode ();
        if (c==KeyEvent.VK_UP) {
            ycoord -=1;
        } else if(c==KeyEvent.VK_DOWN) {
            ycoord +=1;

        } else if(c==KeyEvent.VK_LEFT) {
            xcoord -=1;
        } else if(c==KeyEvent.VK_RIGHT) {
            xcoord +=1;
        }
    }*/
}
