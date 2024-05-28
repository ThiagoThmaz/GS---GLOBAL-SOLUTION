from Cliente import Cadastrar, exibir_usuarios
from Barco import Barco 

def menu():
    while True:
        print("\nMenu:")
        print("1. Cadastrar novo usuário")
        print("2. Exibir usuários cadastrados")
        print("3. Login")
        print("4. Sair")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            Cadastrar.cadastrar_usuario()
        elif opcao == "2":
            exibir_usuarios()
        elif opcao == "3":
            if Cadastrar.logar_usuario():
                menu_login()
            else:
                print("Falha no login. Tente novamnete.")
        elif opcao == "4":
            print("[-------------------------------]")
            print("[----        SAINDO..      -----]")
            print("[-------------------------------]")
            break
        else:
            print("Opção inválida. Tente novamente.")

def menu_login():
    while True:
        print("\nMenu Logado:")
        print("1. Cadastrar barco")
        print("2. Exibir barcos cadastrados")
        print("3. Excluir barco")
        print("4. Sair")
        opcao = input("Escolha uma opção: ")
        
        if opcao == "1":
            Barco.cadastrar_barco()
        elif opcao == "2":
            Barco.exibir_barcos()
        elif opcao == "3":
            Barco.excluir_barco()
        elif opcao == "4":
            print("Saindo da conta. Até mais!")
            break
        else:
            print("Opção inválida. Tente novamente.")

menu()
        