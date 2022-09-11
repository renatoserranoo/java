package exemplo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aula3 c1 = new Aula3();
        System.out.printf("O nome inicial é: %s%n", c1.getNome());

        System.out.print("Digite o seu nome: ");
        String nome = JOptionPane.showInputDialog("Digite seu nome.");
//		String nome = sc.nextLine();
        c1.setNome(nome);

        System.out.printf("O novo nome é: %s%n", c1.getNome());
        JOptionPane.showMessageDialog(null, c1.getNome());
//      sc.close();
    }
}
