package gui;

import javax.swing.SwingUtilities;

public class GuiStarter {
    public static void start() {
        SwingUtilities.invokeLater(Hauptfenster::new);
    }
}
