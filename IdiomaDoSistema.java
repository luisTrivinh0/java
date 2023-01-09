import java.util.Locale;
public class IdiomaDoSistema {
  public static void main(String[] args) {
    Locale loc = Locale.getDefault();
    System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage().substring(0, 1).toUpperCase() + loc.getDisplayLanguage().substring(1));
  }
}
