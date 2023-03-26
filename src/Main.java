public class Main {
    public static void main(String[] args) {
        imprimirOperaciones();
    }

    private static int[] generarArray() {
        final var aleatorio = new Aleatorio();
        final var numeroArray = aleatorio.generarRandomInteger(10, 5);
        var array = new int[numeroArray];
        for (var i = 0; i < array.length; i++) {
            array[i] = aleatorio.generarRandomInteger(10, 2);
        }
        return array;
    }

    private static void imprimirOperaciones() {
        final var array = generarArray();
        final var operaciones = new Operaciones();
        final var suma = operaciones.suma(array);
        final var multiplicacion = operaciones.multiplicacion(array);
        System.out.println("El array es:");
        operaciones.imprimir(array);
        System.out.println();
        System.out.println("La suma es:");
        System.out.println(suma);
        System.out.println("La multiplicacion es:");
        System.out.println(multiplicacion);
    }
}