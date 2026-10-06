package lab2;
import lab2.Resumo;

public class RegistroResumos {
    Resumo[] resumos;
    int iResumos;

    RegistroResumos(int numeroDeResumos){
        resumos = new Resumo[numeroDeResumos];
        iResumos = 0;
    }

    public void adiciona(String tema, String conteudo){
        if (this.temResumo(tema)){
            return;
        }
        if (this.iResumos == this.resumos.length-1){
            return;
        }

        resumos[iResumos] = new Resumo(tema, conteudo);
        iResumos++;
    }

    public String[] pegaResumos(){
        String[] resumosStrings = new String[iResumos];
        for (int i = 0; i < resumosStrings.length; i++){
            resumosStrings[i] = resumos[i].toString();
        }

        return resumosStrings;
    }

    public String imprimeResumos(){
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(iResumos).append(" resumo(s) cadastrados(s)\n");
        if (iResumos == 0){
            return sb.toString();
        }
        sb.append("- ").append(resumos[0].tema);
        for (int i = 1; i < iResumos; i++){
            sb.append(" | ").append(resumos[i].tema);
        }
        return sb.toString();
    }

    public int conta(){
        return iResumos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < iResumos; i++){
            if(resumos[i].tema.equals(tema)){
                return true;
            }
        }
        return false;
    }
}
