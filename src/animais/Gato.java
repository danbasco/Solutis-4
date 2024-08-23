package animais;

public class Gato extends AnimalTerrestreAB{

    public Gato(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtPatas) {
        super(nome, tipoAnimal, idade, habitat, peso, qtPatas);
    }

    @Override
    public void comer(){
        System.out.println("O gato come 200g");
    }
    @Override
    public void dormir(){
        System.out.println("O gato dorme por 14 horas");
    }
    @Override
    public void moverse(){
        System.out.println("O gato corre 500 m");
    }
}
