import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
  private static JLabel directionsLabel = new JLabel("Digite seu nome");
  private static JLabel outputLabel = new JLabel();
  private static JTextField nameBox = new JTextField(25);
  private static JButton nameButton = new JButton("Entrar");

  public static void main(String[] args) throws Exception {
    App window = new App();
    window.setSize(600, 110);
    window.setVisible(true);
    window.setTitle("Meu Primeiro App");

    //window.setLayout(new FlowLayout());
    window.setLayout(new GridLayout(3, 2)); // Linhas, Colunas
    window.getContentPane().setBackground(Color.white);
    nameBox.setForeground(Color.black);
    directionsLabel.setFont(new Font("Calibri", Font.ITALIC, 18));

    window.getContentPane().add(directionsLabel);
    window.getContentPane().add(nameBox);
    //Linha em Branco
    window.getContentPane().add(new JLabel());
    window.getContentPane().add(new JLabel());
    window.getContentPane().add(nameButton);
    window.getContentPane().add(outputLabel);
    //window.pack();
    nameButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        buttonClick(e);
      }
    });
    // Adicionar Objetos Swing aqui
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }//Fim do main

  public static void buttonClick(ActionEvent e) {
    //Código que responde ao clique
    //JOptionPane.showMessageDialog(null, "Funcionou!!", "Oi!", JOptionPane.INFORMATION_MESSAGE);
    /*
      * 1. tirar dos objetos da tela
      * 2. fazer algo com os dados da tela
      * 3. mostrar o resultado
    */
    String yourName = nameBox.getText();
    String outputMessage = "Olá, " + yourName + "!";
    outputLabel.setText(outputMessage);
  }
}