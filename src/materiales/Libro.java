package materiales;

public class Libro extends Materiales implements prestable{

    public Libro(estados estado, String nombre) {
        super(estado, nombre);
    }


    @Override
    public String toString() {
        return "Libro{}";
    }

    @Override
    public void prestar() {
        is(this.getEstado() == estados.EN_PRESTAMO)
      {
          System.out.printf("ESTA PRESTADO");
        }else{

        }
        this.setEstado(estados.EN_PRESTAMO);
        {

    }

    @Override
    public void devolver() {

    }
}
