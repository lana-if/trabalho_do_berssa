'''
* Autor: Lana Santos
* Linguagem:Python
* Data: 12/12/2024
* Descrição:Uma calculadora de IMC
* Funcionalidades:Digite o peso em kg e a altura em cm, ele vai dizer se você está no peso ideal, acima do peso ou abaixo do peso.
* Versão: 1.0
'''

def IMC(peso,altura):#uma função para calcular o IMC
    analise=["Você está ABAIXO DO PESO!", "Você está com o PESO IDEAL!", "Você está com SOBREPESO!", "Você está com OBESIDADE!"]#lista de respostas
    altura = altura/100 # transforma a altura de cm para metros
    IMC = peso / (altura*altura) #calcula o IMC
    print(f"{IMC:.1f}")#mostra o IMC
    print("++++++++++++++++++++++++++++++")#linha de caracteres
    if IMC < 18.5:#se o IMC estiver abaixo de 18.5
        print(analise[0])#você está abaixo do peso
    elif IMC < 25.0:#se o IMC estiver abaixo de 25.0
        print(analise[1])#você está no peso ideal
    elif IMC < 30.0:#se o IMC estiver abaixo de 30.0
        print(analise[2])#você está com sobrepeso
    else:#se o IMC for maior que 30.0
        print(analise[3])#a pessoa está obesa
    print("++++++++++++++++++++++++++++++")#linha de caracteres
n=1#declara que o valor de n é 1
while n != 0:#o codigo vai continuar enquanto o usuário não digitar 0
    peso = int(input("Informe seu peso em kg:  "))#pergunta ao usuário qual o peso
    altura = int(input("Informe sua altura em cm: "))#pergunta ao usuário qual a altura
    IMC(peso,altura)#Chama a função para calcular o IMC
    print("Você quer calcular outro IMC?")#pergunta se o usuário quer  calcular outro IMC
    print("Digite 1 - sim, 0 - não")#diz que se ele digitar 1 irá continuar e se digitar 0 irá parar
    n = int(input("-> "))#mostra onde deve ser digitada a resposta