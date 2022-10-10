package presencial2;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        Empresa2 empresa2= new Empresa2("20-2020215-2", "Java S.A.");
        empresa2.agregarEmpleado(new Empleado2("Juan", "Rodriguez", 1154, 56000.0));

        empresa2.mostrarEmpleado();

        try {
            FileOutputStream fos = new FileOutputStream("Empleados2.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);

            for(Empleado2 empleado2: empresa2.getEmpleados()){
                //guardar cada empleado en su formato correspondiente tipo csb
                String linea= empleado2.getNombre()+";"+ empleado2.getApellido()+";"+empleado2.getLegajo()+";"+empleado2.getSueldo()+"\n";
                //una vez generada la linea con el formato correspondiente, escribimos el buffer
                bos.write(linea.getBytes());//el bos.write pide un array de bytes y el linea.getByte() convierte justamente el string en un byte[]
            }
            bos.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
