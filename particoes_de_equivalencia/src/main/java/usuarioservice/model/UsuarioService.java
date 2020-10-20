package usuarioservice.model;

import java.util.ArrayList;
import java.util.List;

//Esta classe de serviço é para popular a lista usada na comparação do login
public class UsuarioService {
	
	public List<UsuarioImplement> InstanciarUsers() {
		 
	 UsuarioImplement user1 = new UsuarioImplement("lucas@gmail.com","12345");
	 UsuarioImplement user2 = new UsuarioImplement("ana@gmail.com","ana123");
	 UsuarioImplement user3 = new UsuarioImplement("rodrigo@gmail.com","senhaforte");
	 UsuarioImplement user4 = new UsuarioImplement("marcos@gmail.com","marcossenha");
	 UsuarioImplement user5 = new UsuarioImplement("caio@gmail.com","senhacaio");
	 UsuarioImplement user6 = new UsuarioImplement("prado@gmail.com","senhafraca");
	 
	 ArrayList<UsuarioImplement> users = new ArrayList<UsuarioImplement>();
	 users.add(user1);
	 users.add(user2);
	 users.add(user3);
	 users.add(user4);
	 users.add(user5);
	 users.add(user6);
	 return users;
	}
}