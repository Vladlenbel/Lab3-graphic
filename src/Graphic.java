import javax.swing.*;
import java.awt.*;

/**
 * Created by Vladlen on 15.06.2017.
 */
public class Graphic  extends JPanel {

    protected void paintComponent(Graphics gh){
        Graphics2D grf = (Graphics2D)gh;

        grf.drawLine(1,1,50,50);
        //grf.drawString(строка,x1,y1)
    }
}
