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
        sc.nextLine();
        System.out.print("Digite o nome do contato: ");
        String nome = sc.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o e-mail do contato: ");
        String email = sc.nextLine();

        try {
            if (numeros.contains(telefone)) {
                throw new Exception("Este telefone já está cadastrado. Não é possível adicionar o mesmo número mais de uma vez.");
            }

            contatos.add(nome);
            numeros.add(telefone);
            emails.add(email);
            ids.add(contId++);

            System.out.println("Contato adicionado com sucesso!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

            System.out.println("Contatos disponíveis:");
            if (ids.isEmpty()) {
                System.out.println("Nenhum contato disponível.");
                return;
            }
            for (int id : ids) {
                System.out.println("ID: " + id);
            }
            System.out.println();

            System.out.print("Digite o ID do contato que deseja editar: ");
            int id = sc.nextInt();
            sc.nextLine();


            int index = ids.indexOf(id);
            if (index != -1) {

                String contatoAtual = contatos.get(index);
                String numeroAtual = numeros.get(index);
                String emailAtual = emails.get(index);

                System.out.println("Editar contato:");
                System.out.println("Nome atual: " + contatoAtual);
                System.out.println("Telefone atual: " + numeroAtual);
                System.out.println("E-mail atual: " + emailAtual);


                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();
                if (!novoNome.isEmpty()) {
                    contatos.set(index, novoNome);
                }


                System.out.print("Novo telefone: ");
                String novoNumero = sc.nextLine();
                if (!novoNumero.isEmpty()) {
                    numeros.set(index, novoNumero);
                }


                System.out.print("Novo e-mail : ");
                String novoEmail = sc.nextLine();
                if (!novoEmail.isEmpty()) {
                    emails.set(index, novoEmail);
                }


                System.out.println("Contato atualizado:");
                System.out.println("ID: " + id);
                System.out.println("Nome: " + contatos.get(index));
                System.out.println("Telefone: " + numeros.get(index));
                System.out.println("E-mail: " + emails.get(index));
            } else {
                System.out.println("Contato não encontrado. Verifique o ID e tente novamente!");
            }
        }
    }

