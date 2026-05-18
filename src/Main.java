//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package modelos;

public class Main {
    void main() {
        Supervisor jefe = null;
        try {
            jefe = new Supervisor("Alejandro Aguirre", "26", "3500.00");
            jefe.mostrarDatos();

        } catch (NumberFormatException e) {
            System.out.println("\nERROR DE CONVERSIÓN: El formato de la edad debe ser puramente numérico.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("\nERROR DE VALIDACIÓN: " + e.getMessage());
            return;
        }

        System.out.println("Calculando bono extremo para forzar el desbordamiento numérico...");
        try {
            jefe.forzarOverflowSalario(Double.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("\nERROR: " + e.getMessage());
        }
    }
}
