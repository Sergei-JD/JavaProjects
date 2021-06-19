package com.company.gui_and_music;

import javax.swing.*;
import java.awt.*;

public class Button1_east {

    public static void main(String[] args) {
        Button1_east gui = new Button1_east();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click like you mean it");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
