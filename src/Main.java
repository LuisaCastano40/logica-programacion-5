/*  ======================= LÓGICA DE PROGRAMACIÓN CON JAVA ======================*/
/*  ========================= DICCIONARIO ESPAÑOL - INGLÉS ======================*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos nuestro diccionario y traemos las palabras al azar
        Diccionario diccionarioIng = new Diccionario();
        String[] palabras = diccionarioIng.seleccionarPalabrasRandom();

        //Inicializamos escaner y contadores
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        // ciclo para pedir la traduccion de las palabras aleatorias
        for (String palabra : palabras) {
            System.out.println("Ingresa la traducción en inglés de la palabra: " + palabra);
            String traduccion = scanner.nextLine();

            //Si el usuario lo hizo bien, se cuentan las correctas, si no, las incorrectas
            if (diccionarioIng.getTraduccion(palabra).equalsIgnoreCase(traduccion)) {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        scanner.close();

        // Mostrar el resultado final
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }
}