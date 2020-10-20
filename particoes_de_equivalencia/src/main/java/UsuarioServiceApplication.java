import com.google.gson.Gson;
import usuarioservice.model.UsuarioImplement;

public class UsuarioServiceApplication {
	
	public static void main(String[] args) {
		
        System.out.println("Login do Usuario");
        Gson gson = new Gson();

		UsuarioImplement usuario = new UsuarioImplement("rodrigo@gmail.com","senhaforte");	
		if(usuario.logar(usuario)) {
			System.out.println(gson.toJson("Login Correto!"));
		}
		else{
			System.out.println(gson.toJson("Login Incorreto!"));
		}
      
    }

}
