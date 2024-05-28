import datetime

class Barcacao:
    def __init__(self, modelo, tipoDeBarca, ano) -> None:
        self.valida_barcacao(modelo, tipoDeBarca, ano)
        self.modelo = modelo
        self.TipoDeBarca = tipoDeBarca
        self.ano = ano

    def valida_barcacao(self, modelo, tipoDeBarca, ano):
        if(not modelo or not modelo.replace("", "").isalpha()):
            raise Exception("Modelo Invalido")
        if(not tipoDeBarca or not tipoDeBarca.replace("", "").isalpha()):
            raise Exception("Barca Invalida")
        elif(ano < 1975 or ano > datetime.date.today().year):
            raise Exception("Barca muito antiga")
      