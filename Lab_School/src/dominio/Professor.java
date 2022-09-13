package dominio;

import interfaces.Teacher;

public class Professor extends Pessoa implements Teacher {
    @Override
    public String toString() {
        return "Professor{" +
                "formacaoAcademica='" + formacaoAcademica + '\'' +
                ", experienciaDesenvolvimento='" + experienciaDesenvolvimento + '\'' +
                ", estado='" + estado + '\'' +
                "} " + super.toString();
    }

    public String getFormacaoAcademica() {



        return formacaoAcademica;
    }


    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getExperienciaDesenvolvimento() {
        return experienciaDesenvolvimento;
    }

    public void setExperienciaDesenvolvimento(String experienciaDesenvolvimento) {
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Professor(String nome, String telefone, String dataDeNascimento, String cpf, int identificadorCodigo) {
        super(nome, telefone, dataDeNascimento, cpf, identificadorCodigo);
    }
    private String experienciaDesenvolvimento;
    private String estado;
    private String formacaoAcademica;

    public Professor() {

    }


}
