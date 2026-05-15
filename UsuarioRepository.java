// Archivo: UsuarioRepository.java
public class UsuarioRepository {
    public void guardar(Usuario usuario) {
        System.out.println("Guardando a " + usuario.getNombre() + " en la base de datos...");
    }
}