import java.util.Scanner;

class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();

        double bonus = 0;
        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05;
        }

        double imposto;
        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18;
        } else {
            imposto = salarioBruto * 0.10;
        }

        double salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
