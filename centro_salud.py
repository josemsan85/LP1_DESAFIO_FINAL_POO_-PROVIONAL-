from abc import ABC
from typing import List, Optional


class Persona(ABC):
    def __init__(self, id_persona: str, dni: str, nombres: str, apellidos: str):
        self.id_persona = id_persona
        self.dni = dni
        self.nombres = nombres
        self.apellidos = apellidos

    def __str__(self):
        return f"{self.nombres} {self.apellidos} (DNI: {self.dni})"


class Paciente(Persona):
    def __init__(self, id_persona: str, dni: str, nombres: str, apellidos: str,
                 fecha_nacimiento: str, sexo: str):
        super().__init__(id_persona, dni, nombres, apellidos)
        self.fecha_nacimiento = fecha_nacimiento
        self.sexo = sexo
        self.historia_clinica: Optional["HistoriaClinica"] = None  # 1 paciente -> 1 historia clinica


class Profesional(Persona):
    def __init__(self, id_persona: str, dni: str, nombres: str, apellidos: str,
                 especialidad: str, cargo: str):
        super().__init__(id_persona, dni, nombres, apellidos)
        self.especialidad = especialidad
        self.cargo = cargo


class HistoriaClinica:
    def __init__(self, id_historia: str, fecha_apertura: str, antecedentes: str,
                 alergias: str, paciente: Paciente):
        self.id_historia = id_historia
        self.fecha_apertura = fecha_apertura
        self.antecedentes = antecedentes
        self.alergias = alergias
        self.paciente = paciente  # dueño de la historia
        self.atenciones: List["Atencion"] = []  # 1 historia -> N atenciones

    def agregar_atencion(self, atencion: "Atencion"):
        self.atenciones.append(atencion)


class Atencion:
    def __init__(self, fecha: str, motivo: str, diagnostico: str, tratamiento: str,
                 profesional: Profesional, historia_clinica: HistoriaClinica):
        self.fecha = fecha
        self.motivo = motivo
        self.diagnostico = diagnostico
        self.tratamiento = tratamiento
        self.profesional = profesional  # quien atiende
        self.historia_clinica = historia_clinica  # a que historia pertenece
        self.fua: Optional["FUA"] = None  # documento generado
        self.his: Optional["HIS"] = None  # documento generado


class FUA:
    def __init__(self, id_fua: str, fecha: str, servicio: str, diagnostico: str,
                 procedimiento: str, atencion: Atencion):
        self.id_fua = id_fua
        self.fecha = fecha
        self.servicio = servicio
        self.diagnostico = diagnostico
        self.procedimiento = procedimiento
        self.atencion = atencion  # atencion que origina este formato


class HIS:
    def __init__(self, id_his: str, fecha: str, codigo_establecimiento: str,
                 codigo_diagnostico: str, servicio: str, atencion: Atencion):
        self.id_his = id_his
        self.fecha = fecha
        self.codigo_establecimiento = codigo_establecimiento
        self.codigo_diagnostico = codigo_diagnostico
        self.servicio = servicio
        self.atencion = atencion  # atencion que origina este reporte
