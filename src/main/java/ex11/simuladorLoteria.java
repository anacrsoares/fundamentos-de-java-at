package ex11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class simuladorLoteria {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numSorteado;
        int escolhaUsuario;
        int i = 1;
        int cont = 0;
        int acertos = 0;

        List<Integer> numLoteria = Arrays.asList(0,0,0,0,0,0);
        List<Integer> numUsuario = Arrays.asList(0,0,0,0,0,0);

        while(cont < numLoteria.size()){
            // sorteio do numero
            numSorteado = rand.nextInt(1,61);

            // coloca o numero na lista de numeros sorteados
            if(numLoteria.contains(numSorteado)){
                continue;
            }
            numLoteria.set(cont, numSorteado);
            cont++;
        }

        // gabarito
        // System.out.println(numLoteria);

        System.out.println("-------------------------- LOTERICA TREVO DE QUATRO FOLHAS --------------------------\n");
        System.out.println("Digite 6 números para jogar na loteria (de 1 até 60):");

        while(i<=6){
            System.out.print("[" + i + "]: ");
            escolhaUsuario = sc.nextInt();

            if(escolhaUsuario < 1 || escolhaUsuario > 60){
                System.out.println("Número fora do intervalo. Por favor, digite um número entre 1 e 60.");
                continue;
            }

            if(numUsuario.contains(escolhaUsuario)){
                System.out.println("O número digitado já foi escolhido. Escolha um número diferente.");
                continue;
            }

            numUsuario.set(i-1, escolhaUsuario);
            i++;
        }

        for(Integer s: numLoteria){
            if(numUsuario.contains(s)){
                // System.out.print("Você acertou o número " + s);
                acertos++;
                // System.out.println(" totalizando " + acertos + " acertos!");
            }
        }

        switch (acertos){
            case 1:
                System.out.println("Você só teve "+ acertos + " acerto(s) e não vai ganhar nada.");
                break;
            case 2:
                System.out.println("Você só teve "+ acertos + " acerto(s) e não vai ganhar nada.");
                break;
            case 3:
                System.out.println("Você só teve "+ acertos + " acerto(s) e não vai ganhar nada.");
                break;
            case 4:
                System.out.println("Parabéns!! Você acertou a quadra e vai ter direito a 1% do prêmio principal.");
                System.out.println("Passe na lotérica onde jogou e retire seu prêmio no prazo de 90 dias corridos.");
                break;
            case 5:
                System.out.println("Parabéns!! Você acertou a quina e vai ter direito a 20% do prêmio principal.");
                System.out.println("Passe na lotérica onde jogou e retire seu prêmio no prazo de 90 dias corridos.");
                break;
            case 6:
                System.out.println("Parabéns!!!! Temos a alegria de anunciar que você é o(a) mais novo(a) milionário" +
                        "(a) do BRASIL!");
                System.out.println("Passe na lotérica onde jogou e retire seu prêmio no prazo de 90 dias corridos.");
                break;
            default:
                System.out.println("\n");
                System.out.println("Infelizmente você não acertou nenhum número. Tente novamente, e que a sorte " +
                        "esteja com você.");
                break;
        }
        System.out.println("Os números sorteados foram: " + numLoteria);
    }
}
