package dcc603.construtora.classes;

import java.util.ArrayList;
import java.util.List;

import dcc603.construtora.interfaces.*;

public class ControleEquipamentos implements IControleEquipamentos {
    private List<EquipamentoComprado> EquipamentosComprados;
    private List<EquipamentoAlugado> EquipamentosAlugados;
    
    public ControleEquipamentos() {
        this.EquipamentosComprados = new ArrayList<EquipamentoComprado>();
        this.EquipamentosAlugados = new ArrayList<EquipamentoAlugado>();
    }

    public void cadastrarEquipamentoAlugado(EquipamentoAlugado equipamento) {
        this.EquipamentosAlugados.add(equipamento);
    }

    public void cadastrarEquipamentoComprado(EquipamentoComprado equipamento) {
        this.EquipamentosComprados.add(equipamento);
    }

    public void alterarEquipamentoAlugado(EquipamentoAlugado equipamento) {
        this.EquipamentosAlugados.remove(equipamento);
        this.EquipamentosAlugados.add(equipamento);
    }
    
    public void alterarEquipamentoComprado(EquipamentoComprado equipamento) {
        this.EquipamentosComprados.remove(equipamento);
        this.EquipamentosComprados.add(equipamento);
    }

    public void excluirEquipamentoAlugado(EquipamentoAlugado equipamento) {
        this.EquipamentosAlugados.remove(equipamento);
    }
    
    public void excluirEquipamentoComprado(EquipamentoComprado equipamento) {
        this.EquipamentosComprados.remove(equipamento);
    }

    public void listarEquipamentosComprados() {
        for (EquipamentoComprado equipamento : this.EquipamentosComprados) {
            System.out.println();
            System.out.println("Codigo: " + equipamento.getCodigo());
            System.out.println("Descricao: " + equipamento.getDescricao());
            System.out.println("Tipo: " + equipamento.getTipo());
            System.out.println("Marca: " + equipamento.getMarca());
            System.out.println("Modelo: " + equipamento.getModelo());
            System.out.println("Ano: " + equipamento.getAno());
            System.out.println("Valor: " + equipamento.getValor());
            System.out.println("Data Aquisicao: " + equipamento.getDataAquisicao());
            System.out.println("Data Venda: " + equipamento.getDataVenda());
            System.out.println("Situacao: " + equipamento.getSituacao());
            System.out.println("Fornecedor: " + equipamento.getFornecedor());
        }
    }

    public void listarEquipamentosAlugados() {
        for (EquipamentoAlugado equipamento : this.EquipamentosAlugados) {
            System.out.println();
            System.out.println("Codigo: " + equipamento.getCodigo());
            System.out.println("Descricao: " + equipamento.getDescricao());
            System.out.println("Tipo: " + equipamento.getTipo());
            System.out.println("Marca: " + equipamento.getMarca());
            System.out.println("Modelo: " + equipamento.getModelo());
            System.out.println("Ano: " + equipamento.getAno());
            System.out.println("Valor: " + equipamento.getValor());
            System.out.println("Data Aquisicao: " + equipamento.getDataAquisicao());
            System.out.println("Data Venda: " + equipamento.getDataVenda());
            System.out.println("Situacao: " + equipamento.getSituacao());
            System.out.println("Locadora: " + equipamento.getLocadora());
        }
    }
}