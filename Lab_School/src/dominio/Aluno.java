package dominio;

import interfaces.Student;

public class Aluno extends Pessoa implements Student {
    public Aluno(String condicaoUM, double nota) {
        this.condicaoUM = condicaoUM;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "condicaoUM='" + condicaoUM + '\'' +
                ", nota=" + nota +
                "} " + super.toString();
    }

    @Override
    public int receberAtendimento(int id) {

        return receberAtendimento(id);
    }

    public String getCondicaoUM() {
        return condicaoUM;
    }


    public void setCondicaoUM(String condicaoUM) {
        this.condicaoUM = condicaoUM;
    }



    public double getNota() {
        return nota;
    }

    @Override
    public void setNota() {

    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    private String condicaoUM;
    private double nota;

    public Aluno() {


    }

}

