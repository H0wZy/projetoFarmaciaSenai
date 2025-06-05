package models;

import java.util.ArrayList;

public class Transportadora {
    private String nome;
    private ArrayList<String> locaisAtendimento = new ArrayList<>();

    public Transportadora() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<String> getLocaisAtendimento() {
        return locaisAtendimento;
    }

    public void setLocaisAtendimento(ArrayList<String> locaisAtendimento) {
        this.locaisAtendimento = locaisAtendimento;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nLocais: " + getLocaisAtendimento();
    }
}
