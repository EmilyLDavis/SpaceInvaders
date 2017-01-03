/**
 * Created by emily on 18/12/2016.
 */
public class Main{

    public static void main(String args[]){
        World w = new World();
        int x = 1;

        for( int i =0; i <1; i++) {
            w.update();
            w.draw();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

