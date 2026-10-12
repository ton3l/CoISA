package lab2;

import java.util.Arrays;

/**
 * Representação do registro de resumos, não pode haver 2 resumos com o mesmo tema.
 *
 * @author Elton Nascimento
 */
public class RegistroResumos {
    Resumo[] resumos;
    int iResumos;

    RegistroResumos(int numeroDeResumos) {
        resumos = new Resumo[numeroDeResumos];
        iResumos = 0;
    }

    public void adiciona(String tema, String conteudo) {
        if (this.temResumo(tema)) {
            return;
        }
        if (this.iResumos == this.resumos.length - 1) {
            return;
        }

        resumos[iResumos] = new Resumo(tema, conteudo);
        iResumos++;
    }

    public String[] pegaResumos() {
        String[] resumosStrings = new String[iResumos];
        for (int i = 0; i < resumosStrings.length; i++) {
            resumosStrings[i] = resumos[i].toString();
        }

        return resumosStrings;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(iResumos).append(" resumo(s) cadastrados(s)\n");
        if (iResumos == 0) {
            return sb.toString();
        }
        sb.append("- ").append(resumos[0].tema);
        for (int i = 1; i < iResumos; i++) {
            sb.append(" | ").append(resumos[i].tema);
        }
        return sb.toString();
    }

    public int conta() {
        return iResumos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < iResumos; i++) {
            if (resumos[i].tema.equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Usa uma stream para pegar os temas dos resumos cujos conteúdos contém a chave de busca, filtro feito com ambos em lower case pois a caixa não deve interferir na pesquisa.
     *
     * @param chaveDeBusca
     * @return um array dos temas cujos contéudos contém a chave de busca.
     */
    public String[] busca(String chaveDeBusca) {
        return Arrays.stream(resumos)
                .filter(resumo -> resumo != null && resumo.conteudo.toLowerCase().contains(chaveDeBusca.toLowerCase()))
                .map(resumo -> resumo.tema)
                .toArray(String[]::new);
    }
}
