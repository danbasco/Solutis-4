package animais;

public abstract class AnimalTerrestreAB extends AnimalAB {

    private int qtPatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtPatas) {
        super(nome, tipoAnimal, idade, habitat, peso);
        setQtPatas(qtPatas);
    }

    public int getQtPatas() {
        return qtPatas;
    }

    public void setQtPatas(int qtPatas) {
        this.qtPatas = qtPatas;
    }

    @Override
    public abstract void comer();
}

