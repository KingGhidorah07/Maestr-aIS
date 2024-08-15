def es_primo_algo1(n):
    t = 1
    iteraciones = 0
    while True:
        t += 1
        iteraciones += 1
        if t == n or n % t == 0:
            break
    if t != n:
        print(n, "No es primo")
        print("Número de iteraciones:", iteraciones)
    else:
        print(n, "es primo")
        print("Número de iteraciones:", iteraciones)

# Ejemplo de uso
bandera =  False
while bandera != True:
   numero = int(input("Ingrese un número entero mayor a 1: "))
   if numero < 2:
       numero = int(input("Ingrese un número entero mayor a 1: "))
   else:
        bandera = True

es_primo_algo1(numero)
