package stepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageMethods.VidaMethods;

public class VidaDefinitions {

    @Cuando("Você faz uma cotação para a Vida Cooperativa")
    public void goToFormMenu() {
        VidaMethods.goToFormMenu();
    }

    @Y("Completar as informacoes restantes sem beneficiarios")
    public void completeForm() throws InterruptedException {
        VidaMethods.completeForm();
    }

    @Entonces("A proposta é gerada corretamente")
    public void checkSendForm() {
        VidaMethods.checkSendForm();
    }
}
