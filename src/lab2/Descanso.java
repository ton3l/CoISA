package lab2;

/**
* Representação da quantidade de descanso de um aluno. Para estar descansado um aluno deve ter no mínimo 26 horas de descanso por semana
*
* @author Elton Nascimento
 */

public class Descanso {
    private int horasDescanso;
    private int numerosSemana;

    public Descanso() {
        this.horasDescanso = 0;
        this.numerosSemana = 0;
    }

    public void defineHorasDescanso(int novoValor) {
        this.horasDescanso = novoValor;
    }

    void defineNumeroSemanas(int novoValor) {
        this.numerosSemana = novoValor;
    }

    String getStatusGeral() {
        if (numerosSemana != 0 && horasDescanso / numerosSemana >= 26) {
            return "descansado";
        }
        return "cansado";
    }
}
