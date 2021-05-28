package unidad3;

public class Prueba {
    
    public static void main (String[] args) { 
        Persona vecina = new Persona ("Luisa", "Asenjo Martínez", 1978);
        Alumno unAlumno = new Alumno ("Juan", "Ugarte López", 1985);
        unAlumno.ponGrupo("66", 'M'); vecina.imprime();
        unAlumno.imprime();
        unAlumno.imprimeGrupo();
    }
}