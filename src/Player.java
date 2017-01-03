/**
 * Created by emily on 18/12/2016.
 */
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

    public void inputs(){


    }

}
