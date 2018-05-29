package prueba2;

import java.util.Objects;

public class Materia {
    private String nombreMateria;
    private int nivelMateria;
    private static int i=1;

    public Materia() {
    }

    public Materia(String nombreMateria, int nivelMateria) {
        this.nombreMateria = nombreMateria;
        this.nivelMateria = nivelMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getNivelMateria() {
        return nivelMateria;
    }

    public void setNivelMateria(int nivelMateria) {
        this.nivelMateria = nivelMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nombreMateria, materia.nombreMateria);
    }

    @Override
    public String toString() {
        return nombreMateria +" - "+ nivelMateria+"NIVEL" ;
    }

}
