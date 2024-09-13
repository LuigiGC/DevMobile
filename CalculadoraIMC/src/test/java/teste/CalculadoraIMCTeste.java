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
        assertEquals("Obesidade grau II", calculadora.calcularImc(125.4, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIILS() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(142.8, 1.89, 21, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(142.9, 1.89, 21, "masculino"));
    }

    //IDOSO
    @Test
    public void testeIdosoMasculinoBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(78.56, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(78.59, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(96.80, 1.89, 70, "masculino"));
    }


    @Test
    public void testeIdosoMasculinoSobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(96.81, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(107.20, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauILI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(107.55, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauILS() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(125.0, 1.89, 70, "masculino"));
    }


    @Test
    public void testeIdosoMasculinoObesidadeGrauIILI() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(125.4, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIILS() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(142.4, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(143.0, 1.89, 70, "masculino"));
    }

    @Test
    public void testeIdosoFemininoBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(56.32, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(56.33, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(69.20, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(69.50, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(82.17, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauILI() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(82.19, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauILS() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(92.96, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIILI() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(94.98, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIILS() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(107.51, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(107.54, 1.60, 70, "feminino"));
    }

    //menino
    @Test
    public void testeMenino2BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(9.44, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino2PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(9.6, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino2PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(11.61, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino2SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(11.65, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino2SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(12.25, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino2Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(13.88, 0.80, 2, "masculino"));
    }

    @Test
    public void testeMenino4BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(12.63, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino4PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(12.65, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino4PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(15.34, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino4SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(15.36, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino4SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(16.15, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino4Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(16.17, 0.95, 4, "masculino"));
    }

    @Test
    public void testeMenino6BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(16.64, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(16.75, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(20.5, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.20, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.20, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino6Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(23.0, 1.10, 6, "masculino"));
    }

    @Test
    public void testeMenino8BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(25.06, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino8PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(25.2, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino8PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(32.78, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino8SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(32.89, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino8SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(36.30, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino8Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(36.5, 1.35, 8, "masculino"));
    }

    @Test
    public void testeMenino10BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(31.94, 1.50, 10, "masculino"));
    }

    @Test
    public void testeMenino10PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(31.95, 1.50, 10, "masculino"));
    }

    @Test
    public void testeMenino10PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(43.0, 1.50, 10, "masculino"));
    }

    @Test
    public void testeMenino10SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(43.37, 1.50, 10, "masculino"));
    }

    @Test
    public void testeMenino10SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(49.45, 1.50, 10, "masculino"));
    }

    @Test
    public void testeMenino10Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(49.5, 1.50, 10, "masculino"));
    }
    @Test
    public void testeMenina2BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(9.20, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina2PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(9.25, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina2PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(11.5, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina2SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(11.6, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina2SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(12.21, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina2Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(12.5, 0.80, 2, "feminino"));
    }

    @Test
    public void testeMenina4BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(11.17, 0.90, 4, "feminino"));
    }

    @Test
    public void testeMenina4PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(11.19, 0.90, 4, "feminino"));
    }

    @Test
    public void testeMenina4PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(13.6, 0.90, 4, "feminino"));
    }

    @Test
    public void testeMenina4SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(13.7, 0.90, 4, "feminino"));
    }

    @Test
    public void testeMenina4SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(14.57, 0.90, 4, "feminino"));
    }

    @Test
    public void testeMenina4Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(14.58, 0.90, 4, "feminino"));
    }

    //Menina 6anos
    @Test
    public void testeMenina6BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(16.20, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(16.22, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(20.57, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(20.58, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(22.73, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina6Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(22.75, 1.10, 6, "feminino"));
    }

    @Test
    public void testeMenina8BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(21.20, 1.25, 8, "feminino"));
    }

    @Test
    public void testeMenina8PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(21.25, 1.25, 8, "feminino"));
    }

    @Test
    public void testeMenina8PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(28.43, 1.25, 8, "feminino"));
    }

    @Test
    public void testeMenina8SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(28.44, 1.25, 8, "feminino"));
    }

    @Test
    public void testeMenina8SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(32.18, 1.25, 8, "feminino"));
    }

    @Test
    public void testeMenina8Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(32.19, 1.25, 8, "feminino"));
    }
    @Test
    public void testeMenina10BaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(27.43, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10PesoNormalLI() {
        assertEquals("Peso normal", calculadora.calcularImc(27.44, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10PesoNormalLS() {
        assertEquals("Peso normal", calculadora.calcularImc(39.19, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10SobrepesoLI() {
        assertEquals("Sobrepeso", calculadora.calcularImc(39.20, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10SobrepesoLS() {
        assertEquals("Sobrepeso", calculadora.calcularImc(45.07, 1.40, 10, "feminino"));
    }

    @Test
    public void testeMenina10Obesidade() {
        assertEquals("Obesidade", calculadora.calcularImc(45.09, 1.40, 10, "feminino"));
    }
}
