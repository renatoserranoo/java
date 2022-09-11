public class ParOuImpar {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 1000){
            if (i % 2 == 0){
                System.out.println(i+ " é um número par.");
            }
            else{
                System.out.println(i+ " é um número ímpar.");
            }
            i++;
        }
    }
}
