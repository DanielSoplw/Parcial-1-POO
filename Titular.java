
public class Titular extends DocenteCatedra
{ 
    public Titular (String nombre, double experienciaEnAños, int cursosDeActualizacion, int trabajosPresentados, int horasTrabajadas, double salario){
        super (nombre, experienciaEnAños, cursosDeActualizacion,trabajosPresentados, horasTrabajadas, salario);
    }
     
    @Override 
    public String validarCategoria(){
        if (experienciaEnAños >= 8 && trabajosPresentados >= 2 && cursosDeActualizacion >= 1) {
        return "El docente de cátedra cumple con los requisitos para ser asimilado a Profesor Titular.";
     } else {
        return "El docente de cátedra no cumple con los requisitos";
      }
    } 
    @Override
    public double calcularSalarioMensual(){
        salario = 55000*horasTrabajadas;
        return salario;
    }
}
