package co.com.certificacion.stepdefinitions;


import co.com.certificacion.models.TestData;
import co.com.certificacion.questions.ValidacionGet;
import co.com.certificacion.tasks.CargarInfo;
import co.com.certificacion.tasks.ConsumoGet;
import co.com.certificacion.utils.EndPointServices;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetStep {

    @Dado("^que el (.*) cargo los datos para realizar una consulta$")
    public void queElUsuarioCargoLosDatosParaRealizarUnaConsulta(String nomActor, List<Map<String, Object>> infomacion) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nomActor).wasAbleTo(
                CargarInfo.con(infomacion));

    }

    @Cuando("se realiza la consulta a la api")
    public void seRealizaLaConsultaALaApi() {
        theActorInTheSpotlight().attemptsTo(ConsumoGet.servicio(TestData.getData()));
    }

    @Entonces("se validara la informacion obtenida")
    public void seValidaraLaInformacionObtenida() {
        theActorInTheSpotlight().should(seeThat(ValidacionGet.data(TestData.getData()).exioso()));
    }

}
