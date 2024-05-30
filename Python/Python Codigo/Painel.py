import Cliente as Cliente
import Barco as Barco

def menu():
    while True:
        print("\nMenu:")
        print("1. Cadastrar novo usuário")
        print("2. Exibir usuários cadastrados")
        print("3. Login")
        print("4. Sair")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            try:
                Cliente.cadastrar_usuario()
            except Exception as msgErro:
                print(msgErro.args[0])      
        elif opcao == "2":
            Cliente.exibir_usuarios()
        elif opcao == "3":
            if Cliente.logar_usuario():
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
            try:
              Barco.cadastrar_barco()
            except Exception as msgErro:
              print(msgErro.args[0]) 
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
        