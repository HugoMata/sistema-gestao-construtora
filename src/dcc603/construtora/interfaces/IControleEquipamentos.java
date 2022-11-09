package dcc603.construtora.interfaces;

import dcc603.construtora.classes.EquipamentoAlugado;
import dcc603.construtora.classes.EquipamentoComprado;

public interface IControleEquipamentos {
	public void cadastrarEquipamentoAlugado(EquipamentoAlugado equipamentoAlugado);
    public void alterarEquipamentoAlugado(EquipamentoAlugado equipamentoAlugado);
    public void excluirEquipamentoAlugado(EquipamentoAlugado equipamentoAlugado);

    public void cadastrarEquipamentoComprado(EquipamentoComprado equipamentoComprado);
    public void alterarEquipamentoComprado(EquipamentoComprado equipamentoComprado);
    public void excluirEquipamentoComprado(EquipamentoComprado equipamentoComprado);
}
