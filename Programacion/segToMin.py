a = int(input('Inserte un valor en segundos: '))
minutos = int(a / 60)
residuo = int(a % 60)
print(f"{a} segundos = {minutos},{residuo} minutos")