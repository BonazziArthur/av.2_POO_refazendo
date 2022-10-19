public class UsinaRenovavel extends Usina {
    private FonteDeEnergia fonteDeEnergia;

    public UsinaRenovavel(String nome, double producaoMWh, double custoMwh, FonteDeEnergia fonteDeEnergia) {
        super(nome, producaoMWh, custoMwh);
        this.fonteDeEnergia = fonteDeEnergia;
    }

    @Override
    public String toString() {
        return "UsinaRenovavel{" +
                "fonteDeEnergia=" + fonteDeEnergia +
                '}';
    }

    @Override
    public double calculaPrecoMWh() {
        double valor = 0;
        if (fonteDeEnergia.equals(FonteDeEnergia.SOLAR)) {
            valor = getCustoMWh() + (getCustoMWh() * 0.25);
        } else if (fonteDeEnergia.equals(FonteDeEnergia.EOLICA)) {
            valor = getCustoMWh() + (getCustoMWh() * 0.15);
        } else {
            valor = getCustoMWh() + (getCustoMWh() * 0.05);
        }
        return valor;
    }

    @Override
    public String geraResumo() {
        String resumoRenovavel = getNome() + ";" + getProducaoMWh() + ";" + getCustoMWh() + ";" + getFonteDeEnergia();
        return resumoRenovavel;
    }

    public FonteDeEnergia getFonteDeEnergia() {
        return fonteDeEnergia;
    }
}
