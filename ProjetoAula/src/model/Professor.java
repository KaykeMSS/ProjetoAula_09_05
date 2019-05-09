package model;

public class Professor extends Funcionario {
	private String Materia;

	@Override
	public void adimissao() {
		// TODO Auto-generated method stub
		System.out.println("10/06/2010");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("15/03/2018");
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

}
