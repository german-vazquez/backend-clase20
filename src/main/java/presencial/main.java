package presencial;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("20-30-20", "ankay");
        empresa.agregarEmpleados(new Empleado("cosme", "fulanito", 1154, 56000d));
        empresa.mostrarEmpleados();
        try {
            FileOutputStream fos= new FileOutputStream("Empleados.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            for (Empleado empleado : empresa.getEmpleados()) {
                //guardar cada empleado con su formato correspondiente tipo csv
                String linea= empleado.getNombre()+";"+empleado.getApellido()+";"+empleado.getLegajo()+";"+empleado.getSueldo()+"\n";
                bos.write(linea.getBytes());
            }
            bos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
