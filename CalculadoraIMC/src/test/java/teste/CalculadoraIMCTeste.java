package teste;

import control.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraIMCTeste {
    CalculadoraIMC calculadora = new CalculadoraIMC();

    // Faixas de IMC para adultos (20 a 65 anos)
    @Test
    public void testeImcAdultoBaixoPesoMuitoGrave() {
        assertEquals("Baixo peso muito grave", calculadora.calcularImc(47, 1.70, 30, "masculino"));
    }
}