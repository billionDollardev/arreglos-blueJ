

public class persona
{
    String nombre;
    String apellido;
    String sexo;
    String telefono;
    

    
    public persona()
    {
      
    }
    //constructor sobrecargado
    public persona(String nom, String ape, String sex, String tel){
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.telefono = tel;
    }
   
}
