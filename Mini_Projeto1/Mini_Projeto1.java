package Mini_Projeto1;

import java.util.Scanner;
public class Mini_Projeto1 {
public static void main(String[] args) {

    Scanner recebedor = new Scanner(System.in);

    //Introdução e contexto
    System.out.println("\n\n------------------------------------------------------------------------------------------------------------------A HISTÓRIA DE JOÃOZIN------------------------------------------------------------------------------------------------------------------------------\n\n");
    System.out.print("  A muito tempo atrás, Joãozin se viu em uma situação de agonia em sua vida. Triste e amargurado pela sua rotina monótona, teve um choque de realidade de uma hora para outra. Implorou aos Deuses uma luz que o orientasse, pois deveria mudar sua realidade, ir em busca da felicidade. Ao ouvirem suas preces, eles resolvem ajudar. Designam você para possuir o corpo de Joãozin e se passar por ele por algum tempo. A partir de agora suas decisões mudarão o rumo e a história dele, as faça com sabedoria.\n\n");

    System.out.println("Capítulo 1: Onde tudo começou\n");

    System.out.print("  No estabulo, enquanto ajuda seu pai a cuidar dos cavalos, você reflete sobre quais seriam suas opções atuais. Seu pai agora aposentado, foi um grande cavaleiro real na sua época, antes de cair em desgraça com a bebida e ter agora que servir como empregado invisível do rei. Você então poderia fazer diferente, ir para o centro de treinamento descobrir quais seriam seus verdadeiros dons e focar em honrar a memória de seu pai. \n    Por outro lado, pessoas estavam sendo atacadas aparentemente sem explicação em toda região de Storngonz, uma vila não muito próxima do reino, mas grandes recompensas estavam disponíveis para quem conseguisse desvendar o mistério por trás dessas mortes. Você então poderia se aventurar e trazer consigo a resolução, além de ganhar grande fama e prestigio com isso.\n\n");

    //Primeira escolha (Capítulo 1.1)
    System.out.print("Você pode: \n1- Ir para o centro de treinamento; \n2- Se aventurar em Storngonz. \nO que fará agora? ");
    int escolha1 = recebedor.nextInt();

    if(escolha1 == 1) {
        System.out.print("\n\n    Você resolve seguir para o centro de treinamento. Ao chegar lá, é recebido pelo diretor geral sr. Olivyx, que lhe mostra sua primeira escolha. ''O que você quer ser?'' Pergunta ele enquanto aponta para as três cartas na mesa. Mago, guerreiro e arqueiro. \n  São as imagens que as compõem. Cada classe com seus atributos específicos. Onde dependendo de sua escolha, você pode ter menos ou mais vida, menos ou mais energia e assim por diante, já que essas cartas são mágicas e tem as propriedades necessárias para mudarem tais atributos. Porém não tem como saber exatamente isso de cada um, pois a escolha tem que vir do coração. \n\n");

        System.out.print("Você pode: \n1- Se tornar um mago; \n2- Se tornar um guerreiro; \n3- Você pode se tornar um arqueiro. \nO que fará agora? ");
        int escolha1ponto2 = recebedor.nextInt();

        //Capítulo 1.1.1
        if (escolha1ponto2 == 1) {
            System.out.print("\n\n  '-Ótima escolha!' Disse o diretor, após você declarar que irá se tornar um mago. Lhe encaminhou então para a turma do senhor Legoilles, pois ele era a pessoa adequada para lhe ajudar em sua nova jornada. Você então treinou por um longo tempo. Aprendeu a criar suas próprias magias, a sobreviver na mata densa e a controlar sua respiração, a ponto de conseguir ouvir até mesmo animais a quilômetros de distância. Legoilles então lhe chama para sua sala: \n'-Joãozin, agora você chegou em um momento em que não tenho mais nada a fazer com você, a não ser lhe contar sobre o grande torneio.' \n'-Mas eu já ouvi falar sobre esse torneio. Não sei então para quê passei tanto tempo aqui.' Disse você para ele. \nEle então respondeu: \n'-O que você não sabe é o que realmente acontece lá. Você já se encontrou com alguma turma completa que participou do torneio? Bom, eu acho que não. Não sobrevivem nem 10 dos 100 que entram. Lá você lutará com monstros desconhecidos, caso sobreviva, ganhará um cajado com propriedades mágicas que se aprimorarão junto a você. Boa sorte, sem perguntas.' Você então segue para o torneio, onde é atacado logo nos primeiros 10 min e morre.\n\n");
        }
        //Capítulo 1.1.2
        else if (escolha1ponto2 == 2) {
            System.out.print("\n\n  '-Ótima escolha!' Disse o diretor, após você declarar que irá se tornar um guerreiro. Lhe encaminhou então para a turma do senhor Thronikes, pois ele era a pessoa adequada para lhe ajudar em sua nova jornada. Você então treinou por um longo tempo. Ganhou uma espada e aprendeu a utiliza-la, aprendeu a sobreviver na mata densa e a controlar sua respiração, a ponto de conseguir ouvir até mesmo animais a quilômetros de distância. Thronikes então lhe chama para sua sala: \n'-Joãozin, agora você chegou em um momento em que não tenho mais nada a fazer com você, a não ser lhe contar sobre o grande torneio.' '-Mas eu já ouvi falar sobre esse torneio. Não sei então para quê passei tanto tempo aqui.' Disse você para ele. \n Ele então respondeu: '-O que você não sabe é o que realmente acontece lá. Você já se encontrou com alguma turma completa que participou do torneio? Bom, eu acho que não. Não sobrevivem nem 10 dos 100 que entram. Lá você lutará com monstros desconhecidos, caso sobreviva, ganhará uma espada diferente, com propriedades mágicas que se aprimorarão junto a você. Boa sorte, sem perguntas.” Você então segue para o torneio e passa as primeiras 24 horas vivos. Porém está muito cansado. \nPor sorte não se encontrou ainda com nenhum dos monstros desconhecidos. Resolve parar um pouco e ir se encosta em uma árvore. Acaba cochilando e nisso é rasgado ao meio, numa velocidade tão rápida que você só consegue ter apenas a reação de abrir os olhos. Aqui acaba a jornada de Joãozinho.\n\n");
        }
        //Capítulo 1.1.3
        else if (escolha1ponto2 == 3) {
            System.out.print("\n\n    '-Ótima escolha!' Disse o diretor, após você declarar que irá se tornar um arqueiro. Lhe encaminhou então para a turma do senhor Argonilet, pois ele era a pessoa adequada para lhe ajudar em sua nova jornada. Você então treinou por um longo tempo. Aprendeu a usar o arco, controlar sua respiração e ter um foco excepcional. Porém em um belo dia na mata, você atinge sem querer a perna de uma moça que atravessou na frente de um alce que já estava na sua mira. Ao se aproximar para ajudá-la, ela viu o arco em sua mão e lhe associou ao ato. Sem que você pudesse ao menos retomar sua guarda, ela lhe apunhalou, pois achou que ela quem fosse o alvo. Assim, você morreu sem nem ao menos conseguir triunfar em sua talvez possível carreira. Fim. \n\n");
        }
    } 
    
    //Segunda escolha (Capítulo 1.2)
    else if (escolha1 == 2) {
        System.out.print("\n\n      Você resolver ir para Storngonz. Chegando lá, avista logo de cara uma casa com sinais de arrombamento. Ao se aproximar mais um pouco, encontra um corpo, ou pelo menos o que sobrou dele, completamente dilacerado. Avista outro mais a frente e novamente vai averiguar. Esse outro está de bruços. Prontamente então você se abaixa para vira-lo. Enquanto faz isso, nota que do lado do corpo tem uma goteira de sangue, mas esse sangue está caindo do teto. \nResolve então olhar pra cima. Você nem terminou de virar para cima direito, pois só conseguiu ver a sombra daquilo que te atacou. \nDeveria ter se atentando a um pequeno detalhe... Como iria lutar contra monstros desconhecidos sem ter nenhum treinamento ou arma especifica? Morre aqui Joãozinho, na sua tentativa de mudar de vida. \n\n");
    }
    recebedor.close();
    }
}
