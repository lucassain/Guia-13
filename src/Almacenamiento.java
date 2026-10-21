import java.util.ArrayList;
import java.util.List;

public class Almacenamiento <T>{
    private List<T> listaAlmacenamiento;

    public Almacenamiento() {
        listaAlmacenamiento= new ArrayList<>();
    }

    public Almacenamiento(List<T> listaAlmacenamiento) {
        this.listaAlmacenamiento = listaAlmacenamiento;
    }

    public String agregarObjeto(T objeto){
        if (listaAlmacenamiento.add(objeto)){
            return ""+objeto+" se ha agregado correctamente a la lista";
        }else {
            return "No se ha podido agregar '"+objeto+"' a la lista";
        }
    }

    public String eliminarObjeto (T objeto){
        if (listaAlmacenamiento.remove(objeto)){
            return ""+objeto+" se ha eliminado correctamente de la lista";
        }else {
            return "No se ha podido eliminar '"+objeto+" de la lista";
        }
    }

    public boolean buscarObjeto (T objetoABuscar){
        for (T objeto:listaAlmacenamiento){
            if (objeto.equals(objetoABuscar)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Almacenamiento{" +
                "listaAlmacenamiento=" + listaAlmacenamiento +
                '}';
    }
}
