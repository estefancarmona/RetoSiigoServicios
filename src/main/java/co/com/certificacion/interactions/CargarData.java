package co.com.certificacion.interactions;

import co.com.certificacion.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CargarData implements Interaction {

    private final List<Map<String, Object>> dataTest;

    public CargarData(List<Map<String, Object>> dataTest) {
        this.dataTest = dataTest;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!dataTest.isEmpty()) {
            Set<Map.Entry<String, Object>> setMapaAux = dataTest.get(0).entrySet();
            Map<String, Object> mapAux = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (TestData.getData() == null) {
                TestData.setMap(mapAux);
            } else {
                TestData.getData().putAll(mapAux);
            }
        }

    }
}
