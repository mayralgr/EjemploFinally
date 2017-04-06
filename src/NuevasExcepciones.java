/**
 * Created by Alumnos on 06/04/2017.
 */
public class NuevasExcepciones {

    public static void main(String [] args)
    {
        System.out.println("Ejemplo finally");
        try {
            Alumno a1 = new Alumno(-123,"");
            Alumno a2 = new Alumno(123,null);
            noLanzaExcepcion();
            lanzaExcepcion();

        }
        catch (Myexception ex )
        {
            System.out.println(ex);
        }

    }

    private static void lanzaExcepcion() {
        try{
            System.out.println("Método lanzaexpecion");
            throw new Myexception("PROBANDO..............");
        }
        finally {
            System.out.println("Se ejecuta finally en lanza excecion");
        }

    }

    private static void noLanzaExcepcion() {
        try {
            System.out.println("Bonjour");
            metodo1();

        }
        catch (Myexception myE)
        {
            System.out.println("No hay nada que atrapar (ne pas)");
        }
        finally {
            System.out.println("Se ejecuta el finally en noLanzaExcepcion");
        }

    }

    private static void metodo1() {
        throw new Myexception("Lanzando..............");
    }


}
