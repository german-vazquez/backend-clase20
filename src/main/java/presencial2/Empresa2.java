package presencial2;


import java.util.ArrayList;
import java.util.List;

public class Empresa2 {
    private String cuit;
    private String razonSocial;
    private List<Empleado2> empleados;

    public Empresa2(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        empleados= new ArrayList<>();
    }

    public void mostrarEmpleado(){
        for (Empleado2 empleado: empleados) {
            System.out.println(empleado);
        }
    }

    public void agregarEmpleado(Empleado2 empleado2){
        empleados.add(empleado2);
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado2> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado2> empleados) {
        this.empleados = empleados;
    }
}
