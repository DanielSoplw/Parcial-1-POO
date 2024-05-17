
public class Auxiliar extends DocenteCatedra
{
    public Auxiliar (String nombre, double experienciaEnAños, int cursosDeActualizacion, int trabajosPresentados, int horasTrabajadas, double salario){
        super (nombre, experienciaEnAños, cursosDeActualizacion,trabajosPresentados, horasTrabajadas, salario);
    }
    
    @Override 
    public String validarCategoria() {
        if (experienciaEnAños >= 0.66) {
        return "El docente de cátedra cumple con los requisitos para ser asimilado a Profesor Auxiliar.";
    } else {
        return "El docente de cátedra no cumple con los requisitos";
     }
   }
   
   @Override 
   public double calcularSalarioMensual() {
       salario = 40000*horasTrabajadas;
        return salario;
   }
}
