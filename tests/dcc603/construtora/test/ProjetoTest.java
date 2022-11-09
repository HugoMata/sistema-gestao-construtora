/**
 * 
 */
package dcc603.construtora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.construtora.*;
import dcc603.construtora.classes.*;

import java.util.Date;

public class ProjetoTest {
	
	/*
	 * Template para a criacao de um caso de teste:
	 * 
	 * 		@Test
	 * 		public void test(){
	 * 			// dado que eu tenho...
	 * 			// quando eu fa�o...
	 * 			// entao eu epero que aconteca...
	 * 		}
	 */

	@Test
	public void testFecharProjetoPassa(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoCerto() );
	}
	
	@Test
	public void testFecharProjetoFalha(){
		// nota que eu tenho...
		Projeto projeto = new Projeto();
		
		// quando eu faco...
		projeto.fecharProjeto();
		
		// entao eu epero que aconteca...
		assertTrue("O projeto deveria estar fechado.", projeto.projetoFechadoErrado() );
	}
	
	@Test
	public void testCriarControleDiarioEListarEquipamentos() {
		Date date = new Date();
		String Codigo = "123";
		String Descricao = "Escavadeira Ultra XG100";
		String Tipo = "Escavadeira";
		String Marca = "WEG";
		String Modelo = "Escavadeira Ultra XG100";
		String Ano = "2015";
		String Valor = "30000";
		String DataAquisicao = "20/09/2020";
		String DataVenda = "Não foi vendido";
		String Situacao = "Em uso";
		String Fornecedor = "WEG";
		
		EquipamentoComprado equipamentoComprado = new EquipamentoComprado(Codigo, Descricao, Tipo, Marca, Modelo, Ano, Valor, DataAquisicao, DataVenda, Situacao, Fornecedor);
		ControleEquipamentos controleEquipamentos = new ControleEquipamentos();
		controleEquipamentos.cadastrarEquipamentoComprado(equipamentoComprado);
		
		ControleDiario controleDiario = new ControleDiario(date.toString());
		controleDiario.adicionarControleEquipamentos(controleEquipamentos);
		System.out.println("Equipamentos: ");
		controleDiario.listarEquipamentosComprados();
		
		assertEquals("Controle de Equipamentos foi adicionado ao Controle diario", controleDiario.getControleEquipamentos(), controleEquipamentos);
	}
}
