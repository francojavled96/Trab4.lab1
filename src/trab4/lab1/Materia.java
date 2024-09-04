
package trab4.lab1;

public class Materia {

    private int id;
    private String nombre;
    private String año;

    public Materia(int id, String nombre, String año) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materia materia = (Materia) o;

        if (id != materia.id) return false;
        return nombre.equals(materia.nombre);
    }
    
     public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        return result;
    }
    
}
