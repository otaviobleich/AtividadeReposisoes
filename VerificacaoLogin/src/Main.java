import java.util.Scanner;

class VerificacaoLogin {
    public static void main(String[] args) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        scanner.close();
    }
}
