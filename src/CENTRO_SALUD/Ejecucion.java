package CENTRO_SALUD;
 
public class Ejecucion {
    public static void main(String[] args) {
 
        // 1. Registrar al profesional que atiende
        Profesional profesional = new Profesional(
                "PR001", "27654321", "Ana", "Torres Quispe",
                "Medicina General", "Medico");
 
        // 2. Registrar al paciente
        Paciente paciente = new Paciente(
                "PA001", "87654321", "Luis", "Ramos Vega",
                "1990-05-10", "M");
 
        // 3. Abrir su historia clinica
        HistoriaClinica historia = new HistoriaClinica(
                "H001", "2026-09-12", "Ninguno", "Ninguna",
                paciente);
        paciente.setHistoriaClinica(historia);
 
        // 4. Registrar una atencion
        Atencion atencion = new Atencion(
                "2026-09-12", "Dolor de cabeza intenso", "Migraña",
                "Reposo y analgesico", profesional, historia);
        historia.agregarAtencion(atencion);
 
        // 5. Generar los documentos que origina la atencion
        FUA fua = new FUA(
                "FUA001", "2026-09-12", "Medicina General",
                "Migraña", "Consulta ambulatoria", atencion);
        HIS his = new HIS(
                "HIS001", "2026-09-12", "00123",
                "G43", "Medicina General", atencion);
        atencion.setFua(fua);
        atencion.setHis(his);
 
        // 6. Mostrar el resultado
        System.out.println("=== Paciente ===");
        System.out.println(paciente);
        System.out.println("Fecha nacimiento: " + paciente.getFechaNacimiento());
 
        System.out.println("\n=== Profesional que atiende ===");
        System.out.println(profesional);
        System.out.println("Especialidad: " + profesional.getEspecialidad());
 
        System.out.println("\n=== Historia clinica ===");
        System.out.println("Id historia: " + historia.getIdHistoria());
        System.out.println("Cantidad de atenciones: " + historia.getAtenciones().size());
 
        System.out.println("\n=== Atencion registrada ===");
        System.out.println("Motivo: " + atencion.getMotivo());
        System.out.println("Diagnostico: " + atencion.getDiagnostico());
        System.out.println("Atendido por: " + atencion.getProfesional().getNombres());
 
        System.out.println("\n=== Documentos generados ===");
        System.out.println("FUA id: " + atencion.getFua().getIdFUA()
                + " | servicio: " + atencion.getFua().getServicio());
        System.out.println("HIS id: " + atencion.getHis().getIdHIS()
                + " | codigo diagnostico: " + atencion.getHis().getCodigoDiagnostico());
    }
}
 