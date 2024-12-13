/*                                                         
* Autor: Lana Santos
* Linguagem:C
* Data: 12/12/2024
* Descrição:Uma calculadora de IMC
* Funcionalidades:Digite o peso em kg e a altura em cm, ele vai dizer se você está no peso ideal, acima do peso ou abaixo do peso.
* Versão: 1.0
*/

#include <stdio.h>

void IMC(int peso, int altura){//uma função para calcular o IMC
    char analise[4][50]={"Você está ABAIXO DO PESO!", "Você está com o PESO IDEAL!", "Você está com SOBREPESO!", "Você está com OBESIDADE!"};//lista de respostas
    float alturaa = altura/100.0; // transforma a altura de cm para metros
    float IMC = peso / (alturaa*alturaa); //calcula o IMC
    printf("%.1f\n", IMC);//mostra o IMC
    printf("++++++++++++++++++++++++++++++\n");//linha de caracteres
    if (IMC < 18.5){//se o IMC estiver abaixo de 18.5
      printf("%s", analise[0]);//você está abaixo do peso
    }
    else if( IMC < 25.0){//se o IMC estiver abaixo de 25.0
      printf("%s", analise[1]);//você está no peso ideal
    }
    else if (IMC < 30.0){//se o IMC estiver abaixo de 30.0
      printf("%s", analise[2]);//você está com sobrepeso
    }
    else{//se o IMC for maior que 30.0
      printf("%s", analise[3]);//a pessoa está obesa
    }
    printf("\n++++++++++++++++++++++++++++++\n");//linha de caracteres
    }


int main (void) {

  int n=1;//declara que o valor de n é 1
  while (n != 0){//o codigo vai continuar enquanto o usuário não digitar 0
    printf("Informe seu peso em kg:  ");//pede ao usuário que informe seu peso em kg
    int peso;
    scanf("%d", &peso);//pergunta ao usuário qual o peso
    printf("Informe sua altura em cm: ");//pede ao usuário que informe sua altura em cm
    int altura;
    scanf("%d", &altura);//pergunta ao usuário qual a altura
    IMC(peso,altura);//Chama a função para calcular o IMC
    printf("Você quer calcular outro IMC?\n");//pergunta se o usuário quer  calcular outro IMC
    printf("Digite 1 - sim, 0 - não\n");//diz que se ele digitar 1 irá continuar e se digitar 0 irá parar
    printf("-> ");//cursor que mostra onde a resposta deve ser inserida
    scanf("%d", &n);//mostra onde deve ser digitada a resposta

  }    

  return 0;

}                      