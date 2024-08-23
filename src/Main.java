import animais.*;

public class Main {

    public static void main(String[] args) {

        Leao leao = new Leao("Eduardo", "mamífero", 7, "savana",
                300, 4);

        Gato gato = new Gato("Mia", "mamífero", 3, "casa",
                4, 4);
        Cachorro cachorro = new Cachorro("Toco", "mamífero", 12,
                "casa", 10, 4);

        AnimalTerrestreAB[] terrestres = {leao, gato, cachorro};
        for(AnimalTerrestreAB animal : terrestres) animal.comer();


        Peixe peixe = new Peixe("Josue", "peixe", 2, "oceano",
                1, 40);

        peixe.profundidade();

        Pombo pombo = new Pombo("Zeca", "onívoro", 3, "Paralela",
                1, 2, 1);

        pombo.voar();
    }
}
