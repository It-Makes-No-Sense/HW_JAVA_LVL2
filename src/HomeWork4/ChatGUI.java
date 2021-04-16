package HomeWork4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatGUI {
    private static final String USERNAME = "Nia";

    public ChatGUI() {

        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 500;
        int sizeHeight = 600;
        int locationX =(screenSize.width - sizeWidth) / 2;
        int locationY =(screenSize.height - sizeHeight) / 2;

        frame.setBounds(locationX,locationY,sizeWidth,sizeHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.lightGray);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        topPanel.setLayout(new BorderLayout());
        topPanel.add(scrollPane,BorderLayout.CENTER);

        JPanel botPanel = new JPanel();
        botPanel.setBackground(Color.pink);
        JButton sendBtn = new JButton("SEND");
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(400,60));
        botPanel.setPreferredSize(new Dimension(1,70));
        botPanel.setLayout(new FlowLayout());

        botPanel.add(textField);
        botPanel.add(sendBtn);

        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().isEmpty()) {
                    textArea.append(" " + USERNAME + ": " + textField.getText() + "\n");
                    textField.setText("");
                }
                textField.grabFocus();
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                if ("enter".equalsIgnoreCase(keyText)){
                    sendBtn.doClick();
                }
            }
        });


        frame.add(topPanel,BorderLayout.CENTER);
        frame.add(botPanel,BorderLayout.SOUTH);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}