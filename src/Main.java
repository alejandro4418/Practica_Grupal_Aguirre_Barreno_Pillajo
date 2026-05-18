//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package modelos;

public class Main {
    void main() {
        Supervisor jefe = new Supervisor("Alejandro Aguirre", "26", "Sistemas");

        jefe.mostrarDatos();

        System.out.println("Calculando bono extremo para forzar el desbordamiento numérico...");
        jefe.forzarOverflowSalario(Double.MAX_VALUE);

        System.out.println("Este mensaje no saldrá en consola.");
    }
}
