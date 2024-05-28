from Cliente import Cliente
from Barcacao import Barcacao

def login():
    print("-------------------------------------------")
    print("|                                         |")
    print("|            PAINEL PRINCIPAL             |")
    print("|                                         |")
    print("|        1 - Cadastrar Cliente            |")
    print("|        2 - Entrar                       |")
    print("|        3 - Sair                         |")
    print("-------------------------------------------\n")

def informacoes_menu(cliente):
    tamanho = len(str(cliente))
    print("-------------------------------------------")
    print("|{}".format(cliente.__str__()), " " * (39 - tamanho), "|")
    print("|                                         |")
    print("|        Gerenciar sua Embarcação         |")
    print("|                                         |")
    print("|        1 - Cadastrar Barco              |")
    print("|        2 - Listar Barcos                |")
    print("|        3 - Excluir Barco                |")
    print("-------------------------------------------\n")

def cadastrar_cliente():
    nome = input("Digite o nome do cliente: ")
    cpf = input("Digite o CPF do cliente: ")
    email = input("Digite o e-mail do cliente: ")
    senha = input("Digite a senha do cliente: ")
    cliente = Cliente(nome, cpf, email, senha)
    print("Cliente cadastrado com sucesso!")
    return cliente


def cadastrar_barco(cliente):
    modelo = input("Digite o modelo do barco: ")
    tipo = input("Digite o tipo do barco: ")
    ano = int(input("Digite o ano do barco: "))
    barco = Barcacao(modelo, tipo, ano)
    cliente.cadastrar_barco(barco)
    print("Barco cadastrado com sucesso!")

opcao = 0
cliente_logado = None

while opcao != 3:
    login()
    opcao = int(input("Digite sua opção: "))

    if opcao == 1:
        cliente_logado = cadastrar_cliente()
    elif opcao == 2:
        if cliente_logado:
            informacoes_menu(cliente_logado)
            sub_opcao = int(input("Digite sua opção: "))
            if sub_opcao == 1:
                cadastrar_barco(cliente_logado)
            elif sub_opcao == 2:
                cliente_logado.listar_barcos()
            elif sub_opcao == 3:
                index = int(input("Digite o índice do barco a ser excluído: "))
                cliente_logado.excluir_barco(index - 1)
                print("Barco excluído com sucesso!")
            else:
                print("Opção inválida.")
        else:
            print("Faça login primeiro.")
    elif opcao == 3:
        print("Saindo...")
    else:
        print("Opção inválida.")
