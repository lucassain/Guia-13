import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main <T>{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion=0;

        do {
            System.out.println("0 para salir.");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ingrese una opcion: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Cerrando programa...");
                    break;
                }

                case 1:{
                    Almacenamiento almacenamiento= new Almacenamiento<>();

                    System.out.println(almacenamiento.agregarObjeto(1));
                    System.out.println(almacenamiento.agregarObjeto("Bide"));
                    System.out.println(almacenamiento.agregarObjeto(5.55));
                    System.out.println(almacenamiento.agregarObjeto('c'));
                    System.out.println(almacenamiento.agregarObjeto(234));

                    System.out.println("lista: \n"+almacenamiento);

                    System.out.println(almacenamiento.eliminarObjeto("Bide"));
                    System.out.println("lista actualizada: \n"+almacenamiento);

                    boolean encontrado=false;
                    if (almacenamiento.buscarObjeto(234)){
                        System.out.println("El objeto buscado se encuentra en la lista");
                    }else {
                        System.out.println("El objeto buscado no se encuentra en la lista");
                    }

                    break;
                }

                case 2:{
                    Pila pilaObjetos= new Pila<>();

                    System.out.println(pilaObjetos.verificarVacio());

                    System.out.println(pilaObjetos.agregarObjeto(1));
                    System.out.println(pilaObjetos.agregarObjeto("Lucas"));
                    System.out.println(pilaObjetos.agregarObjeto(5.55));
                    System.out.println(pilaObjetos.agregarObjeto('f'));

                    System.out.println(pilaObjetos.quitarElemento("Lucas"));
                    break;
                }

                case 3:{
                    OperacionMatematica.gestionarCalculadora();
                    break;
                }

                case 4:{

                    System.out.println("\n--- PRUEBA CONJUNTO DE TEXTOS (String) ---");
                    Conjunto<String> conjuntoNombres = new Conjunto<>();

                    System.out.println(conjuntoNombres.agregarElemento("Lucas"));
                    System.out.println(conjuntoNombres.agregarElemento("Franco"));
                    System.out.println(conjuntoNombres.agregarElemento("Lucas")); // Intento de duplicado

                    System.out.println(conjuntoNombres.verificarExistencia("Franco"));
                    System.out.println(conjuntoNombres.eliminarElemento("Franco"));
                    System.out.println(conjuntoNombres.verificarExistencia("Franco"));
                    System.out.println(conjuntoNombres);

                    System.out.println("\n--- PRUEBA CONJUNTO DE NUMEROS (Integer) ---");
                    Conjunto<Integer> conjuntoNumeros = new Conjunto<>();

                    System.out.println(conjuntoNumeros.agregarElemento(100));
                    System.out.println(conjuntoNumeros.agregarElemento(200));
                    System.out.println(conjuntoNumeros.agregarElemento(100)); // Intento de duplicado
                    System.out.println(conjuntoNumeros.verificarExistencia(200));
                    System.out.println(conjuntoNumeros);

                    break;
                }

                default:{

                    System.out.println("Opcion invalida. Ingrese otra opcion.");
                    break;
                }
            }

        }while (opcion!=0);
    }
}