package pageObjects;

import org.openqa.selenium.By;

public class VidaPage {

    public static By getVidaCoperado() {
        return By.xpath(".//*[text()='Vida Cooperado']//ancestor::button");
    }

    public static By getNovaCotacao() {
        return By.xpath(".//*[contains(text(),'Nova cota')]//ancestor::button");
    }

    public static By getInputCpf() {
        return By.xpath(".//input[@id='cpf']");
    }

    public static By getRecarregarButton() {
        return By.xpath(".//button[@title='Recarregar']");
    }

    public static By getInputNome() {
        return By.xpath(".//input[@id='fullName']");
    }

    public static By getNextButton() {
        return By.xpath(".//button[contains(@id,'next')]");
    }

    public static By getCapitalSelected() {
        return By.xpath(".//input[@id='autocomplete-capitalSelected']");
    }

    public static By getVidaCoperadoEspecial() {
        //return By.xpath(".//*[text()='Vida Cooperado Especial']//ancestor::div[contains(@class,'MuiGrid-item')]//input[contains(@class,'MuiSwitch-input')]");
        return By.xpath(".//*[text()='Vida Cooperado Especial']//ancestor::div[contains(@class,\"MuiGrid-item\")]//span[contains(@class,'MuiButtonBase')]");
    }

    public static By getInputCep() {
        return By.xpath(".//input[@id='address.cep']");
    }

    public static By getInputLogradouro() {
        return By.xpath(".//input[@id='address.street']");
    }

    public static By getInputNumero() {
        return By.xpath(".//input[@id='address.number']");
    }

    public static By getInputComplemento() {
        return By.xpath(".//input[@id='address.complement']");
    }

    public static By getInputEmail() {
        return By.xpath(".//input[@id='email']");
    }

    public static By getInputTelefone() {
        return By.xpath(".//input[@id='phone']");
    }

    public static By getInputNacionalidade() {
        return By.xpath(".//input[@id='autocomplete-nationality']");
    }

    public static By getSelectNao() {
        return By.xpath(".//input[@value='N']//ancestor::span[@class='MuiIconButton-label']");
    }

    public static By getInputParcelamento() {
        return By.xpath(".//select[@id='paymentPlan']");
    }

    public static By getSelectParcelamento() {
        return By.xpath(".//select[@id='paymentPlan']//option[@value='9025']");
    }

    public static By getInputPagamento() {
        return By.xpath(".//select[@id='firstInstallmentMethod']");
    }

    public static By getSelectPagamento() {
        return By.xpath(".//select[@id='firstInstallmentMethod']//option[@value='1000014']");
    }

    public static By getInputPagamentoDemais() {
        return By.xpath(".//select[@id='paymentMethodId']");
    }

    public static By getSelectPagamentoDemais() {
        return By.xpath(".//select[@id='paymentMethodId']//option[@value='29']");
    }

    public static By getInputAgencia() {
        return By.xpath(".//input[@id='ach.agency']");
    }

    public static By getInputAgenciaDigito() {
        return By.xpath(".//input[@id='ach.agencyDigit']");
    }

    public static By getInputConta() {
        return By.xpath(".//input[@id='ach.account']");
    }

    public static By getInputContaDigito() {
        return By.xpath(".//input[@id='ach.accountDigit']");
    }

    public static By getInputDia() {
        return By.xpath(".//select[@id='ach.nextInstallments']");
    }

    public static By getSelectDia() {
        return By.xpath(".//option[@value='20']");
    }

    public static By getPropostaEfetivada() {
        return By.xpath(".//div[contains(@class,'MuiPaper-root MuiGrid-root')]//h2");
    }

    public static By getMensagem() {
        return By.xpath(".//div[contains(@class,'MuiPaper-root MuiGrid-root')]//p");
    }

    public static By getBaixarBoleto() {
        return By.xpath(".//*[text()='BAIXAR BOLETO']//ancestor::button");
    }

    //STRINGS
    public static String CPF() {
        return "047.258.109-08";
    }

    public static String nomeCompleto() {
        return "GLAUBER APARECIDO FERRI TST";
    }

    public static String capitalSelect() {
        return "150.000";
    }

    public static String CEP() {
        return "87013-180";
    }

    public static String logradouro() {
        return "Duque de Caxias";
    }

    public static String numero() {
        return "882";
    }

    public static String complemento() {
        return "sancor seguro";
    }

    public static String email() {
        return "teste@teste.com.br";
    }

    public static String telefone() {
        return "44999999999";
    }

    public static String nacionalidade() {
        return "Brasileira";
    }

    public static String agencia() {
        return "1234";
    }

    public static String digito() {
        return "5";
    }

    public static String propostaEfectivada() {
        return "Proposta efetivada com sucesso";
    }

}
