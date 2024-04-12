package materiales;

public abstract class Materiales {
    private estados estado;
    private String nombre;

    public Materiales( String nombre) {
        this.estado = estados.DISPONIBLE;
        this.nombre = nombre;

    }

    public estados getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(estados estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materiales{" +
                "estado=" + estado +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
