package banco;

public class TesteConta {
    public static void main(String[] args) {
        contacorrente conta1 = new contacorrente();

        conta1.setnConta(123456);
        System.out.println("Num da conta: " + conta1.getnConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.depositar(100.0);
        System.out.println("Num da conta: " + conta1.getnConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());

        contacorrente conta2 = new contacorrente();
        System.out.println("Saldo atual: " + conta2.getSaldo());
    }
}
