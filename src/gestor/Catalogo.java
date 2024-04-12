package gestor;

import materiales.Materiales;
import java.util.List;
import java.util.ArrayList;

public class Catalogo {
    List <Materiales> materialesList;

    public Catalogo(List<Materiales> materialesList) {
        this.materialesList = new ArrayList<>();

    }
    public void agregarMaterial(Materiales material){
        this.materialesList.add(material);

    }
    public void mostrar_materiales(){
        for (Materiales material: materialesList){
            material.toString();
        }

    }

}
