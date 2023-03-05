package co.com.certificacion.tasks;

import co.com.certificacion.utils.restconsumo.EjecucionDelete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConsumoDelete implements Task
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        EjecucionDelete.procesarDelete();
    }

    public static ConsumoDelete servicio() {
        return new ConsumoDelete();
    }
}
