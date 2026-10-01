package lab2;

public class Descanso {
    private int horasDescanso;
    private int numerosSemana;

    public void Descanso(){
        this.horasDescanso = 0;
        this.numerosSemana = 0;
    }

    public void defineHorasDescanso(int novoValor){
        this.horasDescanso = novoValor;
    }

    void defineNumeroSemanas(int novoValor){
        this.numerosSemana = novoValor;
    }

    String getStatusGeral(){
        if (numerosSemana != 0 && horasDescanso / numerosSemana >= 26){
            return "descansado";
        }
        return "cansado";
    }
}
