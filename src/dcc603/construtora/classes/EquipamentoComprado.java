package dcc603.construtora.classes;

public class EquipamentoComprado extends Equipamento {
    private String Fornecedor;

    public EquipamentoComprado(String codigo, String descricao, String tipo, String marca, String modelo, String ano, String valor, String dataAquisicao, String dataVenda, String situacao, String fornecedor) {
        super(codigo, descricao, tipo, marca, modelo, ano, valor, dataAquisicao, dataVenda, situacao);
        this.Fornecedor = fornecedor;
    }

    public String getFornecedor() { return Fornecedor; }

    public void setFornecedor(String fornecedor) { Fornecedor = fornecedor; }
}