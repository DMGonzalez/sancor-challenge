package pageMethods;

import org.openqa.selenium.Keys;
import pageObjects.VidaPage;

public class VidaMethods {

    public static void goToFormMenu() {
        CommonsMethods.elementWaitDisplayed(VidaPage.getVidaCoperado(), 15);
        CommonsMethods.elementClick(VidaPage.getVidaCoperado());
        CommonsMethods.elementWaitDisplayed(VidaPage.getNovaCotacao(), 15);
        CommonsMethods.elementClick(VidaPage.getNovaCotacao());
        CommonsMethods.waitToPageLoad();
    }

    public static void completeForm() throws InterruptedException {
        CommonsMethods.elementWaitDisplayed(VidaPage.getInputCpf(), 15);
        CommonsMethods.elementSendText(VidaPage.getInputCpf(), VidaPage.CPF());

        CommonsMethods.elementClick(VidaPage.getRecarregarButton());
        CommonsMethods.checkElementContainsValue(VidaPage.getInputNome(), VidaPage.nomeCompleto());
        CommonsMethods.elementClick(VidaPage.getNextButton());

        CommonsMethods.waitToPageLoad();
        CommonsMethods.elementWaitDisplayed(VidaPage.getCapitalSelected(), 15);
        CommonsMethods.elementClick(VidaPage.getCapitalSelected());
        CommonsMethods.elementSendText(VidaPage.getCapitalSelected(), VidaPage.capitalSelect());
        CommonsMethods.pressKey(Keys.ARROW_DOWN);
        CommonsMethods.pressKey(Keys.ENTER);

        CommonsMethods.elementWaitDisplayed(VidaPage.getVidaCoperadoEspecial(), 20);
        CommonsMethods.elementClick(VidaPage.getVidaCoperadoEspecial());

        CommonsMethods.scrollToElement(VidaPage.getNextButton());
        CommonsMethods.elementClick(VidaPage.getNextButton());

        CommonsMethods.waitToPageLoad();
        CommonsMethods.scrollToElement(VidaPage.getInputCep());
        CommonsMethods.elementWaitDisplayed(VidaPage.getInputCep(), 10);
        CommonsMethods.elementSendText(VidaPage.getInputCep(), VidaPage.CEP());
        CommonsMethods.elementClick(VidaPage.getRecarregarButton());
        CommonsMethods.checkElementContainsValue(VidaPage.getInputLogradouro(), VidaPage.logradouro());

        CommonsMethods.elementWaitDisplayed(VidaPage.getInputNumero(), 10);
        CommonsMethods.elementSendText(VidaPage.getInputNumero(), VidaPage.numero());
        CommonsMethods.elementSendText(VidaPage.getInputComplemento(), VidaPage.complemento());
        CommonsMethods.elementSendText(VidaPage.getInputEmail(), VidaPage.email());
        CommonsMethods.elementSendText(VidaPage.getInputTelefone(), CommonsMethods.generateRandomPhone());
        CommonsMethods.elementClick(VidaPage.getInputNacionalidade());
        CommonsMethods.elementSendText(VidaPage.getInputNacionalidade(), VidaPage.nacionalidade());
        CommonsMethods.pressKey(Keys.ARROW_DOWN);
        CommonsMethods.pressKey(Keys.ENTER);

        CommonsMethods.elementClick(VidaPage.getSelectNao());

        CommonsMethods.elementClick(VidaPage.getNextButton());

        Thread.sleep(1000);
        CommonsMethods.elementClick(VidaPage.getNextButton());

        CommonsMethods.waitToPageLoad();
        CommonsMethods.elementWaitDisplayed(VidaPage.getInputParcelamento(), 10);
        CommonsMethods.elementClick(VidaPage.getInputParcelamento());
        CommonsMethods.elementClick(VidaPage.getSelectParcelamento());

        CommonsMethods.elementClick(VidaPage.getInputPagamento());
        CommonsMethods.elementClick(VidaPage.getSelectPagamento());

        CommonsMethods.elementClick(VidaPage.getInputPagamentoDemais());
        CommonsMethods.elementClick(VidaPage.getSelectPagamentoDemais());

        CommonsMethods.elementSendText(VidaPage.getInputAgencia(), VidaPage.agencia());
        CommonsMethods.elementSendText(VidaPage.getInputAgenciaDigito(), VidaPage.digito());
        CommonsMethods.elementSendText(VidaPage.getInputConta(), VidaPage.agencia());
        CommonsMethods.elementSendText(VidaPage.getInputContaDigito(), VidaPage.digito());

        CommonsMethods.elementClick(VidaPage.getInputDia());
        CommonsMethods.elementClick(VidaPage.getSelectDia());
        CommonsMethods.elementClick(VidaPage.getNextButton());

        CommonsMethods.waitToPageLoad();
    }

    public static void checkSendForm() {
        CommonsMethods.elementWaitDisplayed(VidaPage.getPropostaEfetivada(), 15);
        CommonsMethods.checkElementContainsText(VidaPage.getPropostaEfetivada(), VidaPage.propostaEfectivada());
        CommonsMethods.viewTextElementDisplayed(VidaPage.getMensagem());
    }
}
