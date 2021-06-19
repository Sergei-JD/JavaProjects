package com.company.gui_and_music;

import javax.swing.*;
import java.awt.*;

public class Button1_north {

    public static void main(String[] args) {
        Button1_north gui = new Button1_north();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
