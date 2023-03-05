package co.com.certificacion.questions;

import co.com.certificacion.models.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static co.com.certificacion.utils.ConstantesTrasversales.*;

public class ValidacionGet implements Question<Boolean> {
    private final Map<String, Object> testData;
    private Boolean exitoso;
    private Boolean error;

    public ValidacionGet(Map<String, Object> testData) {
        this.testData = testData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (Boolean.TRUE.equals(exitoso)) {
            String responseGet = Peticiones.getInfoEmpleado();
            String infoData = testData.get(CORREO).toString() + testData.get(NOMBRE).toString() + testData.get(APELLIDO).toString();
            return infoData.contains(responseGet);
        } else if (Boolean.TRUE.equals(error)) {
            String responseGet = Peticiones.getMensaje();
            String infoMensaje = testData.get(MENSAJE).toString();
            return responseGet.equals(infoMensaje);
        }else {
            return false;
        }
    }

    public static ValidacionGet data(Map<String, Object> testData) {
        return new ValidacionGet(testData);
    }


    public ValidacionGet exioso(){
        this.exitoso = true;
        this.error = false;
        return this;
    }

    public ValidacionGet error(){
        this.error = true;
        this.exitoso = false;
        return this;
    }
}
