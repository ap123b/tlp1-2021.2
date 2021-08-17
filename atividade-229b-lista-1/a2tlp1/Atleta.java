
package a2tlp1;

import java.util.Objects;

public class Atleta {
    private String nome;
    private String esporte; 
    private String nivel; 
    private int idade;

    public Atleta(String nome, String esporte, String nivel, int idade) {
        this.nome = nome;
        this.esporte = esporte;
        this.nivel = nivel;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEsporte() {
        return this.esporte;
    }

    public String getNivel() {
        return this.nivel;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nome=" + this.nome + ", esporte=" + this.esporte + ", nivel=" + this.nivel + ", idade=" + this.idade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.esporte);
        hash = 53 * hash + Objects.hashCode(this.nivel);
        hash = 53 * hash + Objects.hashCode(this.idade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Atleta other = (Atleta) obj;
        
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        
        if (!Objects.equals(this.esporte, other.esporte)) {
            return false;
        }
        
        if (!Objects.equals(this.esporte, other.esporte)) {
            return false;
        }
        
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        return true;
    }
}
