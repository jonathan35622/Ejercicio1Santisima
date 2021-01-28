
package modelo;


public class Alumno {
    
   private String nombre;
   private String apellido;
   private String dni;
   private String colorAula;
   
    
   public Alumno(String nombre, String apellido, String dni, String colorAula){
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni  = dni;
       this.colorAula = colorAula;
   }
   
   public void setNombre (String nombre){
   this.nombre = nombre;
   }
   
   public String getNombre(){
   return nombre;
   }
   
   public void setApellido (String apellido){
   this.apellido = apellido;
   
   }
   
   public String getApellido(){
   return apellido;    
   }
   
   public void setDni (String dni){
   this.dni = dni;
   }
   
   public String getDni (){
   return dni;
   }
   
   public void setColorAula(String colorAula){
   this.colorAula= colorAula;
   }
   
   public String getColorAula(){
   return colorAula;
   }
    
}
