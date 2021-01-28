
package controlador;

import java.util.ArrayList;
import modelo.Alumno;


public class ControlRegistroAlumno {
    
            
    private static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    
     public static void agregarAlumno(Alumno nuevoAlumno){
        listaAlumnos.add(nuevoAlumno);
    }
     
     public static ArrayList mostrarAlumno(){
        return listaAlumnos;
    }
    
}
