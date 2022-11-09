package dcc603.construtora;

import java.util.ArrayList;
import java.util.List;

import dcc603.construtora.classes.ControleEquipamentos;
import dcc603.construtora.classes.Ocorrencia;

public class ControleDiario {
	private ControleEquipamentos Equipamentos;
    private List<Ocorrencia> Ocorrencias;
    private String DataControle;

    public ControleDiario(String dataControle) {
        this.DataControle = dataControle;
        this.Equipamentos = new ControleEquipamentos();
        this.Ocorrencias = new ArrayList<Ocorrencia>();
    }

    public ControleEquipamentos getControleEquipamentos() { return this.Equipamentos; }
    public List<Ocorrencia> getOcorrencias() { return this.Ocorrencias; }
    public String getDataControle() { return this.DataControle; }

    public void adicionarControleEquipamentos(ControleEquipamentos controleEquipamentos) { this.Equipamentos = controleEquipamentos; }
    public void listarEquipamentosComprados () { this.Equipamentos.listarEquipamentosComprados(); }
    public void adicionarOcorrencia(Ocorrencia ocorrencia) { this.Ocorrencias.add(ocorrencia); }
}