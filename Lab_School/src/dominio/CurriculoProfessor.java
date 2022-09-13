package dominio;

public class CurriculoProfessor extends Pessoa{
    @Override
    public String toString() {
        return "ExperienciaProf{" +
                "exprUm='" + exprUm + '\'' +
                ", experDois='" + experDois + '\'' +
                ", experTres='" + experTres + '\'' +
                "} " + super.toString();
    }

    public CurriculoProfessor() {
        this.exprUm = exprUm;
        this.experDois = experDois;
        this.experTres = experTres;
    }

    public String getExprUm() {
        return exprUm;
    }

    public void setExprUm(String exprUm) {
        this.exprUm = exprUm;
    }

    public String getExperDois() {
        return experDois;
    }

    public void setExperDois(String experDois) {
        this.experDois = experDois;
    }

    public String getExperTres() {
        return experTres;
    }

    public void setExperTres(String experTres) {
        this.experTres = experTres;
    }

    String exprUm="frontEnd";
    String experDois="backEnd";
    String experTres="fullStack";
}
