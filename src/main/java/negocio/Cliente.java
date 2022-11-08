package negocio;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	private String email;
	private boolean ativo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Cliente(int id, String nome, int idade, String email, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", ativo=" + ativo
				+ "]";
	}
	
		
}
