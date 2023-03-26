public class Operaciones {
    int suma(int[] array) {
        var suma = 0;
        for (var i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    int multiplicacion(int[] array) {
        var multiplicacion = 1;
        for (var i = 0; i < array.length; i++) {
            multiplicacion *= array[i];
        }
        return multiplicacion;
    }

    void imprimir(int[] array) {
        for (var i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}