

public class persona
{
    String nombre;
    String apellido;
    String sexo;
    String telefono;
    String fechaNac;
    String lugarNac;
    String direccion;

    
    public persona()
    {
      
    }
    //constructor sobrecargado
    public persona(String nom, String ape, String sex, String tel, String fn, String ln, String dire){
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.telefono = tel;
        this.fechaNac = fn;
        this.lugarNac = ln;
        this.direccion = dire;
    }
   
    public void setNombre (String nom){
        this.nombre = nom;
    }
    public void setApellido (String ape){
        this.apellido = ape;
    }
    public void setSexo (String sex){
        this.sexo = sex;
    }
    public void setTelefono (String tel){
        this.telefono = tel;
    }
    public void setFechaNac (String fn){
        this.fechaNac = fn;
    }
    public void setLugarNac (String ln){
        this.lugarNac = ln;
    }
    public void setDireccion (String dire){
        this.direccion = direccion;
    }
    
    
    
    public String getNombre (){
        return this.nombre;
    }
    public String getApellido (){
        return this.apellido;
    }
    public String getSexo (){
        return this.sexo;
    }
    public String getTelefono (){
        return this.telefono;
    }
    public String getFechaNac (){
        return this.fechaNac;
    }
     public String getLugarNac (){
        return this.lugarNac;
    }
     public String getDireccion (){
        return this.direccion;
    }
}
