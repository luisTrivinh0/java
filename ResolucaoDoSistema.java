import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDoSistema {
  public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("A resolução da tela é de: " + d.width + " por " + d.height);
  }
}
