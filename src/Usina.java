public abstract class Usina {
    private String nome;
    private double producaoMWh;
    private double custoMWh;

    public Usina(String nome, double producaoMWh, double custoMWh) {
        this.nome = nome;
        this.producaoMWh = producaoMWh;
        this.custoMWh = custoMWh;
    }

    @Override
    public String toString() {
        return "Usina{" +
                "nome='" + nome + '\'' +
                ", producaoMWh=" + producaoMWh +
                ", custoMWh=" + custoMWh +
                '}';
    }

    public abstract double calculaPrecoMWh(); //herdeiras vao implementar

    public abstract String geraResumo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProducaoMWh() {
        return producaoMWh;
    }

    public void setProducaoMWh(double producaoMWh) {
        this.producaoMWh = producaoMWh;
    }

    public double getCustoMWh() {
        return custoMWh;
    }

    public void setCustoMWh(double custoMWh) {
        this.custoMWh = custoMWh;
    }

    /*public String getGeraResumo() {
        return geraResumo;
    }

    public void setGeraResumo(String geraResumo) {
        this.geraResumo = geraResumo;
    }*/
}
