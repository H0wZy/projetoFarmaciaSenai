package models;

import java.util.List;

import enums.TipoSetor;

public class Setor {

    private TipoSetor tipoSetor;
    private List<Funcionario> funcionarios;

    public Setor(TipoSetor tipoSetor, List<Funcionario> funcionarios) {
        this.tipoSetor = tipoSetor;
        this.funcionarios = funcionarios;
    }

    public TipoSetor getTipoSetor() {
        return tipoSetor;
    }

    public void setTipoSetor(TipoSetor tipoSetor) {
        this.tipoSetor = tipoSetor;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getQuantidadeFuncionarios() {
        return funcionarios != null ? funcionarios.size() : 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionarios != null) {
            funcionarios.add(funcionario);
        }
    }

    @Override
    public String toString() {
        return "Setor{" +
                "tipoSetor='" + tipoSetor + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                '}';
    }

}