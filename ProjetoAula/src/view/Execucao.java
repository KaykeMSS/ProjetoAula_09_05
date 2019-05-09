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
		prof.setCidade("S�o Paulo");
		prof.setCep(88431-550);
		prof.setEndereco("Rua das Oliveiras, 125");
		prof.setEstado("S�o Paulo");
		prof.setTelefone(2515-1412);
		prof.setBairro("Jardim romano");
		
		System.out.println("Professor: ");
		System.out.println("");
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Celular: " + prof.getCelular());
		System.out.println("Mat�ria: " + prof.getMateria());
		System.out.println("Cidade: " + prof.getCidade());
		System.out.println("CEP: " + prof.getCep());
		System.out.println("Endere�o: " + prof.getEndereco());
		System.out.println("Estado: " + prof.getEstado());
		System.out.println("Telefone: " + prof.getTelefone());
		System.out.println("Bairro: " + prof.getBairro());
		System.out.println("");
		
		
		
		//Dire��o
		dir.setNome("Bemedito Matias");
		dir.setCelular(99782-7102);
		dir.setCargo("Coordenador");
		dir.setCidade("S�o Paulo");
		dir.setCep(77961-550);
		dir.setEndereco("Rua Marrecas, 198");
		dir.setEstado("S�o Paulo");
		dir.setTelefone(2511-4189);
		dir.setBairro("Jardim romano");
		
		System.out.println("Dire��o: ");
		System.out.println("Nome: " + dir.getNome());
		System.out.println("Celular: " + dir.getCelular());
		System.out.println("Cargo: " + dir.getCargo());
		System.out.println("Cidade: " + dir.getCidade());
		System.out.println("CEP: " + dir.getCep());
		System.out.println("Endere�o: " + dir.getEndereco());
		System.out.println("Estado: " + dir.getEstado());
		System.out.println("Telefone: " + dir.getTelefone());
		System.out.println("Bairro: " + dir.getBairro());
		System.out.println("");
		
		
		//Secretaria
		sec.setNome("Eronildes Matias");
		sec.setCelular(98748-7102);
		sec.setMatricula(115);
		sec.setCidade("S�o Paulo");
		sec.setCep(76992-550);
		sec.setEndereco("Rua Feno Grego, 190");
		sec.setEstado("S�o Paulo");
		sec.setTelefone(2488-4189);
		sec.setBairro("Jardim romano");
		
		System.out.println("Secretaria: ");
		System.out.println("Nome: " + sec.getNome());
		System.out.println("Celular: " + sec.getCelular());
		System.out.println("Cargo: " + sec.getMatricula());
		System.out.println("Cidade: " + sec.getCidade());
		System.out.println("CEP: " + sec.getCep());
		System.out.println("Endere�o: " + sec.getEndereco());
		System.out.println("Estado: " + sec.getEstado());
		System.out.println("Telefone: " + sec.getTelefone());
		System.out.println("Bairro: " + sec.getBairro());
		
	}

}
