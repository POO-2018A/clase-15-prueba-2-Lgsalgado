package prueba2;

import java.util.Arrays;
import java.util.Objects;

public class Estudiante {

    private String nombre;
    private int edad;
    private Materia[] materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad &&
                Objects.equals(nombre, that.nombre) &&
                Arrays.equals(materia, that.materia);
    }


    @Override

    public String toString() {
        return
                "NOMBRE: " + nombre +
                "\t EDAD: " + edad+" \t" +"\t MATERIAS: \t " + Arrays.toString(materia);
    }


}
