def validarAno(ano_fabricacao):
     if (ano_fabricacao) < 1990:
           raise Exception("Barco muito antigo para utilizar sensor")          

def cadastrar_barco():
        print("[-------------------------------]")
        print("[---- Cadastro de Barcos -------]")
        print("[-------------------------------]")

        # Solicita as informações do Barco 
        ano_fabricacao = int(input("Digite um ano de Fabricação: "))
        validarAno(ano_fabricacao)
        modelo = input("Digite o modelo do Barco: ")

         # Salvar as informações em um arquivo de texto
        with open("barcos.txt", "a") as arquivos:
            arquivos.write(f"Ano de Fabricação: {ano_fabricacao}, Modelo: {modelo}\n")

        print("[-------------------------------]")
        print("[----    BARCO CADASTRADO!  ----]")
        print("[-------------------------------]")

def exibir_barcos():
        try:
            with open("barcos.txt", "r") as arquivo:
                barcos = arquivo.readlines()
                if not barcos:
                    print("[-----------------------------]")
                    print("[----   Nenhum Barco!  -------]")
                    print("[-----------------------------]")
                else:
                    print("Barcos cadastrados:")
                    for barco in barcos:
                        print(barco.strip())
        except FileNotFoundError:
            print("[--------------------------------------]")
            print("[----   Nenhum barco encontrado!  -----]")
            print("[--------------------------------------]")
    
def excluir_barco():
        try:
            with open("barcos.txt","r") as arquivos:
                barcos = arquivos.readline()

            if not barcos:
                print("[---------------------------]")
                print("[----   Nenhum Barco!!  ----]")
                print("[---------------------------]")
                return
            
            print("Barcos cadastros: ")
            for i, barco in enumerate(barco):
                 print(f"{i + 1}. {barco.strip()}")

            escolha = int(input("Digite o número do barco que deseja excluir: "))
            if 1 <= escolha <= len(barcos):
                del barcos[escolha - 1]
                with open("barcos.txt", "w") as arquivo:
                    for barco in barcos:
                        arquivo.write(barco)
                print("[-------------------------------]")
                print("[----    BARCO EXCLUÍDO!    ----]")
                print("[-------------------------------]")
            else:
                print("Escolha inválida.")
        except FileNotFoundError:
            print("[--------------------------------------]")
            print("[----   Nenhum barco encontrado!  -----]")
            print("[--------------------------------------]")
        except ValueError:
            print("Entrada inválida. Por favor, insira um número válido.")