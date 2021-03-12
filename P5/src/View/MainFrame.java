package View;

import Controllers.Controller;

import javax.swing.*;

public class MainFrame extends JFrame {
    private int width = 900;
    private int height = 800;

    Controller controller;
    MainPanel panel;

    public MainFrame(Controller controller) {
        this.controller = controller;
        SetupFrame();

    }
    //"Standard settings"
    public void SetupFrame() {
        final int offsetX = width / 5;
        final int offsety = height / 5;

        setSize(width, height);
        setTitle("Animal Registry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(offsetX, offsety);

        pack();

        setVisible(true);
    }
    public void updateAnimalList(String[] stringList){ panel.}
}


