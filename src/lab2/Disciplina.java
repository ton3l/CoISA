package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;
    private double[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[]{0, 0, 0, 0};
        this.pesos = new double[notas.length];
        Arrays.fill(this.pesos, 1);
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[numeroDeNotas];
        Arrays.fill(notas, 0);
        this.pesos = new double[numeroDeNotas];
        Arrays.fill(this.pesos, 1);
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas, double[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[numeroDeNotas];
        Arrays.fill(notas, 0);
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        return this.getMedia() >= 7.0;
    }

    private double getMedia() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i] * pesos[i];
        }
        media /= Arrays.stream(pesos).sum();
        return media;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + this.getMedia() + " " + Arrays.toString(notas);
    }
}
