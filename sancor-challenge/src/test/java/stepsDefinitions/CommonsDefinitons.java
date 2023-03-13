package stepsDefinitions;

import io.cucumber.java.es.Dado;
import pageMethods.CommonsMethods;

public class CommonsDefinitons {
    @Dado("Que o usuário entra na tela inicial")
    public void login() {
        CommonsMethods.goToUrl();
        CommonsMethods.login();
    }
}
