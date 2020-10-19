package usuarioservice.model;

import java.util.List;

public class UsuarioImplement implements Usuario {
	
	
	private String email;
	private String senha;

	@Override
	public boolean logar(UsuarioImplement usuario) {
		
		UsuarioService a = new UsuarioService();		
		List<UsuarioImplement> lista = a.InstanciarUsers();
		 
		 
		 
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getEmail().equals(usuario.getEmail()) && lista.get(i).getSenha().equals(usuario.getSenha())) 
				return true;
			} 
         	return false;
	}
	
	
	public UsuarioImplement(String email, String senha) {
	       this.email = email;
	       this.senha = senha;
	   }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
