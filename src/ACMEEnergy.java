import java.util.Scanner;

public class ACMEEnergy {
    private Scanner in;
    private Conglomerado conglomerado;

    public ACMEEnergy() {
        in = new Scanner(System.in);
        conglomerado = new Conglomerado();
    }

    public void executa() {
        int esc;
        do {
            menu();
            esc = in.nextInt();
            in.nextLine();
            switch (esc) {
                case 0:
                    break;
                case 1:
                    cadastrarNovaUsina();
                    break;
                case 2:
                    pesquisarUsinaNome();
                    break;
                case 3:
                    listarTodasUsinas();
                    break;
                case 4:
                    consultaPrecoMWhNome();
                    break;
                case 5:
                    salvarUsinasArquivo();
                    break;
            }
        } while (esc != 0);
    }

    private void menu() {
        System.out.println("==================");
        System.out.println("Escolha: ");
        System.out.println("[0] Sair");
        System.out.println("[1] Cadastrar nova usina");
        System.out.println("[2] Pesquisar uma usina");
        System.out.println("[3] Lista todas as usinas");
        System.out.println("[4] Consultar preco do MWh");
        System.out.println("[5] Salvar usinas em um arquivo CSV");
        System.out.println("==================");
    }

    public void inicializa() { //Pre-cadastramento
        UsinaRenovavel usinaRenovavel1, usinaRenovavel2;
        UsinaNaoRenovavel usinaNaoRenovavel1, usinaNaoRenovavel2;
    }

    private void cadastrarNovaUsina() {

    }

    private void pesquisarUsinaNome() {
        System.out.println("Insira o nome de uma usina para ver seus dados: ");
        String nome = in.nextLine();
        Usina usinaCadastrada = conglomerado.pesquisaUsina(nome);
        if (usinaCadastrada == null) {
            System.out.println("Nenhuma usina localizada com esse nome.");
        } else {
            if (usinaCadastrada instanceof UsinaRenovavel) {
                System.out.println("Nome: " + usinaCadastrada.getNome());
                System.out.println("Producao de MWh: " + usinaCadastrada.getProducaoMWh());
                System.out.println("Custo MWh: " + usinaCadastrada.getCustoMWh());
                System.out.println("Fonte de Energia utilizada: Renovavel - " + ((UsinaRenovavel) usinaCadastrada).getFonteDeEnergia());
            } else {
                System.out.println("Nome: " + usinaCadastrada.getNome());
                System.out.println("Producao de MWh: " + usinaCadastrada.getProducaoMWh());
                System.out.println("Custo MWh: " + usinaCadastrada.getCustoMWh());
                System.out.println("Combustivel utilizado: " + ((UsinaNaoRenovavel) usinaCadastrada).getCombustivel());
                System.out.println("Durabilidade do combustivel: " + ((UsinaNaoRenovavel) usinaCadastrada).getDurabilidadeCombustivel());
            }
        }

    }

    private void listarTodasUsinas() {

    }

    private void consultaPrecoMWhNome() {

    }

    private void salvarUsinasArquivo() {

    }
}
