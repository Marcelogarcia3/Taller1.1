public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Deportista jugador1 = new Jugador("Jugador 1", "Apellido 1", "Dirección 1", "123456", "Fútbol", "Delantero");
        Deportista jugador2 = new Jugador("Jugador 2", "Apellido 2", "Dirección 2", "789012", "Fútbol", "Defensa");

        // Crear entrenador
        Entrenador entrenador = new Entrenador("Entrenador 1", "Apellido Entrenador", "Dirección Entrenador", "345678", "futbol", "Entrenador","5 años", "Futbol");

        // Crear equipo
        Equipo equipo = new Equipo();
        equipo.setEntrenador(String.valueOf(entrenador));
        equipo.agregarDeportista(jugador1);
        equipo.agregarDeportista(jugador2);

        // Imprimir información del equipo
        System.out.println(equipo.toString());
    }
}