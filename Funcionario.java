package project.academia;

public class Funcionario {

	private boolean Pagamento;
	private double Salario;
	private String CPF;
	private String nome;
	
	
	public Funcionario(String nome, String cpf, double valor) {
		Pagamento = false;
		this.Salario = valor;
		this.CPF = cpf;
		this.nome = nome;
	}	
	
	public Funcionario(String nome, String CPF, double valor, boolean pagamento) {
		Pagamento = pagamento;
		Salario = valor;
		this.CPF = CPF;
		this.nome = nome;
	}	
	public Funcionario() {
		Pagamento = false;
		Salario = 0.0;
		this.CPF = "";
		this.nome = "";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
		
}
