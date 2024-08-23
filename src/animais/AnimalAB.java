package animais;

public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private int peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int peso) {

        setNome(nome);
        setTipoAnimal(tipoAnimal);
        setIdade(idade);
        setHabitat(habitat);
        setPeso(peso);

    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void dormir();

    @Override
    public abstract void moverse();
}
