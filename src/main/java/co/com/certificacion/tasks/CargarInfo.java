package co.com.certificacion.tasks;

import co.com.certificacion.interactions.CargarData;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

public class CargarInfo {


    public static CargarData con(List<Map<String, Object>> datos) {
        return Tasks.instrumented(CargarData.class, datos);
    }
}
