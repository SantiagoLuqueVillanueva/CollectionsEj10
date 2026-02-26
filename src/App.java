import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("cielo", "sky");
        diccionario.put("ordenador", "computer");
        diccionario.put("teclado", "keyboard");
        diccionario.put("raton", "mouse");
        diccionario.put("pantalla", "screen");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("coche", "car");

        String palabraUsuario = System.console().readLine();

        if (diccionario.containsKey(palabraUsuario)) {
            String traduccion = diccionario.get(palabraUsuario);
            System.out.println("La traducción de '" + palabraUsuario + "' es: " + traduccion);
        } else {
            System.out.println("Lo siento, la palabra '" + palabraUsuario + "' no está en el diccionario.");
        }
    }
}
