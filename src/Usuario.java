
public class Usuario {

	//atributos
	private String login;
	private int password; //un número aleatorio del 0-9
	
	//constructores
	public Usuario(String login) {
		this.login = login;
		this.password = (int) (Math.random() * 10);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Bienvenido de nuevo " + login;
	}
	
}
