package lab.vi;

import org.junit.Test;
import org.junit.Assert;


public class UsuarioTest {


    @Test
    public void testeUsuarioCadastrado() {
    	Usuario usuario = new Usuario();
		usuario.setEmail("rodrigo@gmail.com");
		usuario.setSenha("senhaForte");
		
		
		Assert.assertEquals(true, usuario.logar(usuario));
    }
    
    @Test
    public void testeSenha() {
    	Usuario usuario = new Usuario();
		usuario.setEmail("rodrigo@gmail.com");
		usuario.setSenha("senhaFraca");
		
		Assert.assertEquals(false, usuario.logar(usuario));
    }

    @Test
    public void testeUsuarioNaoCadastrado() {
    	Usuario usuario = new Usuario();
		usuario.setEmail("prado@gmail.com");
		usuario.setSenha("senhaFraca");
		
		Assert.assertEquals(false, usuario.logar(usuario));
    }

	
}

