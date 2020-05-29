package model;

public class Manager {
	protected BancoProxy service;
	
	public Manager(BancoProxy service) {
		this.service = service;
	}
	
	public String getUsuario() {
		return this.service.getUsuario();
	}
	
	public String getSenha() {
		return this.service.getSenha();
	}
}
