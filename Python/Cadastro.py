cadastro = []

def cadastrar_um_usuario():
    nome = input("Digite seu nome: ")
    email = input("Digite seu Email: ")
    senha = input("Digite sua senha: ")
    cpf = input("Digite seu CPF: ")
    numero = input("Digite seu numero: ")
    data_nascimento = input("Digite sua data de nascimento (DD/MM/AAAA): ")

    usuario = {
        'nome': nome,
        'email': email,
        'senha': senha,
        'cpf': cpf,
        'numero': numero,
        'data_nascimento': data_nascimento
    }

    cadastro.append(usuario)
    print('--------------------------------')
    print('---- Usuario foi Cadastrado ----')
    print('--------------------------------')


def main():
    continuar = True
    while continuar:
        cadastrar_um_usuario()
        continuar = input("Deseja cadastrar outro usuario? (S/N): ").upper() == 'S'

    print('Seu cadastro foi realizado. ')

if __name__  == "__main__":
    main()