package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{
    private JButton addTask;
    private JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder();
    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));
        
        addTask = new JButton("Add task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN,20));
        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN,20));
        this.add(clear);
    }
    public JButton getAddTask(){
        return addTask;
    }
    public JButton getClear(){
        return clear;
    }
}
