package co.com.certificacion.models;

public class Peticiones {

    private Peticiones() {
    }

    private static String mensaje;
    private static String infoEmpleado;

    private static String rsEstadoCodigo;


    private static String id;



    public static String getMensaje() {
        return mensaje;
    }
    public static void setMensaje(String mensaje) {
        Peticiones.mensaje = mensaje;
    }

    public static String getRsEstadoCodigo() {
        return rsEstadoCodigo;
    }

    public static void setRsEstadoCodigo(String rsEstadoCodigo) {
        Peticiones.rsEstadoCodigo = rsEstadoCodigo;
    }

    public static String getInfoEmpleado() {
        return infoEmpleado;
    }

    public static void setInfoEmpleado(String infoEmpleado) {
        Peticiones.infoEmpleado = infoEmpleado;
    }


    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Peticiones.id = id;
    }
}
