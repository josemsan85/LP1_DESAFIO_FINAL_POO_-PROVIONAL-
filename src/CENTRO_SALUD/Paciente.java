package CENTRO_SALUD;

import java.util.ArrayList;
import java.util.List;
 
public class Paciente extends Persona {
    private String fechaNacimiento;
    private String sexo;
    private HistoriaClinica historiaClinica; // 1 paciente -> 1 historia clinica
 
    public Paciente(String idPersona, String dni, String nombres, String apellidos,
                     String fechaNacimiento, String sexo) {
        super(idPersona, dni, nombres, apellidos);
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
 
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
 
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
 
    public HistoriaClinica getHistoriaClinica() { return historiaClinica; }
    public void setHistoriaClinica(HistoriaClinica historiaClinica) { this.historiaClinica = historiaClinica; }
}
 