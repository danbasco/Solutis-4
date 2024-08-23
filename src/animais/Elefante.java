package animais;

public class Elefante extends AnimalTerrestreAB{

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtPatas) {
        super(nome, tipoAnimal, idade, habitat, peso, qtPatas);
    }

    @Override
    public void comer(){
        System.out.println("O elefante come 20 kg");
    }
    @Override
    public void dormir(){
        System.out.println("O elefante dorme por 4 horas");
    }
    @Override
    public void moverse(){
        System.out.println("O elefante corre 1 km");
    }
}
