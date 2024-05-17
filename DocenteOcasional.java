
public class DocenteOcasional extends Docente {
    private String nivelEstudio;
    
    public DocenteOcasional(String nombre){
        super (nombre); 
    }
  
    public DocenteOcasional(String nombre, String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    
    public double calcularSalarioMensual() {
        double salario = 0;
        switch (nivelEstudio) {
            case "Especialización":
                salario = 3 * smmlv;
                break;
            case "Maestría":
                salario = 4 * smmlv;
                break;
            case "Doctorado":
                salario = 5 * smmlv;
                break;
            default:
                break;
         }
        return salario;
    }
}