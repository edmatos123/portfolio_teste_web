package hooks;

import configuracao.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void iniciar() {

        DriverFactory.getDriver();
    }

    @After
    public void finalizar() {

        DriverFactory.quitDriver();
    }
}