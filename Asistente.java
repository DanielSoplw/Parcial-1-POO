public class Asistente extends DocenteCatedra
{
    public Asistente ( String nombre, int experienciaEnAños, int cursosDeActualizacion, int trabajosPresentados, int horasTrabajadas, double salario){
        super (nombre, experienciaEnAños, cursosDeActualizacion,trabajosPresentados, horasTrabajadas, salario);
    }
     
    @Override 
    public String validarCategoria(){
        if(experienciaEnAños >= 4 && trabajosPresentados >= 1 && cursosDeActualizacion >= 1){
            return "El docente de cátedra cumple con los requisitos para ser asimilado a Profesor Asistente.";
     } else {
        return "El docente de cátedra no cumple con los requisitos";
      }
    }
    @Override
    public double calcularSalarioMensual(){
        salario = 45000*horasTrabajadas;
        return salario; 
     }
}
