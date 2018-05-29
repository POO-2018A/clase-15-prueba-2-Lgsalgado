package prueba2;
import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];

        System.out.println("**************Vamos a ingresar la informacion de los 5 estudiantes**************");
        System.out.println();

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("ESTUDIANTE: " + (i + 1));
            System.out.println("INGRESE EL NOMBRE: ");
            String nombreEstudiante = scan.nextLine();
            //scan.nextLine();
            System.out.println("INGRESE LA EDAD: ");
            int edad = scan.nextInt();
            // System.out.println();
            estudiantes[i] = new Estudiante(nombreEstudiante, edad);
            //System.out.println();
            System.out.println("INGRESE LAS 2 MATERIAS DEL ESTUDIANTE " + (i + 1));
            // System.out.print(estudiantes[i]);
            Materia[] materias = new Materia[2];

            for (int j = 0; j < materias.length; j++) {
                scan.nextLine();
                System.out.println("NOMBRE MATERIA " + (j + 1) + ": ");
                String nMateria = scan.nextLine();
                System.out.println("NIVEL MATERIA " + (j + 1) + ": ");
                int nivel = scan.nextInt();
                materias[j] = new Materia(nMateria, nivel);
                // System.out.println();
            }
            estudiantes[i].setMateria(materias);

            System.out.println("USTED INGRESO EL ESTUDIANTE " + (i + 1) + " CON LOS SIGUIENTES DATOS:");
            System.out.println(estudiantes[i]);
            //System.out.println();
            scan.nextLine();
        }
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (estudiantes[i].equals(estudiantes[j + 1])) {
                    System.out.println("USTED TIENE DUPLICADOS EN LAS POSICIONES: " + (i) + " , " + (i + 1));
                }
            }

        }

    }
    }
