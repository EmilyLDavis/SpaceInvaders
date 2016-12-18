/**
 * Created by emily on 18/12/2016.
 */
public class World {
    private Player player;
    private Grid grid;
    public World(){
        grid = new Grid();
        player = new Player();
    }

    public void update(){

    }

    public void draw(){
       // player.drawPlayer();
        grid.drawGrid();
    }


}
