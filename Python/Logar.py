from Cadastro import cadastro

def logar_um_usuario(email, senha):
    for usuario in cadastro:
        if usuario['email'] == email and usuario['senha'] == senha:
            print('--- Login Realizado ---')
            return True
    print('Email ou Senha Incorretos.')
    return False
    
def main():
    print('Bem-vindo ao sistema de login.')
    email = input('Digite seu Email: ')
    senha = input('Digite sua senha: ')

    if logar_um_usuario(email, senha):
        print('--- Login Realizado ---')
    else:
        print('Falha ao Logar, Tente Novamente')

if __name__ == "__main__":
    main()