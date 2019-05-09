package model;

public class Secretaria extends Funcionario{
	private long Matricula;
	
	public long getMatricula() {
		return Matricula;
	}

	public void setMatricula(long matricula) {
		Matricula = matricula;
	}

	@Override
	public void adimissao() {
		// TODO Auto-generated method stub
		System.out.println("18/02/2015");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("18/02/2019");
		
	}

}
