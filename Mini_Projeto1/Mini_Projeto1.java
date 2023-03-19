package Mini_Projeto1;
import java.util.Scanner;

public class Mini_Projeto1 {
public static void main(String[] args) {
        Scanner recebedor = new Scanner(System.in);

        Personagem person1 = new Personagem("Sr. Joãozinho", 100, 100, "Guerreiro");
        Personagem person2 = new Personagem("Cobra", 100, 10, "Animal");

        System.out.print("\nPor favor, digite seu nome: ");
        String nomejogador = recebedor.nextLine();

        System.out.print("\nPrimeiro capitulo: Onde tudo começou.");
        System.out.println("\n\nA muito tempo atrás, quando os dragões ainda dominavam o planeta terra, sr. Joãozin, um nobre guerreiro, vivia amargurado em sua vida monotona.");
        System.out.println("Indignado, pediu aos céus que o ajudassem a mudar sua história. Eis então que você, " + nomejogador + ". Foi designado(a) para esse feito.");
        System.out.println("Suas escolhas moldarão o futuro deste cavaleiro, então as faça com sabedoria.");

        System.out.print("\nEm uma bela noite, o céu se mostrava lindamente. Era possivel observar a via lactea e toda sua grandeza a olho nu. \nSr. Joãozin, deitado em uma pedra, começa a refletir sobre sua vida.");
        System.out.print("\n'Eu deveria ir na grande cidade, me disseram que lá podem haver tesouros magnificos!' Pensou ele.");
        System.out.print("\n'Se bem que eu havia prometido me encontrar com 3 magos, para poder descobrir algo sobre meu futuro'");
        System.out.print("\n'É, acho que eu deveria era desistir e ficar onde estou, não tenho mais esperanças.'");

        System.out.println("\n\nO que Sr. Joãozin deve fazer? \n1 - Ir na cidade; \n2- Encontrar-se com os 3 magos; \n3- Desistir de tudo.\n");
        int escolha1 = recebedor.nextInt();

        if (escolha1 == 1) {
            System.out.print("\n'Resolvido, irei na grande cidade!' \n\nDepois de caminhar por 5 horas seguidas, Sr. Joãozinho chega em uma linda área verde, com uma diversidade de plantas e animais.");
            System.out.print("\nEm meio a tanta beleza, ele se depara com uma bela donzela e com vergonha desce seu olhar para o chão, onde avista uma cobra pesçonhenta. \nO que ele deve fazer? ");
            System.out.print("\n1- Atacar a cobra; \n2- Correr; \n3- Esperar a mordida; \n");
            int escolha2 = recebedor.nextInt();

            if (escolha2 == 1) {
                System.out.println("\nSr. Joãozin vs cobra. \n");
                System.out.print("Sr. Joãozin desfere o golpe!");
                person1.atacar(escolha2);
                System.out.print("A cobra tem sua cabeça descepada. Ficando com os seguintes atributos: \n");
                person2.apanhar(escolha2);
                person2.status();
                System.out.print("\n\nSr. Joãozinho matou a cobra. Fim.");
                System.out.print("\nO status atual de Sr. Joãozinho agora é: \n\n");
                person1.status();
            } else if (escolha2 == 2) {
                System.out.print("Sr. Joãozinho resolve correr. Ficando a uma distância segura de 15 passos da cobra.");
                for (int i = 1; i <= 15; i++){
                    person1.correr(escolha2);
                }
                System.out.print("Cada passo dessa corrida lhe custou -1 de energia. Segue abaixo seu novo status atual. \n");
                person1.status();
            } else if (escolha2 == 3) {
                System.out.print("Sr. Joãozinho resolveu desafiar a cobra. Mas logo em seguida é atacado.");
                person1.apanhar(escolha2);
                System.out.print("O status atual de Sr. Joãozinho agora é: ");
                person1.status();
            }

        } else if (escolha1 == 2) {
            System.out.print("'Resolvido! Irei me encontrar com os 3 magos!'");
            System.out.print("\nAo chegar, um dos magos sente algo e se prepara para revelar, mas do nada, uma flecha perdida voa em direção ao coração de Sr. Joãozinho, que morre ali mesmo.");
            System.out.print("\n\nTHE END!\n\n");
        } else if (escolha1 == 3) {
            System.out.print("'Sabe de uma coisa? Vou é desistir de tudo.'\n E assim, esperando pelo dia de sua morte, Sr. Joãozinho envelhece pobre, feio e amargurado.");
            System.out.print("\n\nTHE END!\n\n");
        }

        recebedor.close();
    }
}
