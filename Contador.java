import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = myObj.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = myObj.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } catch (Exception e){
            System.out.println("Erro desconhecido");
        }
    }
    static void contar(int p1, int p2 ) throws ParametrosInvalidosException {
        if(p1 > p2){
            throw new ParametrosInvalidosException();
        }
        for(int i = p1; i <= p2; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
