package com.examplethree.lalalagui;

//import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/7/28 18:13
 */
//@Data
@Component
public class PlayGUI {
    private JPanel panel;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;


    public void addActionListener (JButton button) {


        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do something...
                JOptionPane.showMessageDialog(null, "保存成功11！");
            }
        });
    }

}
