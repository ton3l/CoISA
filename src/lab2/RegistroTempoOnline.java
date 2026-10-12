package lab2;

/**
* Representa o registro de tempo online em que o aluno passou estudando uma determinada disciplina. Por padrão são consideradas disciplinas de 60h e tempo online esperado de 120h (o dobro)
*
* @author Elton Nascimento
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}
