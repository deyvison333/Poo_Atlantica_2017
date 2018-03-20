public class PreFlightCheck {
    public static void main(String[] args) {
      System.out.println("Iniciando o Nivel Pre flight check!");

      String nome = "José";
      int idade = 25;
      double peso = 65.00D;
      boolean estudante = true;

      System.out.print("Meu nome é "+nome+", tenho "+idade+" anos, peso "+peso+" kilos e ");
      if (estudante == true) {
        System.out.println("sou estudante de programação.");
      }
      else {
        System.out.println("não sou estudante de programação.");
      }

    }
}
