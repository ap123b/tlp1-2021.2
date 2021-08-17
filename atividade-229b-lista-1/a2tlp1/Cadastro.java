package a2tlp1;

public class Cadastro {
    private Atleta lista[];
    private int tamanho;
    private int pos;

    public Cadastro(int tamanho) {
        this.tamanho = tamanho;
        this.pos = 0;
        this.lista = new Atleta[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPos() {
        return pos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public boolean add(Atleta emp) {
        if (pos < tamanho) {
            lista[pos] = emp;
            pos++;
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        for (int i = 0; i < pos; i++) {
            System.out.println(lista[i]);
        }
    }

    public boolean remove() {
        if (pos == 0) {
            return false;
        } else {
            pos--;
            return true;
        }
    }
    
    public Atleta cotains(String nome){
        for (int i = 0; i < pos; i++) {
            if(this.lista[i].getNome().equals(nome)){
                return this.lista[i];
            }
        }
        
        return null;
    }

}
