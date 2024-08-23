package animais;

public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, int peso, int profundidade) {
        super(nome, tipoAnimal, idade, habitat, peso, profundidade);
    }

    @Override
    public void comer() {
        System.out.println("O peixe se alimenta de algas e fitoplanktons.");
    }

    @Override
    public void dormir() {
        System.out.println("O peixe dorme bem pouco.");
    }

    @Override
    public void moverse() {
        System.out.println("O peixe nada bastante, 20 km por dia.");
    }

    @Override
    public void profundidade() {
        System.out.printf("O peixe está nadando a %d metros de profundidade.\n", this.getProfundidade());
    }
}
