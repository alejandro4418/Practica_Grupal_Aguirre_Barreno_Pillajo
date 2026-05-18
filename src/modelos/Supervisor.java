package modelos;

public class Supervisor extends Empleados {
    private String departamento;

    public Supervisor(String nombre, String edadText, String departamento) {
        super(nombre, edadText, 3500.00);

        if (departamento == null) {
            throw new IllegalArgumentException("El departamento no puede estar vacío.");
        }
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("---------------------------\n");
    }
}
