public class Docente
{
   private String nombre;
   protected static double smmlv;
   
   

    public Docente() {
    }

    public Docente(String nombre) {
        this.nombre = nombre;
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public static double getSmmlv() {
        return smmlv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setSmmlv(double smmlv) {
        Docente.smmlv = smmlv;
    }
    
}
