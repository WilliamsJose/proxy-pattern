package model;

public class BancoProxy implements Banco {
	private BancoUsuarios service;
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		if(this.service == null) this.service = new BancoUsuarios(this.usuario, this.senha);
		
		if(temPermissaoDeAcesso()) return this.service.getUsuario();
		
		return "Usuário ou Senha incorreta";
	}

	public String getSenha() {
		if(this.service == null) this.service = new BancoUsuarios(this.usuario, this.senha);
		
		if(temPermissaoDeAcesso()) return this.service.getSenha();
		
		return "Usuário ou Senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
