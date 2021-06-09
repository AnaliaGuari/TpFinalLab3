package Red;

public class Usuario {

	private String nombre;
	private String user;
	private String contrasena;
	private int edad;
	private Favorito[] favoritos = new Favorito [100];//los favoritos son listas de ACosnumir marcados por el usuario, cada uno tiene varias
	/*arreglo de strings con los códigos de los aConsumir y se envían al hashmap de aConsumir del sistema*/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Favorito[] getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(Favorito[] favoritos) {
		this.favoritos = favoritos;
	}
	

}
