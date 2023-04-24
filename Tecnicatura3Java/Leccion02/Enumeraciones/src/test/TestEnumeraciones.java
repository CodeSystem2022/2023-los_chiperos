package test;

import enumeraciones.Dias;
import enumeraciones.Continentes;

public class TestEnumeraciones {

    public static void main(String[] args) {
        //System.out.println("Dia 1: " + Dias.LUNES);
        // indecarDiasSemana(Dias.LUNES); //Las enumeraciones se tratan como cadenas
        //Ahora no se deben utilizar comillas, se accede a través de el operador de punto

        //1er continente
        System.out.println("Continente No.1: " + Continentes.AFRICA);
        System.out.println("No. de paises en el 1er. continent: "
                + Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er. continente: "
                + Continentes.AFRICA.getHabitantes());

        //2do continente
        System.out.println("Continente No.2: " + Continentes.EUROPA);
        System.out.println("No. de paises en el 2do. continent: "
                + Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do. continente: "
                + Continentes.EUROPA.getHabitantes());

        //3er contiennte
        System.out.println("Continente No.3: " + Continentes.ASIA);
        System.out.println("No. de paises en el 3er. continent: "
                + Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er. continente: "
                + Continentes.ASIA.getHabitantes());

        //4to continente
        System.out.println("Continente No.4: " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4to. continent: "
                + Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to. continente: "
                + Continentes.AMERICA.getHabitantes());

        //5to contiennte
        System.out.println("Continente No.5: " + Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to. continent: "
                + Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to. continente: "
                + Continentes.OCEANIA.getHabitantes());
    }

    private static void indecarDiasSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            //Agregar todos los dias de la semana
            //Agregar default
            case MIÉRCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No se ingreso el día de la semana");
                break;
        }
    }
}
