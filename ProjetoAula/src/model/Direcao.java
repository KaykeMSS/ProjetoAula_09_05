package model;

public class Direcao extends Funcionario {
	private String cargo;

	@Override
	public void adimissao() {
		// TODO Auto-generated method stub
		System.out.println("18/07/2014");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("28/08/2019");
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
