import java.util.ArrayList;

public class principal
{
   
    public static void pricipal(String[]args)
    {
        ArrayList<empleado> contratistas = new ArrayList<empleado>(); 

     empleado empleado1 = new empleado();
     empleado1.setNombre("William");
     empleado1.setApellido("Alvarez");
     empleado1.setSexo("Masculino");
     empleado1.setDireccion("CRA 37a# 27-82");
     empleado1.setTelefono("7439373");
     empleado1.setFechaNac("16/3/1989");
     empleado1.setLugarNac("Barranquilla");


     empleado empleado2 = new empleado();
     empleado2.setNombre("diomedes");
     empleado2.setApellido("diaz");
     empleado2.setSexo("Masculino");
     empleado2.setDireccion("CRA 100# 67B34");
     empleado2.setTelefono("343487");
     empleado2.setFechaNac("22/01/1968");
     empleado2.setLugarNac("junta");

     contratistas.add(empleado1);
     contratistas.add(empleado2);


     contratistas.forEach((emp) -> System.out.println(emp.getNombre() + "  " + emp.getApellido() + " | " + emp.getSexo() + " | " + emp.getTelefono() + " | " + emp.getFechaNac() + " | " + emp.getLugarNac() ));
    }

    
    
}
