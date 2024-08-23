package animais;

public abstract class AnimalMarinhoAB extends AnimalAB{

    private int profundidade;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int peso, int profundidade) {
        super(nome, tipoAnimal, idade, habitat, peso);
        this.profundidade = profundidade;
    }

    public abstract void profundidade();

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
}
