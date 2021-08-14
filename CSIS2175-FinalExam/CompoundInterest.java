import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Fri Aug 13 17:21:26 PDT 2021
 */



/**
 * @author unknown
 */
public class CompoundInterest extends JFrame {
    public CompoundInterest() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        fldCustNum = new JTextField();
        label2 = new JLabel();
        fldCustName = new JTextField();
        label3 = new JLabel();
        fldIniDeposit = new JTextField();
        label4 = new JLabel();
        fldNumYears = new JTextField();
        label5 = new JLabel();
        cbSaveType = new JComboBox();
        dataTableOne = new JScrollPane();
        table1 = new JTable();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Enter the Customer Number");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(fldCustNum, "cell 1 0");

        //---- label2 ----
        label2.setText("Enter the Customer Name");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(fldCustName, "cell 1 1");

        //---- label3 ----
        label3.setText("Enter the Initial Deposit");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(fldIniDeposit, "cell 1 2");

        //---- label4 ----
        label4.setText("Enter the number of years");
        contentPane.add(label4, "cell 0 3");
        contentPane.add(fldNumYears, "cell 1 3");

        //---- label5 ----
        label5.setText("Choose the type of savings");
        contentPane.add(label5, "cell 0 4");
        contentPane.add(cbSaveType, "cell 1 4");

        //======== dataTableOne ========
        {
            dataTableOne.setViewportView(table1);
        }
        contentPane.add(dataTableOne, "cell 0 5");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(table2);
        }
        contentPane.add(scrollPane2, "cell 1 5");

        //---- button1 ----
        button1.setText("Add");
        contentPane.add(button1, "cell 0 6");

        //---- button2 ----
        button2.setText("Edit");
        contentPane.add(button2, "cell 0 6");

        //---- button3 ----
        button3.setText("Delete");
        contentPane.add(button3, "cell 0 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField fldCustNum;
    private JLabel label2;
    private JTextField fldCustName;
    private JLabel label3;
    private JTextField fldIniDeposit;
    private JLabel label4;
    private JTextField fldNumYears;
    private JLabel label5;
    private JComboBox cbSaveType;
    private JScrollPane dataTableOne;
    private JTable table1;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
