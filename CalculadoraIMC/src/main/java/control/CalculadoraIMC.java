package control;
public class CalculadoraIMC {
    public String calcularImc(double peso, double altura, int idade, String sexo) {
        double imc = peso / (altura * altura);
        String resp = "";
        if (idade >= 20 && idade < 65) {
            if (imc < 16) {
                resp  = "Baixo peso muito grave";
            } else if (imc >= 16 && imc < 17) {
                resp  = "Baixo peso grave";
            } else if (imc >= 17 && imc < 18.5) {
                resp  = "Baixo peso";
            } else if (imc >= 18.5 && imc < 25) {
                resp  = "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                resp  = "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                resp  = "Obesidade grau I";
            } else if (imc >= 35 && imc < 40) {
                resp  = "Obesidade grau II";
            } else {
                resp  = "Obesidade grau III (obesidade mórbida)";
            }
        } else if (idade >= 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 22) {
                    resp = "Baixo peso";
                } else if (imc < 27.1) {
                    resp = "Peso normal";
                } else if (imc < 32.1) {
                    resp = "Sobrepeso";
                } else if (imc < 37.1) {
                    resp = "Obesidade grau I";
                } else if (imc < 42) {
                    resp = "Obesidade grau II";
                } else {
                    resp = "Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 22) {
                    resp = "Baixo peso";
                } else if (imc < 27.1) {
                    resp = "Peso normal";
                } else if (imc < 30.1) {
                    resp = "Sobrepeso";
                } else if (imc < 35.1) {
                    resp = "Obesidade grau I";
                } else if (imc < 40) {
                    resp = "Obesidade grau II";
                } else {
                    resp = "Obesidade grau III (obesidade mórbida)";
                }
            }
        } else {
            if (sexo.equalsIgnoreCase("masculino")) {
                switch (idade) {
                    case 2:
                        if (imc < 14.8) {
                            resp = "Baixo peso";
                        } else if (imc < 18.2) {
                            resp = "Peso normal";
                        } else if (imc < 19.2) {
                            resp = "Sobrepeso";
                        }else {
                            resp = "Obesidade";
                        }
                        break;
                    case 4:
                        if (imc < 14) {
                            resp = "Baixo peso";
                        } else if (imc < 17) {
                            resp = "Peso normal";
                        } else if (imc < 17.9) {
                            resp = "Sobrepeso";
                        }else {
                            resp = "Obesidade";
                        }
                        break;
                    case 6:
                        if (imc < 13.8) {
                            resp = "Baixo peso";
                        } else if (imc < 17) {
                            resp = "Peso normal";
                        } else if (imc < 18.4) {
                            resp = "Sobrepeso";
                        }else {
                            resp = "Obesidade";
                        }
                        break;
                    case 8:
                        if (imc < 13.8) {
                            resp = "Baixo peso";
                        } else if (imc < 18) {
                            resp = "Peso normal";
                        } else if (imc < 20) {
                            resp = "Sobrepeso";
                        }else {
                            resp = "Obesidade";
                        }
                        break;
                    case 10:
                        if (imc < 14.2) {
                            resp = "Baixo peso";
                        } else if (imc < 19.2) {
                            resp = "Peso normal";
                        } else if (imc < 22) {
                            resp = "Sobrepeso";
                        }else {
                            resp = "Obesidade";
                        }
                        break;
                }

            }
            if (sexo.equalsIgnoreCase("feminino")) {
                switch (idade){
                    case 2:
                        if (imc < 14.4) {
                            resp = "Baixo peso";
                        } else if (imc < 18) {
                            resp = "Peso normal";
                        } else if (imc < 19.1) {
                            resp = "Sobrepeso";
                        } else {
                            resp = "Obesidade";
                        }
                        break;
                    case 4:
                        if (imc < 13.8) {
                            resp = "Baixo peso";
                        } else if (imc < 16.8) {
                            resp = "Peso normal";
                        } else if (imc < 18) {
                            resp = "Sobrepeso";
                        } else {
                            resp = "Obesidade";
                        }
                        break;
                    case 6:
                        if (imc < 13.4) {
                            resp = "Baixo peso";
                        } else if (imc < 17) {
                            resp = "Peso normal";
                        } else if (imc < 18.8) {
                            resp = "Sobrepeso";
                        } else {
                            resp = "Obesidade";
                        }
                        break;
                    case 8:
                        if (imc < 13.6) {
                            resp = "Baixo peso";
                        } else if (imc < 18.2) {
                            resp = "Peso normal";
                        } else if (imc < 20.6) {
                            resp = "Sobrepeso";
                        } else {
                            resp = "Obesidade";
                        }
                        break;
                    case 10:
                        if (imc < 14) {
                            resp = "Baixo peso";
                        } else if (imc < 20) {
                            resp = "Peso normal";
                        } else if (imc < 23) {
                            resp = "Sobrepeso";
                        } else {
                            resp = "Obesidade";
                        }
                        break;
                }
            }
        }
        return resp;
    }
}
