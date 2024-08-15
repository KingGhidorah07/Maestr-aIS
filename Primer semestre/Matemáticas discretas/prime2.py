def es_primo_algo2(n):
    t = 1
    iteraciones = 0
    while True:
        t += 1
        iteraciones += 1
        if t == n:
            break
        if n % t == 0:
            print(n, "no es primo")
            print("Número de iteraciones:", iteraciones)
            return
        if t == n // 2:
            break
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

es_primo_algo2(numero)