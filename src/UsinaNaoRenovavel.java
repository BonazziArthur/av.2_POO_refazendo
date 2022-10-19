public class UsinaNaoRenovavel extends Usina {
    private Combustivel combustivel;
    private double durabilidadeCombustivel;

    public UsinaNaoRenovavel(String nome, double producaoMWh, double custoMWh, Combustivel combustivel, double durabilidadeCombustivel) {
        super(nome, producaoMWh, custoMWh);
        this.combustivel = combustivel;
        this.durabilidadeCombustivel = durabilidadeCombustivel;
    }

    public double calculaPrecoMWh() {
        double valor = 0;
        if (combustivel == (Combustivel.PETROLEO)) {
            valor = getCustoMWh() + (getCustoMWh() * 0.3);
        } else if (combustivel.equals(Combustivel.CARVAO)) {
            valor = getCustoMWh() + (getCustoMWh() * 0.2);
        } else {
            valor = getCustoMWh() + (getCustoMWh() * 0.1);
        }
        return valor;
    }

    @Override
    public String geraResumo() {
        String resumoNaoRenovavel = getNome() + ";" + getProducaoMWh() + ";" + getCustoMWh() + ";" + getCombustivel() + ";" + getDurabilidadeCombustivel();
        return resumoNaoRenovavel;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public double getDurabilidadeCombustivel() {
        return durabilidadeCombustivel;
    }
}
