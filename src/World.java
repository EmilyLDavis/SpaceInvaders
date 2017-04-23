import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * Created by emily on 18/12/2016.
 */
public class World {
    private Player player;
    private Grid grid;
    private AL al;
    KeyEvent e;
    Scanner keyboard = new Scanner(System.in);


    public World(){
        grid = new Grid();
        player = new Player();
        al = new AL();

    }

    public void update(){
        grid.clearGrid();

        addToGrid(player.getx(), player.gety(), player.getValue());
        player.ScannerTest(keyboard);

        //.keyPressed(e);

    }

    public void addToGrid( int x, int y, char value){
        grid.addvalue(x, y, value);
    }

    public void draw(){
        grid.drawGrid();
        //player.drawPlayer();
    }


}
