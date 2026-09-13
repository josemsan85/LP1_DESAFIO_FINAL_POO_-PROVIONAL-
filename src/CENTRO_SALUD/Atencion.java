package CENTRO_SALUD;

public class Atencion {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private Profesional profesional; // quien atiende
    private HistoriaClinica historiaClinica; // a que historia pertenece
    private FUA fua;   // documento generado
    private HIS his;   // documento generado
 
    public Atencion(String fecha, String motivo, String diagnostico, String tratamiento,
                     Profesional profesional, HistoriaClinica historiaClinica) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.profesional = profesional;
        this.historiaClinica = historiaClinica;
    }
 
    public String getFecha() { return fecha; }
    public String getMotivo() { return motivo; }
    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }
    public Profesional getProfesional() { return profesional; }
    public HistoriaClinica getHistoriaClinica() { return historiaClinica; }
 
    public FUA getFua() { return fua; }
    public void setFua(FUA fua) { this.fua = fua; }
 
    public HIS getHis() { return his; }
    public void setHis(HIS his) { this.his = his; }
}