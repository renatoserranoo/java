package banco;

public class contacorrente {
    private int nConta;
    private double saldo;

    public void sacar(double valorSaque){
        if(valorSaque <= saldo){
            saldo = saldo - valorSaque;
        }else{
            System.out.println("Você nao tem saldo suficiente!");
        }
    }
    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            saldo = saldo + valorDeposito;
        }else{
            System.out.println("Valores precisam ser maiores que zero!");
        }
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
