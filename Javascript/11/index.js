class Estudiante {
    
    constructor (nombre, asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas
    }

    ObtenerDatos() {
        return {
            nombre: this.nombre,
            asignaturas: this.asignaturas
        }
    }
    
}

const miEstudiante = new Estudiante("Gerardo", ["HTML", "Javascript", "CSS"]);

console.log(miEstudiante.ObtenerDatos())