import java.util.ArrayList;

/**
 * Created by emily on 18/12/2016.
 */

public class Grid {
    private char empty = 'o';
    private ArrayList<ArrayList<Character>> grid = new ArrayList<>();
    private int width = 5;
    private int height = 4;


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

    public void clearGrid(){

        for(int i = 0; i < height; i++){
            for(int j = 0; j <width; j++){
                addvalue(j, i, ' ');
            }
        }
    }

    public void addvalue(int x, int y, char value){

        grid.get(y).set(x, value);
    }
}
