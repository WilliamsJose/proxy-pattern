package model;

public class BancoUsuarios {
	private String usuario;
	private String senha;

	public BancoUsuarios(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return new String("Usuario: " + usuario);
	}

	public String getSenha() {
		return new String("Senha: " + senha);
	}
}
