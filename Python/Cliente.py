import hashlib

class Cadastrar:
    def cadastrar_usuario():
        print("[-------------------------------]")
        print("[---- Bem-vindo ao sistema -----]")
        print("[-------------------------------]")

        # Solicitar Informações do Usuario.
        nome = input("Digite seu nome: ")
        email = input("Digite seu email: ")
        telefone = input("Digite seu telefone: ")
        senha = input("Digite sua senha: ")


        # Salva as informações em um arquivo de texto
        with open("cadastros.txt", "a") as arquivo:
            arquivo.write(f"Nome: {nome}, Email: {email}, Telefone: {telefone}, senha: {senha}\n")

        print("[-------------------------------]")
        print("[----      CADASTRADO!!    -----]")
        print("[-------------------------------]")

    def logar_usuario():
        email = input("Digite seu email: ")
        senha = input("Digite sua senha: ")


        try:
            with open("cadastros.txt", "r") as arquivo:
                cadastros = arquivo.readlines()
                for cadastro in cadastros:
                    dados = cadastro.strip().split(", ")
                    if dados[1].split(": ")[1] == email and dados[3].split(": ")[1] == senha:
                        print("[-------------------------------]")
                        print("[----  LOGIN BEM SUCEDIDO  -----]")
                        print("[-------------------------------]")
                        return True
                print("[-------------------------------]")
                print("[-- EMAIL OU SENHA INCORRETOS --]")
                print("[-------------------------------]")
                return False
        except FileNotFoundError:
            print("[------------------------------------------]")
            print("[----   Nenhum Cadastro encontrado!!  -----]")
            print("[------------------------------------------]")
            return False

def exibir_usuarios():
    try:
        with open("cadastros.txt", "r") as arquivo:
            cadastros = arquivo.readlines()
            if not cadastros:
                print("[-------------------------------]")
                print("[----   Nenhum Cadastro!!  -----]")
                print("[-------------------------------]")
            else:
                print("--- Usuários cadastrados: ")
                for cadastro in cadastros:
                    print(f"[---- {cadastro.strip()} ----]")
    except FileNotFoundError:
        print("[------------------------------------------]")
        print("[----   Nenhum Cadastro encontrado!!  -----]")
        print("[------------------------------------------]")
