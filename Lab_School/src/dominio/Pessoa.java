package dominio;



public class Pessoa {
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", identificadorCodigo='" + identificadorCodigo + '\'' +
                '}';
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    private String telefone;
    private String dataDeNascimento;
    private String cpf;
    private int identificadorCodigo;

    public int getIdentificadorCodigo() {
        return identificadorCodigo;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String dataDeNascimento,
                  String cpf, int identificadorCodigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.identificadorCodigo = identificadorCodigo;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public void setIdentificadorCodigo(int identificadorCodigo) {
        this.identificadorCodigo = identificadorCodigo;

    }




}