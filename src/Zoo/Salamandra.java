package Zoo;

public class Salamandra extends Anfibio {
    // Atributos específicos de Salamandra podrían añadirse aquí

    // Constructor sin parámetros
    public Salamandra() {
        super();
        // La salamandra podría tener configuraciones predeterminadas o valores aleatorios específicos
    }

    // Constructor con parámetros
    public Salamandra(String nombre, int edad, float peso, boolean puedeRespirarBajoAgua, String colorPiel) {
        super(nombre, edad, peso, puedeRespirarBajoAgua, colorPiel);
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " la salamandra está reptando lentamente.");
    }

    // Método único de Salamandra
    public void regenerar() {
        System.out.println(getNombre() + " está regenerando su cola.");
    }

    @Override
    public void verAnimal() {
        // Tres acciones aleatorias, incluyendo las propias de esta especie.
        java.util.Random random = new java.util.Random();
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse,
            this::nadar,
            this::metamorfosis,
            this::regenerar
        };

        for (int i = 0; i < 3; i++) {
            acciones[random.nextInt(acciones.length)].run();
            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
