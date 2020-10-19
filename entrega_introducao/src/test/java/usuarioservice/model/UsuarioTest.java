package usuarioservice.model;
 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

	@Test
    public void loginCorretoTest(){
        	
		UsuarioImplement usuario = new UsuarioImplement("rodrigo@gmail.com","senhaforte");	
		Assertions.assertTrue(usuario.logar(usuario));
    }
	
	@Test
    public void loginIncorretoTest(){
		
		UsuarioImplement usuario = new UsuarioImplement("rodrigo@gmail.com","senha");	
		Assertions.assertFalse(usuario.logar(usuario));
    }
	
}
