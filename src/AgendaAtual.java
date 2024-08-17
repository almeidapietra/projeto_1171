import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaAtual {

    static List<String> contatos = new ArrayList<>();
    static ArrayList<String> numeros = new ArrayList<>();
    static ArrayList<String> emails = new ArrayList<>();
    static List<Integer> ids = new ArrayList<>();
    static int contId = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha = -1;

        while (escolha != 5) {

            exibirMenu();
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:

                    adicionarContato(sc);

                    break;

                case 2:
                    removerContato(sc);
                    break;

                case 3:
                    detalharContato(sc);
                    break;

                case 4:
                    editarContato(sc);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
    static void exibirMenu() {
        System.out.println(">>>> Menu Contato <<<<");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Remover Contato");
        System.out.println("3 - Detalhar Contato");
        System.out.println("4 - Editar Contato");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");

    }

    static void adicionarContato(Scanner sc) {

    }
    static void removerContato(Scanner sc) {
    }
    static void detalharContato(Scanner sc) {
        System.out.println("Digite o ID do contato: ");
        int id = sc.nextInt();

        int index = ids.indexOf(id);
        if (index != -1) {
            String contato = contatos.get(index);
            String numero = numeros.get(index);
            String email = emails.get(index);

            System.out.println("Detalhes do Contato:");
            System.out.println("ID: " + id);
            System.out.println("Nome: " + contato);
            System.out.println("Telefone: " + numero);
            System.out.println("E-mail: " + email);
        } else {
            System.out.println("Contato não encontrado. Verifique o ID e tente novamente!");
        }
    }
    static void editarContato(Scanner sc) {
    }
}
