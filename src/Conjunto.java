import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Conjunto <T>{
    Set<T> elementos;

    public Conjunto(Set<T> elementos) {
        this.elementos = elementos;
    }

    public Conjunto() {
        elementos=new HashSet<>();
    }

    public String agregarElemento (T objeto){
        if (elementos.add(objeto)){
            return "Se ha agregado al conjunto '"+objeto+"'";
        }else {
            return "No se ha podido agregar '"+objeto+" al conjunto";
        }
    }

    public String eliminarElemento (T objeto){
        if (elementos.remove(objeto)){
            return "Se ha eliminado del conjunto '"+objeto+"'";
        }else {
            return "'" + objeto + "' no existe en el conjunto.";
        }
    }

    public String verificarExistencia (T objeto){
        if (elementos.contains(objeto)){
            return "'"+objeto+"' existe en el conjunto";
        }
        return "'"+objeto+"' no existe en el conjunto";
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "elementos=" + elementos +
                '}';
    }
}
