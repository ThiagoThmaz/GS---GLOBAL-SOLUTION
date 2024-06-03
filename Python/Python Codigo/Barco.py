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

    print("[------------------------------]")
    print("[----   BARCO CADASTRADO!  ----]")
    print("[------------------------------]")

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
    
