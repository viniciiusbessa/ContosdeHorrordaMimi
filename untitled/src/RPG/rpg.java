package RPG;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class rpg {
    static Scanner entrada = new Scanner(System.in);
    static String nomeUsu = pegaNome();
    static int vida = qtdVida();

    static String[] perguntas = {};

    static Random random = new Random();

    public static void main(String[] args) {

        int contador = 0;

        do{
            estiloEscrita("\n↞Contos de Horror da Mimi↠\n");
            estiloEscrita("\nBem vindo, " + nomeUsu +  ".\nEscolha o que deseja fazer:\n" + "\n1. Instruções \n2. Jogar \n3. Créditos \n4. Sair\n");

            int acaoInicio = entrada.nextInt();

            if (acaoInicio == 1) {
                contador = instrucoes();

            } else if (acaoInicio == 2) {
                contador = jogar();

            } else if (acaoInicio == 3){
                contador = creditos();

            } else if (acaoInicio == 4){
                System.out.println("\nSaindo...");
                System.exit(0);

            } else {
                System.out.println("\nAlerta! Opção inválida.");
            }

        } while( contador == 1);

        entrada.close();
    }

    static int instrucoes(){
        estiloEscrita("\nInstruções: \n1 - Fique vivo \n2 - Não olhe para trás, " + nomeUsu + ".\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");

        int voltaMenu = entrada.nextInt();
        return voltaMenu;
    }

    static int jogar(){
        estiloEscrita("\nCapitulo 1");
        estiloEscrita("\n\nFalae paizao, suave?\nSua vida funciona da seguinte forma: bla bla bla");

        estiloEscrita("\n\nEssa é a quantidade de vida que vc tem:" + vida);
        estiloEscrita("\nSou meio otario então vou remover um coração seu. Total: " + removeVida(vida) + "\n");

        estiloEscrita("\nvo tira mais um fodascekk: " + removeVida(vida));

        vida = qtdVida();

        estiloEscrita("\nvo te devolve tava brincanokk " + vida);




        //parte principal do jogo, as perguntas no caso
        //apenas pra vc consultar caso se perca na logica:
        //o código vai ser uma espécie de engine, use funções que alimentam a logica e use a main apenas pra chamar as funções já existentes :)
        estiloEscrita("\n\nbao, vo testar agora o lance das perguntae tals :)");

        String[] perguntasteste = {"que dia que o latino adotou o macaco 'twelves' dele???", "qual o nome do pai do marcelo filho?", "quantos eh o ideal? (a resposta certa é 5,2 :) )"};

        int randomIndex = random.nextInt(perguntasteste.length);
        String randomTeste = perguntasteste[randomIndex];

        //pergunta da silva
        String preguntatio = String.valueOf(randomTeste);
        estiloEscrita("\n" + preguntatio);

        switch(randomIndex){
            case 0:
                perguntas = new String[]{"teste1", "teste1", "teste1"};

                for (int j = 0; j < perguntas.length; j++) {
                    System.out.print("\n" + perguntas[j]);
                }
                break;
            case 1:
                perguntas = new String[]{"teste2", "teste2", "teste2"};

                for (int j = 0; j < perguntas.length; j++) {
                    System.out.print("\n" + perguntas[j]);
                }
                break;
            case 2:
                perguntas = new String[]{"teste3", "teste3", "teste3"};

                for (int j = 0; j < perguntas.length; j++) {
                    System.out.print("\n" + perguntas[j]);
                }
                break;
        }

        //resposta gonçalves

        estiloEscrita("\nqual a resposta?\n");
        int qualresposta = entrada.nextInt();

        int voltaMenu = entrada.nextInt();
        return voltaMenu;
    }

    static int creditos(){
        limparTerminal();
        estiloEscrita("\nCreditos\nEste jogo foi criado por Vinicius Bessa e Alexandre Torres.\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");

        int voltaMenu = entrada.nextInt();
        return voltaMenu;
    }

    static int removeVida(int vidaAtual){
        vidaAtual --;
        vida = vidaAtual;
        return vidaAtual;
    }

    static int qtdVida(){
        return 5;
    }


    static void estiloEscrita(String texto) {
        for (char caractere : texto.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(1);
            }catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    static String pegaNome(){
        return System.getProperty("user.name");
    }

    public static void limparTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
