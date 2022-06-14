import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem saveItem;
    JMenuItem loadItem;
    JMenuItem exitItem;
    JMenuItem saveAsItem;

    ImageIcon exitIcon = new ImageIcon("exit-16.png");
    ImageIcon saveIcon = new ImageIcon("save-16.png");
    ImageIcon saveAsIcon = new ImageIcon("save-as-16.png");
    ImageIcon loadIcon = new ImageIcon("load-16.png");


    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        saveAsItem  = new JMenuItem("Save as...");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(exitItem);

        exitItem.addActionListener(this);
        saveItem.addActionListener(this);
        loadItem.addActionListener(this);
        saveAsItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // press alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); // press alt + E for Exit
        helpMenu.setMnemonic(KeyEvent.VK_H); // press alt + H for Help

        loadItem.setMnemonic(KeyEvent.VK_L); // press L to load
        saveItem.setMnemonic(KeyEvent.VK_S); // press S to save
        saveAsItem.setMnemonic(KeyEvent.VK_A); // press A to save as
        exitItem.setMnemonic(KeyEvent.VK_E); // press E to exit

        exitItem.setIcon(exitIcon); // sets Icon for exitItem
        saveItem.setIcon(saveIcon); // sets Icon for saveItem
        saveAsItem.setIcon(saveAsIcon); // sets Icon for saveAsItem
        loadItem.setIcon(loadIcon); // sets Icon for loadItem



        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitItem) {
            System.exit(666);
        }
        else if(e.getSource() == saveItem) {
            System.out.println("We saved the file");
        }
        else if(e.getSource() == saveItem) {
            System.out.println("We saved the file in a way you want :D");
        }
        else if(e.getSource() == loadItem) {
            System.out.println("Loading file.");
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(".")); // sets default directory the package of the project

            int response = fileChooser.showOpenDialog(null); // selects file to open. returns 1 if you cancel//click exit, 0 if you choose a file
            if(response == 0) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
            System.out.println("File loaded");
        }
    }
}
