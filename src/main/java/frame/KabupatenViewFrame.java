package frame;

import javax.swing.*;

public class KabupatenViewFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel cariPanel;
    private JScrollPane viewScrollPane;
    private JPanel buttonPanel;
    private JTextField textField1;
    private JButton cariButton;
    private JTable viewTable;
    private JButton hapusButton;
    private JButton tutupButton;
    private JButton cetakButton;
    private JButton Tambah;
    private JButton batalButton;
    private JButton ubahButton;

    public KabupatenViewFrame(){
        init();
    }
    public void init(){
        setContentPane(mainPanel);
        setTitle("Data Kabupaten");
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
