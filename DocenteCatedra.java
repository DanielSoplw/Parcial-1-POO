
public abstract class DocenteCatedra extends Docente
{
    protected double salario;
    protected double experienciaEnAños;
    protected int cursosDeActualizacion;
    protected int trabajosPresentados;
    protected int horasTrabajadas;

    // Constructor
    public DocenteCatedra(){
        
    }
    public DocenteCatedra( String nombre, double experienciaEnAños, int cursosDeActualizacion, int trabajosPresentados, int horasTrabajadas, double salario) {    
        super (nombre);
        this.experienciaEnAños = experienciaEnAños;
        this.cursosDeActualizacion = cursosDeActualizacion;
        this.trabajosPresentados = trabajosPresentados;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
    }
    
   

    public double getExperienciaEnAños() {
        return experienciaEnAños;
    }

    public int getCursosDeActualizacion() {
        return cursosDeActualizacion;
    }

    public int getTrabajosPresentados() {
        return trabajosPresentados;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    


    public void setExperienciaEnAños(double experienciaEnAños) {
        this.experienciaEnAños = experienciaEnAños;
    }

    public void setCursosDeActualizacion(int cursosDeActualizacion) {
        this.cursosDeActualizacion = cursosDeActualizacion;
    }

    public void setTrabajosPresentados(int trabajosPresentados) {
        this.trabajosPresentados = trabajosPresentados;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
     }
    
    
    public abstract String validarCategoria();
    public abstract double calcularSalarioMensual();
    
}
