# Importa a classe datetime do módulo datetime 
#Essa classe é usada para trabalhar com datas e horas

from datetime import datetime 

# Obtendo a data de nascimento do usuário#
ano_nascimento = int(input("Digite o ano em que você nasceu: ")) # A função input() coleta o valor fornecido pelo usuário como uma string
mes_nascimento = int(input("Digite o mês em que você nasceu: ")) # A função int() converte essa string em um número inteiro.
dia_nascimento = int(input("Digite o dia em que você nasceu: "))

# Criando um objeto datetime para  data de nascimento
data_nascimento = datetime(ano_nascimento, mes_nascimento, dia_nascimento) #Cria um objeto datetime com a data de nascimento do usuário, usando os valores fornecidos para ano, mês e dia.

# Obtendo a data atual 
data_atual = datetime.today() # Obtém a data e hora atuais no sistema, retornando um objeto datetime

# Calculando a diferença em dias
diferenca_em_dias = (data_atual - data_nascimento).days

print("Vocêjá viveu aproximadamente", diferenca_em_dias, "dias.")
