package lab.vi;

public class Usuario implements UsuarioInterface {
	
	private String email;
	private String senha;

	@Override
	public boolean logar(Usuario usuario) {
		if(emailBD.equals(usuario.getEmail()) && senhaBD.equals(usuario.getSenha())) 
		return true;
		 else
		return false;
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

	String emailBD = "rodrigo@gmail.com";
    String senhaBD = "senhaForte";



}

