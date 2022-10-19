import java.util.ArrayList;

public class Conglomerado {
    private ArrayList<Usina> listaDeUsinas = new ArrayList<>();

    public boolean cadastraUsina(Usina usinaRecebida) {
        for (Usina usinaCadastrada : listaDeUsinas) {
            if (usinaRecebida.getNome().equalsIgnoreCase(usinaCadastrada.getNome())) {
                return false;
            }
        }
        listaDeUsinas.add(usinaRecebida);
        return true;
    }

    public Usina pesquisaUsina(String nomeIndicado) {
        for (Usina usinaCadastrada : listaDeUsinas) {
            if (usinaCadastrada.getNome().equals(nomeIndicado)) {
                return usinaCadastrada;
            }
        }
        return null;
    }

    public ArrayList<Usina> listaTodasUsinas() {
        if (listaDeUsinas.isEmpty()) {
            return null;
        }
        return listaDeUsinas;
    }

    public double consultaPreco(String nomeIndicado) {
        for (Usina usinaCadastrada : listaDeUsinas) {
            if (usinaCadastrada.getNome().equalsIgnoreCase(nomeIndicado)) {
                return usinaCadastrada.calculaPrecoMWh();
            }
        }
        return -1.0;
    }

    public boolean salvaDadosArquivo(String nome) { //implementar
        return true;
    }
}
