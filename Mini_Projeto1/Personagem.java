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
        energia -= 10;
        System.out.print("(Seu ataque lhe custou -10 de energia.)");
    }
    void correr(int correndo) {
        energia -= 1;
    }
    void esconder(int recuperação) {
        energia += 2;
        System.out.print("(Você recuperou 2 de energia a cada segundo parado.)");
    }
    void apanhar(int dano) {
        vida -= 10;
        System.out.print("(-10 de vida por causa da lapada.)");
    }
}
