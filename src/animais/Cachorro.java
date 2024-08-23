package animais;

public class Cachorro extends AnimalTerrestreAB{


    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtPatas) {
        super(nome, tipoAnimal, idade, habitat, peso, qtPatas);
    }

    @Override
    public void comer(){
        System.out.println("O cachorro come 500g");
    }
    @Override
    public void dormir(){
        System.out.println("O cachorro dorme por 6 horas");
    }
    @Override
    public void moverse(){
        System.out.println("O cachorro corre 2 km");
    }
}
