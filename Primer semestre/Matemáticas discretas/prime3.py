import math

def es_primo_algo3(n):
    t = 1
    iteraciones = 0
    while True:
        t += 1
        iteraciones += 1
        if t >= math.isqrt(n):
            break
        if n % t == 0:
            print(n, "no es primo")
            print("Número de iteraciones:", iteraciones)
            return
    if n == 1 or (n != 2 and n % 2 == 0):
        print(n, "no es primo")
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

es_primo_algo3(numero)
