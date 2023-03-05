package co.com.certificacion.tasks;


import co.com.certificacion.utils.restconsumo.EjecucionGet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class ConsumoGet implements Task {


    private final Map<String, Object> testData;

    public ConsumoGet(Map<String, Object> testData) {
        this.testData = testData;
    }


    public <T extends Actor> void performAs(T actor) {

     EjecucionGet.procesarGet(testData);

    }

    public static ConsumoGet servicio(Map<String, Object> testData) {
        return Tasks.instrumented(ConsumoGet.class, testData);
    }
}
