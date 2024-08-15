import math
import time


def es_primo_algo1(n):
    start_time = time.time()

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

    end_time = time.time()
    print("Tiempo de ejecución:", end_time - start_time, "segundos")


def es_primo_algo2(n):
    start_time = time.time()

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

    end_time = time.time()
    print("Tiempo de ejecución:", end_time - start_time, "segundos")


def es_primo_algo3(n):
    start_time = time.time()

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

    end_time = time.time()
    print("Tiempo de ejecución:", end_time - start_time, "segundos")


def menu():
    while True:
        print("\nSeleccione el algoritmo para verificar si un número es primo:")
        print("1. Algoritmo 1")
        print("2. Algoritmo 2")
        print("3. Algoritmo 3")
        print("4. Salir")
        opcion = int(input("Ingrese el número de la opción deseada: "))
        if opcion == 4:
            print("¡Hasta luego!")
            break
        numero = int(input("Ingrese un número entero mayor a 1: "))
        if numero < 2:
            print("Número inválido. Ingrese un número entero mayor a 1.")
            continue
        if opcion == 1:
            es_primo_algo1(numero)
        elif opcion == 2:
            es_primo_algo2(numero)
        elif opcion == 3:
            es_primo_algo3(numero)
        else:
            print("Opción no válida")


# Ejemplo de uso
menu()
