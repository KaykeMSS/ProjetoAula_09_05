package view;

import model.Direcao;
import model.Professor;
import model.Secretaria;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof = new Professor();
		Direcao dir = new Direcao();
		Secretaria sec = new Secretaria();
		
		//professor
		prof.setNome("Kayke Matias");
		prof.setCelular(95982-7102);
		prof.setMateria("Gastronomia");
		prof.setCidade("São Paulo");
		prof.setCep(88431-550);
		prof.setEndereco("Rua das Oliveiras, 125");
		prof.setEstado("São Paulo");
		prof.setTelefone(2515-1412);
		prof.setBairro("Jardim romano");
		
		System.out.println("Professor: ");
		System.out.println("");
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Celular: " + prof.getCelular());
		System.out.println("Matéria: " + prof.getMateria());
		System.out.println("Cidade: " + prof.getCidade());
		System.out.println("CEP: " + prof.getCep());
		System.out.println("Endereço: " + prof.getEndereco());
		System.out.println("Estado: " + prof.getEstado());
		System.out.println("Telefone: " + prof.getTelefone());
		System.out.println("Bairro: " + prof.getBairro());
		System.out.println("");
		
		
		
		//Direção
		dir.setNome("Bemedito Matias");
		dir.setCelular(99782-7102);
		dir.setCargo("Coordenador");
		dir.setCidade("São Paulo");
		dir.setCep(77961-550);
		dir.setEndereco("Rua Marrecas, 198");
		dir.setEstado("São Paulo");
		dir.setTelefone(2511-4189);
		dir.setBairro("Jardim romano");
		
		System.out.println("Direção: ");
		System.out.println("Nome: " + dir.getNome());
		System.out.println("Celular: " + dir.getCelular());
		System.out.println("Cargo: " + dir.getCargo());
		System.out.println("Cidade: " + dir.getCidade());
		System.out.println("CEP: " + dir.getCep());
		System.out.println("Endereço: " + dir.getEndereco());
		System.out.println("Estado: " + dir.getEstado());
		System.out.println("Telefone: " + dir.getTelefone());
		System.out.println("Bairro: " + dir.getBairro());
		System.out.println("");
		
		
		//Secretaria
		sec.setNome("Eronildes Matias");
		sec.setCelular(98748-7102);
		sec.setMatricula(115);
		sec.setCidade("São Paulo");
		sec.setCep(76992-550);
		sec.setEndereco("Rua Feno Grego, 190");
		sec.setEstado("São Paulo");
		sec.setTelefone(2488-4189);
		sec.setBairro("Jardim romano");
		
		System.out.println("Secretaria: ");
		System.out.println("Nome: " + sec.getNome());
		System.out.println("Celular: " + sec.getCelular());
		System.out.println("Cargo: " + sec.getMatricula());
		System.out.println("Cidade: " + sec.getCidade());
		System.out.println("CEP: " + sec.getCep());
		System.out.println("Endereço: " + sec.getEndereco());
		System.out.println("Estado: " + sec.getEstado());
		System.out.println("Telefone: " + sec.getTelefone());
		System.out.println("Bairro: " + sec.getBairro());
		
	}

}
