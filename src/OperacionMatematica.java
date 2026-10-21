import java.util.Scanner;

public class OperacionMatematica <T extends Number>{
    private T numero1, numero2;

    public OperacionMatematica(T numero1, T numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public T getNumero1() {
        return numero1;
    }

    public void setNumero1(T numero1) {
        this.numero1 = numero1;
    }

    public T getNumero2() {
        return numero2;
    }

    public void setNumero2(T numero2) {
        this.numero2 = numero2;
    }

    // Usan los atributos de la instancia
    public double sumar() {
        return numero1.doubleValue() + numero2.doubleValue();
    }

    public double restar() {
        return numero1.doubleValue() - numero2.doubleValue();
    }

    public double multiplicar() {
        return numero1.doubleValue() * numero2.doubleValue();
    }

    public double dividir() throws ArithmeticException {
        if (numero2.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return numero1.doubleValue() / numero2.doubleValue();
    }

    public static void gestionarCalculadora() {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;

        // Instanciamos el objeto de la calculadora
        OperacionMatematica<Double> operacion = new OperacionMatematica<>(0.0, 0.0);

        do {
            System.out.println("\n===== ESTO ES UNA CALCULADORA =====");
            System.out.println("0. Salir del programa");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Ingrese la operacion que desea efectuar: ");
            opcion = entrada.nextInt();

            // Solo pedimos los números si la opción seleccionada es válida (1 a 4)
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Numero 1: ");
                operacion.setNumero1(entrada.nextDouble());

                System.out.print("Numero 2: ");
                operacion.setNumero2(entrada.nextDouble());

                switch (opcion) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + operacion.sumar());
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + operacion.restar());
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicacion es: " + operacion.multiplicar());
                        break;
                    case 4:
                        try {
                            System.out.println("El resultado de la division es: " + operacion.dividir());
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                }
            } else if (opcion == 0) {
                System.out.println("Cerrando calculadora...");
            } else {
                System.out.println("Opcion invalida. Ingrese otra opcion.");
            }

        } while (opcion != 0);
    }
}