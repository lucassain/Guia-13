import java.util.ArrayDeque;
import java.util.Deque;

public class Pila <T>{
    Deque<T> pilaObjetos;

    public Pila() {
        pilaObjetos= new ArrayDeque<>();
    }

    public Pila(Deque<T> pilaObjetos) {
        this.pilaObjetos = pilaObjetos;
    }

    public String agregarObjeto (T objeto){
        int tamanioInicial=pilaObjetos.size();
        pilaObjetos.push(objeto);

        if (pilaObjetos.size()>tamanioInicial){
            return "Se ha agregado '"+objeto+"' a la pila de objetos";
        }else {
            return "No se ha agregado '"+objeto+"' a la pila de objetos";
        }
    }

    public String quitarElemento (T objetoAEliminar){
        System.out.println(verificarVacio());
        int tamanioInicial=pilaObjetos.size();

        Deque<T> aux=new ArrayDeque<>();
        boolean encontrado=false;

        while (!pilaObjetos.isEmpty()){
            T tope=pilaObjetos.pop();

            if (tope.equals(objetoAEliminar) && !encontrado){
                encontrado=true;
                break;
            }else {
                aux.push(tope);
            }
        }

        while (!aux.isEmpty()){
            pilaObjetos.push(aux.pop());
        }

        if (encontrado) {
            return "Se ha quitado '" + objetoAEliminar + "' de la pila de objetos.";
        } else {
            return "No se encontró '" + objetoAEliminar + "' en la pila de objetos.";
        }
    }

    public String verificarVacio (){
        if (pilaObjetos.isEmpty()){
            return "La pila de objetos esta vacia";
        }else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pilaObjetos=" + pilaObjetos +
                '}';
    }
}
