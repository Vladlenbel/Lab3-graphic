import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vladlen on 15.06.2017.
 */
public class MainFrame {

    JFrame frame;
    JFrame framegr;
    JButton butGenerate;
    JButton butDrawinGr;
    JTable tabble;
    JTextField maxValue;
    JTextField stepValuel;


    MainFrame(){

        frame = new JFrame("Graphic");
        frame.getContentPane().setLayout(new FlowLayout());
       // frame.setSize(900,600);

        tabble = new JTable(51,2);

        JScrollPane jScrollPane = new JScrollPane(tabble);
        butGenerate = new JButton("Сгенерировать");
        butDrawinGr = new JButton("Построить");
        maxValue = new JTextField( 30);
        stepValuel = new JTextField(30);

        frame.add(jScrollPane,BorderLayout.WEST);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // frame.add(tabble);
        frame.add(butGenerate,BorderLayout.WEST);
        frame.add(butDrawinGr,BorderLayout.WEST);
        frame.add(maxValue,BorderLayout.WEST);
        frame.add(stepValuel,BorderLayout.WEST);

        frame.setPreferredSize(new Dimension(500, 600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        butGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maximV = Integer.parseInt(maxValue.getText());
                int stepV = Integer.parseInt(stepValuel.getText());
                CalculatingValues calcul = new CalculatingValues();
               String[] sum = calcul.calculationOne(maximV, stepV);


                Graphic graph = new Graphic();
                framegr = new JFrame("Graphic");
                framegr.getContentPane().setLayout(new FlowLayout());

                framegr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                framegr.add(graph);
                framegr.setPreferredSize(new Dimension(500, 600));
                framegr.pack();
                framegr.setLocationRelativeTo(null);
                framegr.setVisible(true);




               double indx = 0;
               for (int ind = 0; ind < 51; ind++ ){
                   String xznach = "x = " + Double.toString(indx/100);
                    tabble.setValueAt(xznach,ind,0);
                   tabble.setValueAt(sum[ind],ind,1);

                   indx += 1;

               }

            }
        });


    }
}
