import java.util.ArrayList;
import java.util.Scanner;

public class SistemaColaboradores {

    // Constante do salário base
    static final double SALARIO_BASE = 2000.00;

    // ArrayList para armazenar os colaboradores
    static ArrayList<String> colaboradores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE COLABORADORES =====");
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarColaborador(sc);
                    break;
                case 2:
                    listarColaboradores();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }

    static void cadastrarColaborador(Scanner sc) {
        System.out.print("\nNúmero de registro: ");
        int registro = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Tipo de colaborador:");
        System.out.println("1 - Funcionário Padrão");
        System.out.println("2 - Funcionário Comissionado");
        System.out.println("3 - Funcionário de Produção");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        double salarioFinal = 0;
        String tipoNome = "";

        switch (tipo) {
            case 1:
                salarioFinal = SALARIO_BASE;
                tipoNome = "Padrão";
                break;

            case 2:
                System.out.print("Total de vendas no mês (R$): ");
                double vendas = sc.nextDouble();
                System.out.print("Percentual de comissão (%): ");
                double percentual = sc.nextDouble();
                double comissao = vendas * percentual / 100;
                salarioFinal = SALARIO_BASE + comissao;
                tipoNome = "Comissionado";
                System.out.printf("Comissão calculada: R$ %.2f%n", comissao);
                break;

            case 3:
                System.out.print("Valor por peça (R$): ");
                double valorPeca = sc.nextDouble();
                System.out.print("Quantidade de peças produzidas: ");
                int qtdPecas = sc.nextInt();
                double bonus = valorPeca * qtdPecas;
                salarioFinal = SALARIO_BASE + bonus;
                tipoNome = "Produção";
                System.out.printf("Bônus calculado: R$ %.2f%n", bonus);
                break;

            default:
                System.out.println("Tipo inválido! Colaborador não cadastrado.");
                return;
        }

        // Monta string com dados do colaborador e armazena na lista
        String dados = String.format(
            "Registro: %d | Nome: %s | Tipo: %s | Salário Final: R$ %.2f",
            registro, nome, tipoNome, salarioFinal
        );
        colaboradores.add(dados);

        System.out.printf("%nColaborador cadastrado com sucesso!%n");
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);
    }

    static void listarColaboradores() {
        if (colaboradores.isEmpty()) {
            System.out.println("\nNenhum colaborador cadastrado ainda.");
            return;
        }

        System.out.println("\n===== LISTA DE COLABORADORES =====");
        for (int i = 0; i < colaboradores.size(); i++) {
            System.out.println((i + 1) + ". " + colaboradores.get(i));
        }
    }
}