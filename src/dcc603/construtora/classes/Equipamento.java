package dcc603.construtora.classes;

public abstract class Equipamento {
	private String Codigo;
    private String Descricao;
    private String Tipo;
    private String Marca;
    private String Modelo;
    private String Ano;
    private String Valor;
    private String DataAquisicao;
    private String DataVenda;
    private String Situacao;
    
    protected Equipamento(String codigo, String descricao, String tipo, String marca, String modelo, String ano, String valor, String dataAquisicao, String dataVenda, String situacao) {
        this.Codigo = codigo;
        this.Descricao = descricao;
        this.Tipo = tipo;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Ano = ano;
        this.Valor = valor;
        this.DataAquisicao = dataAquisicao;
        this.DataVenda = dataVenda;
        this.Situacao = situacao;
    }
    
	public String getCodigo() { return Codigo; }
    public String getDescricao() { return Descricao; }
    public String getTipo() { return Tipo; }
    public String getMarca() { return Marca; }
    public String getModelo() { return Modelo; }
    public String getAno() { return Ano; }
    public String getValor() { return Valor; }
    public String getDataAquisicao() { return DataAquisicao; }
    public String getDataVenda() { return DataVenda; }
    public String getSituacao() { return Situacao; }

    public void setCodigo(String codigo) { Codigo = codigo; }
    public void setDescricao(String descricao) { Descricao = descricao; }
    public void setTipo(String tipo) { Tipo = tipo; }
    public void setMarca(String marca) { Marca = marca; }
    public void setModelo(String modelo) { Modelo = modelo; }
    public void setAno(String ano) { Ano = ano; }
    public void setValor(String valor) { Valor = valor; }
    public void setDataAquisicao(String dataAquisicao) { DataAquisicao = dataAquisicao; }
    public void setDataVenda(String dataVenda) { DataVenda = dataVenda; }
    public void setSituacao(String situacao) { Situacao = situacao; }
}
