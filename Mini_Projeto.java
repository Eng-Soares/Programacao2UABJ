import java.util.Scanner;
public class Mini_Projeto {
public static void main(String[] args) {
        Scanner recebedor = new Scanner(System.in);

        System.out.print("\nPor favor, digite seu nome: ");
        String nome = recebedor.nextLine();

        System.out.print("\nPrimeiro capitulo: Onde tudo começou.");
        System.out.println("\n\nA muito tempo atrás, quando os dragões ainda dominavam o planeta terra, sr. Joãozin, um nobre cavaleiro, vivia amargurado em sua vida monotona.");
        System.out.println("Indignado, pediu aos céus que o ajudassem a mudar sua história. Eis então que você, " + nome + ". Foi designado(a) para esse feito.");
        System.out.println("Suas escolhas moldarão o futuro deste cavaleiro, então as faça com sabedoria.");

        System.out.print("\nEm uma bela noite, o céu se mostrava lindamente. Era possivel observar a via lactea e toda sua grandeza a olho nu. \nSr. Joãozin, deitado em uma pedra, começa a refletir sobre sua vida.");
        System.out.print("\n'Eu deveria ir na grande cidade, me disseram que lá podem haver tesouros magnificos!' Pensou ele.");
        System.out.print("\n'Se bem que eu havia prometido me encontrar com 3 magos, para poder descobrir algo sobre meu futuro'");
        System.out.print("\n'É, acho que eu deveria era desistir e ficar onde estou, não tenho mais esperanças.'");

        System.out.println("\n\nO que Sr. Joãozin deve fazer? \n1 - Ir na cidade; \n2- Encontrar-se com os 3 magos; \n3- Desistir de tudo.\n");
        int escolha1 = recebedor.nextInt();

        if (escolha1 == 1) {
            System.out.print("'Resolvido, irei na grande cidade!' \nDepois de caminhar por 5 horas seguidas, Sr. Joãozinho chega em uma linda área verde, com uma diversidade de plantas e animais.");
            System.out.print("\nEm meio a tanta beleza, ele se depara com uma bela donzela, mas é picado por uma cobra e morre ali mesmo.");
            System.out.print("\n\nTHE END!\n\n");

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
