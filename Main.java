
public class Main
{
     public static void main(String[] args) {
        
        Docente.setSmmlv(1300000);
        
        DocenteOcasional docenteOcasional = new DocenteOcasional("Juan Pérez", "Maestría");
        System.out.println("Nombre del Docente Ocasional: " + docenteOcasional.getNombre());
        System.out.println("Nivel de estudio: " + docenteOcasional.getNivelEstudio());
        System.out.println("Salario mensual: $" + docenteOcasional.calcularSalarioMensual());
        
        Docente.setSmmlv(1300000); 
        
        Asistente docenteCatedra = new Asistente("María López", 2, 1, 1, 64, 40000);

        System.out.println("Nombre del docente de cátedra: " + docenteCatedra.getNombre());
        System.out.println("Experiencia en años: " + docenteCatedra.getExperienciaEnAños());
        System.out.println("Cursos de actualización: " + docenteCatedra.getCursosDeActualizacion());
        System.out.println("Trabajos presentados: " + docenteCatedra.getTrabajosPresentados());
        System.out.println("Horas trabajadas: " + docenteCatedra.getHorasTrabajadas());
        System.out.println("Salario mensual: $" + docenteCatedra.calcularSalarioMensual());
        System.out.println("Validación de categoría: " + docenteCatedra.validarCategoria());
    }
        
       
    }
