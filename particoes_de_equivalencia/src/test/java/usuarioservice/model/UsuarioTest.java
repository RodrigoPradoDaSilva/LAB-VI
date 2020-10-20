package usuarioservice.model;
 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {


	//Partição válido correto	
	@Test
    public void validoCorretoTest(){
        	
		UsuarioImplement usuario = new UsuarioImplement("rodrigo@gmail.com","senhaforte");	
		Assertions.assertTrue(usuario.logar(usuario));
    }
	
	//Partição válido incorreto
	@Test
    public void validoIncorretoTest(){
		
		UsuarioImplement usuario = new UsuarioImplement("rodrigo@gmail.com","senha");	
		Assertions.assertFalse(usuario.logar(usuario));
    }
	
	//Partição inválido 
	@Test
    public void invalidoTest(){
		
		UsuarioImplement usuario = new UsuarioImplement(null,"senha");	
		Assertions.assertFalse(usuario.logar(usuario));
    }
}
