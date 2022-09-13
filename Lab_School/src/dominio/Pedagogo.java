package dominio;

import interfaces.Employee;

public class Pedagogo extends Pessoa implements Employee {
    public int contagemAtedimento;

    @Override
    public String toString() {
        return super.toString();
    }




    public Pedagogo(String nome, String telefone, String dataDeNascimento, String cpf, int identificadorCodigo) {
        super(nome, telefone, dataDeNascimento, cpf, identificadorCodigo);
    }

    public Pedagogo() {

    }

    public void atendimentoPedagogicoRealizado(String atendimento) {
        return;
    }

    private  Integer atendimentoPedagogicoRealizado(int atendiomento){

        return atendiomento;


    }

    @Override
    public String funcionarios() {
        return null;
    }

    @Override
    public void atendimentoPedagogicoRealizado() {

    }
}
