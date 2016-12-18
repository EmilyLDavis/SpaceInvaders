import java.util.ArrayList;

/**
 * Created by emily on 18/12/2016.
 */

public class Grid {
    private char empty = 'o';
    ArrayList<ArrayList<Character>> grid = new ArrayList<>();



    public Grid(){
        makeGrid();
    }
    public void makeGrid(){
        int width = 5;
        int height = 4;
        for(int i = 0; i < height; i++){
            grid.add(new ArrayList<>());
            for(int j = 0; j <width; j++){
                grid.get(i).add(empty);
            }
        }

    }

    public void drawGrid(){
        for(int i =0; i < grid.size(); i++){
            for(int j=0; j<grid.get(i).size(); j++){
                System.out.print(grid.get(i).get(j));
            }
            System.out.println();
        }


    }
}
