package co.com.certificacion.utils.restconsumo;

import co.com.certificacion.models.Peticiones;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.json.JSONObject;

import java.util.Map;

import static co.com.certificacion.utils.ConstantesTrasversales.*;
import static co.com.certificacion.utils.EndPointServices.ENDPOINT_ERROR;
import static co.com.certificacion.utils.EndPointServices.ENDPOINT_USUARIO;
import org.apache.logging.log4j.Logger;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.rest;

public class EjecucionGet {


    private static final Logger LOGGER = LogManager.getLogger(EjecucionGet.class.getName());
    private EjecucionGet() {
    }

    public static void procesarGet(Map<String, Object> testData) {
        if (DATA_EXITOSA.equals(testData.get(DATE).toString())) {
            rest().contentType(ContentType.JSON).relaxedHTTPSValidation().when().get(ENDPOINT_USUARIO.toString() + testData.get(USUARIO));
        } else {
            rest().contentType(ContentType.JSON).relaxedHTTPSValidation().when().get(ENDPOINT_ERROR.toString() + testData.get(USUARIO));
        }
        lastResponse().prettyPrint();
        JSONObject jsGet = new JSONObject(lastResponse().asString());
        try {
            if (STATUS_OK == lastResponse().statusCode()) {
                String correo = jsGet.getJSONObject(DATA).getString(CORREO);
                String nombre = jsGet.getJSONObject(DATA).getString(NOMBRE);
                String apellido = jsGet.getJSONObject(DATA).getString(APELLIDO);
                String info = correo + nombre + apellido;
                Peticiones.setInfoEmpleado(info);
            } else {
                if(STATUS_BAD_REQUEST == lastResponse().statusCode()){
                    Peticiones.setRsEstadoCodigo(String.valueOf(lastResponse().statusCode()));
                    String mensaje = jsGet.getString(MENSAJE);
                    Peticiones.setMensaje(mensaje);
                }else {
                    Peticiones.setRsEstadoCodigo(String.valueOf(lastResponse().statusCode()));
                }
            }
        } catch (Exception e) {
            LOGGER.error(EXCEPTION_SERVICO, e);

        }
    }
}
