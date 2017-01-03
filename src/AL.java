import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by emily on 03/01/2017.
 */
    public class AL extends KeyAdapter {
        private int x;
        private int y;

        private boolean moveL;
        private boolean moveR;
        private boolean moveU;
        private boolean moveD;

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_A) {
                x -= 1;
            }
            if (keyCode == e.VK_D) {
                x += 1;
            }
            if (keyCode == e.VK_W) {
                y -= 1;
            }
            if (keyCode == e.VK_S) {
                y += 1;
            }
        }

       /** public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_LEFT && moveL == false) {
                moveL = true;
                moveR = false;
                moveU = false;
                moveD = false;
                while (moveL) {
                    x--;
                }
            }
        }
        */
    }
