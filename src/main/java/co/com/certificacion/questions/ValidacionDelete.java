package co.com.certificacion.questions;

import co.com.certificacion.models.Peticiones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionDelete implements Question<Boolean> {

    private final String codigo;

    public ValidacionDelete(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String responsePost = Peticiones.getRsEstadoCodigo();
        return codigo.contains(responsePost);
    }

    public static ValidacionDelete estado(String codigo) {
        return new ValidacionDelete(codigo);
    }
}
