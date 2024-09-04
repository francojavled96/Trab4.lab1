
package trab4.lab1;

public class Trab4Lab1 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia ingles= new Materia (12, "ingles", "1er año");
        Materia matematica= new Materia (11,"matematica","1er año");
        Materia laboratorio1= new Materia (13,"Laboratorio 1","1er año");
        
        Alumnos alu1= new Alumnos (1001,"Lopez","Martin");
        Alumnos alu2= new Alumnos (1002, "Martinez", "Brenda");
        
        alu1.AgregarMateria(ingles);
        alu1.AgregarMateria(matematica);
        alu1.AgregarMateria(laboratorio1);
        
        alu2.AgregarMateria(ingles);
        alu2.AgregarMateria(matematica);
        alu2.AgregarMateria(laboratorio1);
        
        
        alu2.AgregarMateria(laboratorio1);
        
        alu1.cantidadMaterias();
        alu2.cantidadMaterias();
    }
    
}
