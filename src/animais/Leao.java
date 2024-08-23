package animais;

public class Leao extends AnimalTerrestreAB{

    public Leao(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtPatas) {
        super(nome, tipoAnimal, idade, habitat, peso, qtPatas);
    }

    @Override
    public void comer(){
        System.out.println("O leão come 5 kg");
    }
    @Override
    public void dormir(){
        System.out.println("O leão dorme por 8 horas");
    }
    @Override
    public void moverse(){
        System.out.println("O leão corre 20 km");
    }
}
