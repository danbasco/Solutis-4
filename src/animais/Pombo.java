package animais;

public class Pombo extends AnimalVoadorAB{

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, int peso, int qtAsas, int tamanhoEnvergadura) {
        super(nome, tipoAnimal, idade, habitat, peso, qtAsas, tamanhoEnvergadura);
    }

    @Override
    public void voar() {
        System.out.printf("O pombo voa por 10 minutos com suas %d asas", this.getQtAsas());
    }


    @Override
    public void comer() {
        System.out.println("O pombo se alimenta de insetos");
    }

    @Override
    public void dormir() {
        System.out.println("O pombo dorme por 4 horas.");
    }

    @Override
    public void moverse() {
        System.out.printf("O pombo voa bastante, ele tem %d asas e sua envergadura é de %d\n", this.getQtAsas(), this.getTamanhoEnvergadura());
    }
}
