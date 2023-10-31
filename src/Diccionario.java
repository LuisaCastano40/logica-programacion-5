import java.util.HashMap;
import java.util.Random;

//Creamos la clase diccionario que tendrá el constructor y las palabras iniciales
public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {

        //Agregamos las palabras iniciales
        this.diccionario = new HashMap<>();
        this.diccionario.put("hola", "hello");
        this.diccionario.put("adiós", "goodbye");
        this.diccionario.put("gato", "cat");
        this.diccionario.put("perro", "dog");
        this.diccionario.put("casa", "house");
        this.diccionario.put("manzana", "apple");
        this.diccionario.put("rojo", "red");
        this.diccionario.put("lunes", "Monday");
        this.diccionario.put("azul", "blue");
        this.diccionario.put("libro", "book");
        this.diccionario.put("amarillo", "yellow");
        this.diccionario.put("martes", "Tuesday");
        this.diccionario.put("verde", "green");
        this.diccionario.put("canción", "song");
        this.diccionario.put("miércoles", "Wednesday");
        this.diccionario.put("negro", "black");
        this.diccionario.put("jueves", "Thursday");
        this.diccionario.put("naranja", "orange");
        this.diccionario.put("viernes", "Friday");
        this.diccionario.put("blanco", "white");
    }

    //Método para seleccionar 5 palabras al Azar
    public String[] seleccionarPalabrasRandom(){
        //Arreglo que me almacena las palabras aleatorias
        String[] palabrasRandom = new String[5];
        //guardamos totas las claves del hasmap en el arreglo claves
        Object[] claves = diccionario.keySet().toArray();
        Random rand = new Random();

        //Ciclo para guardar palabras aleatorias en el arreglo palabrasRandom
        for (int i = 0; i< palabrasRandom.length; i++){
            //genero un indice aleatorio entre 0 y el tamaño del hashMap
            int randomIndex = rand.nextInt(diccionario.size());
            //genera palabra aleatoria según índice anterior
            String palabraRandom = (String) claves[randomIndex];
            palabrasRandom[i] = palabraRandom;
        }

        //Retorna las palabras aleatorias
        return palabrasRandom;
    }

    //método que me devuelve traducción en inglés asociada a palabra, que está en el hashmap diccionario
    public String getTraduccion(String palabra) {
        return diccionario.get(palabra);
    }
}
