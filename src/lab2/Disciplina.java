package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[] {0, 0, 0 ,0};
    }

    public void cadastraHoras(int horas){
        this.horasDeEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }
    public boolean aprovado(){
        return this.getMedia() >= 7.0;
    }
    private double getMedia(){
        return (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
    }
    public String toString(){
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + this.getMedia() + " " + "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }
}
