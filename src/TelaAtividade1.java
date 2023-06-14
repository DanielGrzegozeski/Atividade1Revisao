import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAtividade1 extends JFrame {
    private JComboBox comboBox1;

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    private JButton exibirButton;
    public JTextArea textArea1;
    public JPanel telaAtividadee;

    private String heranca;

    private String polimorfismo;

    private String encapsulamento;

    private String sobrecarga;

    public static void main(String[] args) {

    }
public TelaAtividade1() {
    comboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {



        }
    });

    exibirButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            if(comboBox1.getSelectedIndex()  == 0){
                textArea1.setText("Polimorfismo em Java permite que objetos de diferentes classes sejam tratados de forma uniforme através de interfaces e heranças, possibilitando a flexibilidade e reutilização de código.");


            }else if(comboBox1.getSelectedIndex() == 1){
                textArea1.setText("Herança em Java é um mecanismo que permite criar classes novas a partir de classes existentes, herdando seus atributos e métodos. Isso promove a reutilização de código e estabelece uma relação de hierarquia entre as classes.");

            }else if(comboBox1.getSelectedIndex() == 2){
                textArea1.setText("Encapsulamento em Java é um princípio de programação que consiste em ocultar os detalhes internos de uma classe e fornecer acesso controlado aos seus atributos e métodos por meio de modificadores de acesso, como public, private e protected. Isso permite garantir a integridade dos dados, melhorar a segurança e facilitar a manutenção do código.");

            }else if(comboBox1.getSelectedIndex() == 3){
                textArea1.setText("Sobrecarga em Java é um recurso que permite definir múltiplos métodos com o mesmo nome, porém com parâmetros diferentes. Isso possibilita o uso conveniente de métodos com funcionalidades similares, mas adaptados a diferentes tipos de entrada ou quantidades de argumentos.");
            }

        }
    });
}
}
