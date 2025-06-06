package models;

public class Beneficios {

    private double valeRefeicao, valeAlimentacao, planoSaude, planoOdonto;

    public Beneficios(double valeRefeicao, double valeAlimentacao, double planoSaude, double planoOdonto) {
        this.valeRefeicao = valeRefeicao;
        this.valeAlimentacao = valeAlimentacao;
        this.planoSaude = planoSaude;
        this.planoOdonto = planoOdonto;
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(double valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public double getPlanoOdonto() {
        return planoOdonto;
    }

    public void setPlanoOdonto(double planoOdonto) {
        this.planoOdonto = planoOdonto;
    }
}