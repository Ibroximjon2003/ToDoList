package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import org.w3c.dom.events.MouseEvent;

public class AppFrame extends JFrame{
    private ButtonPanel buttonPanel;
    private TitleBar title;
    private List list;
    private JButton addTask;
    private JButton clear;



  

    AppFrame(){
    this.setSize(400,700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    title = new TitleBar();
    list = new List();
    buttonPanel = new ButtonPanel(); 
    this.add(title,BorderLayout.NORTH);
    this.add(buttonPanel,BorderLayout.SOUTH);
    this.add(list,BorderLayout.CENTER);

    addTask = buttonPanel.getAddTask();
    clear = buttonPanel.getClear();

    addListeners();

    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                task.getDoneButton().addMouseListener(new MouseAdapter(){
                  
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }

        });
    }
}
