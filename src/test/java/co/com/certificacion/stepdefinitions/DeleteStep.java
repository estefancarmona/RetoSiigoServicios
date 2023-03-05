package co.com.certificacion.stepdefinitions;
import co.com.certificacion.questions.ValidacionDelete;
import co.com.certificacion.tasks.ConsumoDelete;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteStep {


    @Y("elimino la informacion del usuario")
    public void eliminoLaInformacionDelUsuario() {
        theActorInTheSpotlight().attemptsTo(ConsumoDelete.servicio());
    }


    @Entonces("^se vizualizara exitosamente la eliminacion del usuario con el codigo(.*)$")
    public void seVizualizaraExitosamenteLaEliminacionDelUsuarioConElCodigo(String codigo) {
        theActorInTheSpotlight().should(seeThat(ValidacionDelete.estado(codigo)));

    }

}
