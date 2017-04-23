/**
 * Created by emily on 23/04/2017.
 */
public class Enemies {

    private char enemy = 'O';
    private int xcoord;
    private int ycoord;
    private boolean moveleft;
    private boolean moveright;


    public Enemies(){
        setx(1);
        sety(1);
        moveleft = true;
    }

    public char getValue(){
        return enemy;
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

    public void move(){
        if(moveright){
            if(xcoord == 0){
                moveright = false;
                moveleft = true;
            }
            else {
                xcoord -= 1;
            }

        }
        if(moveleft){
            if(xcoord == 10){
                moveright = true;
                moveleft = false;
            }
            else {
                xcoord +=1;
            }
        }
    }
}
