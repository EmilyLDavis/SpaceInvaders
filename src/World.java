import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * Created by emily on 18/12/2016.
 */
public class World {
    private Player player;
    private Grid grid;
    private Enemies enemy;
    KeyEvent e;
    Scanner keyboard = new Scanner(System.in);


    public World(){
        grid = new Grid();
        player = new Player();
        enemy = new Enemies();

    }

    public void update(){
        grid.clearGrid();

        addToGrid(player.getx(), player.gety(), player.getValue());
        addToGrid(enemy.getx(), enemy.gety(), enemy.getValue());
        enemy.move();
        player.ScannerTest(keyboard);


    }

    public void addToGrid( int x, int y, char value){
        grid.addvalue(x, y, value);
    }

    public void draw(){
        grid.drawGrid();
    }


}
