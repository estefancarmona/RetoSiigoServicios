package co.com.certificacion.utils.restconsumo;

import co.com.certificacion.models.Peticiones;
import io.restassured.http.ContentType;

import static co.com.certificacion.utils.EndPointServices.ENDPOINT_DELETE;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.rest;

public class EjecucionDelete {


    private EjecucionDelete() {
    }

    public static void procesarDelete() {
        rest().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .when()
                .delete(ENDPOINT_DELETE.toString() + Peticiones.getId());

        lastResponse().prettyPrint();
        Peticiones.setRsEstadoCodigo(String.valueOf(lastResponse().statusCode()));
    }
}
