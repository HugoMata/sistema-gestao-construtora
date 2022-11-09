package dcc603.construtora.classes;

public class Ocorrencia {
	private String Descricao;
    private String Codigo;

    public Ocorrencia(String descricao, String codigo) {
        this.Descricao = descricao;
        this.Codigo = codigo;
    }

    public String getDescricao() { return Descricao; }
    public String getCodigo() { return Codigo; }

    public void setDescricao(String descricao) { Descricao = descricao; }
    public void setCodigo(String codigo) { Codigo = codigo; }
}
