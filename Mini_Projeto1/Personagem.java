package Mini_Projeto1;

public class Personagem {

    //Atributos
    String nome;
    int energia;
    int vida;
    String classe;

    Personagem(String nome, int energia, int vida, String classe) {
        this.nome = nome;
        this.energia = energia;
        this.vida = vida;
        this.classe = classe;
    }
    
    //Métodos
    void status () {
        System.out.format("Personagem: %s; \nEnergia: %d; \nVida: %d; \nClasse: %s.", nome, energia, vida, classe);
    }
    void atacar(int ataque) {
        if (energia >= 10) {
            energia -= 10;
            System.out.print("(Seu ataque lhe custou -10 de energia)");
        } else if (energia < 10) {
            System.out.print("(Você não tem mais energia para atacar!)");
        }
    }
    void correr(int correndo) {
        if (energia >= 1) {
            energia -= 1;
        } else if (energia < 1) {
            System.out.print("(Infelizmente você não tem mais energia para correr)");
        }
    }
    void esconder(int recuperação) {
        if (energia <= 98) {
            energia += 2;
        System.out.print("(Você recuperou 2 de energia a cada segundo parado)");
        } else if (energia == 100) {
            System.out.print("(Sua energia já chegou ao máximo)");
        }  
    }
    void apanhar(int dano) {
        if (vida >= 10) {
            vida -= 10;
            System.out.print("(-10 de vida por causa da lapada)");
        } else if (vida < 10) {
            System.out.print("(Infelizmente você morreu!)");
        }
    }
}
