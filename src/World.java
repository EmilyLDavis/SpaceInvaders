import java.util.Scanner;

/**
 * Created by emily on 18/12/2016.
 */
public class World {
    private Player player;
    private Grid grid;
    private AL al;


    public World(){
        grid = new Grid();
        player = new Player();
        al = new AL();

    }

    public void update(){
        grid.clearGrid();
        player.ScannerTest();
        addToGrid(player.getx(), player.gety(), player.getValue());

    }

    public void addToGrid( int x, int y, char value){
        grid.addvalue(player.getx(), player.gety(), player.getValue());
    }

    public void draw(){
        grid.drawGrid();
        //player.drawPlayer();
    }


}
