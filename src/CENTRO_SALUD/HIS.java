package CENTRO_SALUD;

public class HIS {
    private String idHIS;
    private String fecha;
    private String codigoEstablecimiento;
    private String codigoDiagnostico;
    private String servicio;
    private Atencion atencion; // atencion que origina este reporte
 
    public HIS(String idHIS, String fecha, String codigoEstablecimiento,
               String codigoDiagnostico, String servicio, Atencion atencion) {
        this.idHIS = idHIS;
        this.fecha = fecha;
        this.codigoEstablecimiento = codigoEstablecimiento;
        this.codigoDiagnostico = codigoDiagnostico;
        this.servicio = servicio;
        this.atencion = atencion;
    }
 
    public String getIdHIS() { return idHIS; }
    public String getFecha() { return fecha; }
    public String getCodigoEstablecimiento() { return codigoEstablecimiento; }
    public String getCodigoDiagnostico() { return codigoDiagnostico; }
    public String getServicio() { return servicio; }
    public Atencion getAtencion() { return atencion; }
}
 