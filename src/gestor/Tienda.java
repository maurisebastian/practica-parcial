package gestor;
import java.util.List;
import java.util.ArrayList;
public class Tienda {
    GestorUsuario usuario;
    Catalogo catalogo;
    List <Prestamo> prestamos;

    public Tienda() {
        this.usuario = new GestorUsuario();
        this.catalogo = new Catalogo();
        this.prestamos = new ArrayList<>();
    }
    
}
