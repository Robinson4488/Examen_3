public class Util {
    private static long tiempoInicio;
    private static long tiempoFinal;

    public static void iniciarCronometro() {
        tiempoInicio = System.currentTimeMillis();
    }

    public static String getTextoTiempoCronometro() {
        tiempoFinal = System.currentTimeMillis();
        long tiempoTranscurrido = tiempoFinal - tiempoInicio;
        return tiempoTranscurrido + " ms";
    }
}
