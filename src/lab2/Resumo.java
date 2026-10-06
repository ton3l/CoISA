package lab2;

public class Resumo {
    String tema;
    String conteudo;

    Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    @Override
    public String toString(){
        return this.tema + ": " + this.conteudo;
    }
}
