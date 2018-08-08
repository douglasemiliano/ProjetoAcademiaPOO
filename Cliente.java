package project.academia;

public class Cliente {
	private String Nome;
	private String CPF;
	private boolean Pagamento;
	private double Valor;	
	
	
	public Cliente(String nome, String CPF, double valor) {
		Nome = nome;
		Pagamento = false;
		this.CPF = CPF;
		Valor = valor;
	}
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	
	
	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public boolean isPagamento() {
		return Pagamento;
	}
	public void setPagamento(boolean pagamento) {
		Pagamento = pagamento;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}

}
