import java.util.HashMap;

public class RegistroEmpleados {
    
    private HashMap<String, Empleado> tablaNombre;
    private HashMap<Integer, Empleado> tablaNumEmpleado;
    private HashMap<String, Empleado> tablaNumSS;

    public RegistroEmpleados() {
        tablaNombre = new HashMap<String, Empleado>();
        tablaNumEmpleado = new HashMap<Integer, Empleado>();
        tablaNumSS = new HashMap<String, Empleado>();
    }

    public void agregarEmpleado(Empleado empleado) {
        tablaNombre.put(empleado.getNombre(), empleado);
        tablaNumEmpleado.put(empleado.getNumEmpleado(), empleado);
        tablaNumSS.put(empleado.getNumSS(), empleado);
    }

    public Empleado buscarPorNombre(String nombre) {
        return tablaNombre.get(nombre);
    }

    public Empleado buscarPorNumEmpleado(int numEmpleado) {
        return tablaNumEmpleado.get(numEmpleado);
    }

    public Empleado buscarPorNumSS(String numSS) {
        return tablaNumSS.get(numSS);
    }
    
}

class Empleado {
    
    private String nombre;
    private int numEmpleado;
    private String numSS;
    
    public Empleado(String nombre, int numEmpleado, String numSS) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.numSS = numSS;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumEmpleado() {
        return numEmpleado;
    }
    
    public String getNumSS() {
        return numSS;
    }
    
}
