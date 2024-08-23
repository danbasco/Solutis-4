package animais;

public abstract class AnimalVoadorAB extends AnimalAB{


    private int qtAsas;
    private int tamanhoEnvergadura;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtAsas, int tamanhoEnvergadura) {
        super(nome, tipoAnimal, idade, habitat, peso);

        this.qtAsas = qtAsas;
        this.tamanhoEnvergadura = tamanhoEnvergadura;

    }

    public abstract void voar();

    public int getTamanhoEnvergadura() {
        return tamanhoEnvergadura;
    }

    public void setTamanhoEnvergadura(int tamanhoEnvergadura) {
        this.tamanhoEnvergadura = tamanhoEnvergadura;
    }

    public int getQtAsas() {
        return qtAsas;
    }

    public void setQtAsas(int qtAsas) {
        this.qtAsas = qtAsas;
    }
}
