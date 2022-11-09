package dcc603.construtora.classes;

public class EquipamentoAlugado extends Equipamento {
    private String Locadora;

    public EquipamentoAlugado(String codigo, String descricao, String tipo, String marca, String modelo, String ano, String valor, String dataAquisicao, String dataVenda, String situacao, String locadora) {
        super(codigo, descricao, tipo, marca, modelo, ano, valor, dataAquisicao, dataVenda, situacao);
        this.Locadora = locadora;
    }

    public String getLocadora() { return Locadora; }

    public void setLocadora(String locadora) { Locadora = locadora; }
}
