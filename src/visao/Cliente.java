package visao;
import model.BancoProxy;
import model.Manager;

public class Cliente {
	public static void main(String[] args) {
		
		System.out.println("Usuario teste: ");
		BancoProxy proxy = new BancoProxy("Hacker", "1234");
		Manager manager = new Manager(proxy);
		System.out.println(manager.getUsuario());
		System.out.println(manager.getSenha());
		
		System.out.println("\nAdministrador acessando: ");
		proxy = new BancoProxy("admin", "admin");
		manager = new Manager(proxy);
		System.out.println(manager.getUsuario());
		System.out.println(manager.getSenha());
		
	}
}
	