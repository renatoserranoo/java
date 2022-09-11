package app;

public class teste {
    public static void main(String[] args) {

        login l1 = new login();
        login l2 = new login();

        l1.setMeuLogin("Renato","renatoserranoo","12345678");
        l2.setMeuLogin("cr7","cristiano","siiii");

        System.out.println(l1.getNome());
        System.out.println(l1.getLogin());
        System.out.println(l1.getSenha());

        System.out.println(l2.getNome());
        System.out.println(l2.getLogin());
        System.out.println(l2.getSenha());

        l1.AutLogin("mbappe","777");
        l2.AutLogin("cr7","siiii");

    }
}
