package CENTRO_SALUD;
public class Profesional extends Persona {
    private String especialidad;
    private String cargo;
 
    public Profesional(String idPersona, String dni, String nombres, String apellidos,
                        String especialidad, String cargo) {
        super(idPersona, dni, nombres, apellidos);
        this.especialidad = especialidad;
        this.cargo = cargo;
    }
 
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
 
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
 