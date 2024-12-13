/* 
* Autor: Lana Santos
* Linguagem:Java
* Data: 12/12/2024
* Descrição:Uma calculadora de IMC
* Funcionalidades:Digite o peso em kg e a altura em cm, ele vai dizer se você está no peso ideal, acima do peso ou abaixo do peso.
* Versão: 1.0
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void IMC(int peso, int altura){//uma função para calcular o IMC
    String[] analise={"Você está ABAIXO DO PESO!", "Você está com o PESO IDEAL!", "Você está com SOBREPESO!", "Você está com OBESIDADE!"};//lista de respostas
    double alturaa = altura/100.0; // transforma a altura de cm para metros
    double IMC = peso / (alturaa*alturaa); //calcula o IMC
    System.out.printf("%.1f\n", IMC);//mostra o IMC
    System.out.printf("++++++++++++++++++++++++++++++\n");//linha de caracteres
    if (IMC < 18.5){//se o IMC estiver abaixo de 18.5
        System.out.printf(analise[0]);//você está abaixo do peso
    }
    else if( IMC < 25.0){//se o IMC estiver abaixo de 25.0
        System.out.printf(analise[1]);//você está no peso ideal
    }
    else if (IMC < 30.0){//se o IMC estiver abaixo de 30.0
        System.out.printf(analise[2]);//você está com sobrepeso
    }
    else{//se o IMC for maior que 30.0
        System.out.printf(analise[3]);//a pessoa está obesa
    }
    System.out.printf("\n++++++++++++++++++++++++++++++\n");//linha de caracteres
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n=1;//declara que o valor de n é 1
        while (n != 0){//o codigo vai continuar enquanto o usuário não digitar 0
            System.out.printf("Informe seu peso em kg:  ");//pede ao usuário que informe seu peso em kg
            int peso = input.nextInt();//pergunta ao usuário qual o peso
            System.out.printf("Informe sua altura em cm: ");//pede ao usuário que informe sua altura em cm
            int altura = input.nextInt();//pergunta ao usuário qual a altura
            IMC(peso,altura);//Chama a função para calcular o IMC
            System.out.printf("Você quer calcular outro IMC?\n");//pergunta se o usuário quer  calcular outro IMC
            System.out.printf("Digite 1 - sim, 0 - não\n");//diz que se ele digitar 1 irá continuar e se digitar 0 irá parar
            System.out.printf("-> ");//cursor que mostra onde a resposta deve ser inserida
            n = input.nextInt();//mostra onde deve ser digitada a resposta
        
        }    
        input.close();
    }
}
