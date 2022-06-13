import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox<String> comboBox;
    String[] genders;

    MyFrame() {
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        genders = new String[]{"male", "female", "other"};
        comboBox = new JComboBox<>(genders); // put only Wrapper datatypes arrays here (Integer[] instead of int[])
        comboBox.addActionListener(this);
        comboBox.setEditable(true); // set editable (bad idea)
        System.out.println(comboBox.getItemCount()); // get amount of items
        comboBox.addItem("genderfluid helisexual"); // add item to the end of the list
        comboBox.insertItemAt("genius", 0); // insert item at index 0
        comboBox.setSelectedIndex(0); // selected item by default
        comboBox.removeItemAt(2); // delete women
        comboBox.removeAllItems(); // removes all items from the combobox

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

        // i'm noob


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println("You are "+comboBox.getSelectedItem());
            System.out.println("You are "+genders[comboBox.getSelectedIndex()]);
        }
    }
}
