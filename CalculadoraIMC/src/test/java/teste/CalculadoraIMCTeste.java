package teste;

import control.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraIMCTeste {
    CalculadoraIMC calculadora = new CalculadoraIMC();

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        assertEquals("Baixo peso muito grave", calculadora.calcularImc(57.15, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLI() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(57.16, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLS() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(60.72, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLI() {
        assertEquals("Baixo peso", calculadora.calcularImc(60.73, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLS() {
        assertEquals("Baixo peso", calculadora.calcularImc(66.08, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(66.09, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(89.30, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(89.31, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(107.15, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(107.18, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILS() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(124.99, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIILI() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(125.4, 1.89 ,21, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIILS() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(142.8, 1.89 ,21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(142.9, 1.89 ,21, "masculino"));
    }
}
