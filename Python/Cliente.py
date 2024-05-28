class Cliente:
    def __init__(self, nome, cpf, email, senha):
        self.valida_informacoes_cliente(nome, cpf, email, senha)
        self.nome = nome
        self.cpf = cpf
        self.email = email
        self.senha = senha

    def valida_informacoes_cliente(self, nome, cpf, email, senha):
        if(not nome or not nome.replace(" ", "").isalpha()):
            raise Exception("Nome invalido")
        elif(not self.valida_cpf(cpf)):
            raise Exception("CPF invalido") 
        elif(not self.valida_email(email)):
            raise Exception("Email invalido")
        elif(len(senha) < 8):
            raise Exception("Senha invalida")

    def cadastrar_barco(self, barco):
       self.barcacoes.append(barco)

    def excluir_barco(self, index):
        return self.barcacoes.pop(index)  
    
    def listar_barco(self):
        print("-------------------------------------------")
        print("|                                         |")
        print("|             Lista de Barcos             |")
        print("|                                         |")

        i = 1
        for barco in self.automoveis:
            tamenho = len(barco.marca) + 10
            print("|        {} {}".format(i, barco.marca), " " * (39 - tamenho), "|")
            i += 1
        print("-------------------------------------------")

        if(len(self.automoveis) == 0):
            print("\nNenhum barco cadastrado")