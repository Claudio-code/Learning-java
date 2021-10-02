package com.study.java8;

public class TesteEnum {
    public void execute() {
        imprimeDiaSemana(DiasSemana.SEGUNDA);
        var terca = DiasSemana.TERCA;
        imprimeDiaSemana(terca);
    }

    private void imprimeDiaSemana(DiasSemana dia) {
        switch (dia) {
            case SEGUNDA:
                    print("segunda");
                break;
            case TERCA:
                    print("terca");
                break;
            case QUARTA:
                    print("quarta");
                break;
            case QUINTA:
                    print("quinta");
                break;
            case SEXTA:
                    print("sexta");
                break;
            case SABADO:
                    print("sabado");
                break;
            case DOMINGO:
                    print("domingo");
                break;
            default:
                break;
        }        
    }

    private void print(String message) {
        System.out.println(message);
    }
}
