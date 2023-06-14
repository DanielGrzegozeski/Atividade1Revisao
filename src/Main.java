import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        TelaAtividade1 form = new TelaAtividade1();
        form.setContentPane(form.telaAtividadee);
        form.setVisible(true);
        form.setSize(400,500);
    }
}
