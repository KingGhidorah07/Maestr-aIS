#Imports
import math
import random

#Funciones
def russianPeasantMultiplication():
    a = int(input("Ingrese un número entero: "))
    b = int(input("Ingrese otro número entero: "))
    suma = 0
    paso = 1

    print(f"Paso\t| Multiplicando |  Divisor")
    print("-" * 40)

    # Ajuste de signo
    signo_a = 1 if a >= 0 else -1
    signo_b = 1 if b >= 0 else -1
    a, b = abs(a), abs(b)

    while b > 0:
        if b > 1:
            print(f"{paso}\t|\t {signo_a * a}\t|\t {signo_b * b}")
        else:
            print(f"Final\t|\t {signo_a * a}\t|\t {signo_b * b}")

        # Si 'b' es impar, suma 'a' a la variable suma
        if b % 2 != 0:
            suma += signo_a * a

        # Duplica 'a' y divide 'b' por 2
        a = a * 2
        b = b // 2
        paso += 1

    return suma
def substraccionUno():
    n = input("Ingrese un número: ")
    m = input("Ingrese otro número: ")

    N = []
    M = []
    R = []

    for i in n:
        N.append(i)
    for i in m:
        M.append(i)

    if len(M) < len(N):
        dc = len(N) - len(M)
        # print(dc)
        p = 0
        while p < dc:
            M.insert(0, 0)
            p = p + 1

    print(N)
    print(M)

    print("METODO A")
    i = len(N) - 1
    while i >= 0:

        if int(N[i]) < int(M[i]):
            N[i] = int(N[i]) + 10
            N[i - 1] = int(N[i - 1]) - 1

        aux = int(N[i]) - int(M[i])
        R.append(aux)
        i = i - 1
    print(R[::-1])
def substraccionDos():
    n = input("Ingrese un número: ")
    m = input("Ingrese otro número: ")

    N = []
    M = []
    R = []

    for i in n:
        N.append(i)
    for i in m:
        M.append(i)

    if len(M) < len(N):
        dc = len(N) - len(M)
        # print(dc)
        p = 0
        while p < dc:
            M.insert(0, 0)
            p = p + 1

    print("METODO B")
    i = len(N) - 1
    while i >= 0:

        if int(N[i]) < int(M[i]):
            N[i] = int(N[i]) + 10
            M[i - 1] = int(M[i - 1]) + 1

        aux = int(N[i]) - int(M[i])
        R.append(aux)
        i = i - 1
    print(R[::-1])
def substraccionTres():
    n = input("Ingrese un número: ")
    m = input("Ingrese otro número: ")

    N = []
    M = []
    R = []

    for i in n:
        N.append(i)
    for i in m:
        M.append(i)
    auxi = 0
    a = " "
    j = 0
    while j < len(N):
        a = a + "9"
        j = j + 1

    res = (int(n) + ((int(a) - int(m)) + 1)) - (int(a) + 1)
    print(res)
def sacandoNueves():
    def casting_out_nines(n):
        k = n
        while k >= 10:
            k = sum(int(digit) for digit in str(k))
        return k

    def is_divisible_by_3_or_9(n):
        k = casting_out_nines(n)
        return k % 3 == 0

    # Ejemplo de uso
    numero = int(input("Ingrese un número positivo: "))
    if is_divisible_by_3_or_9(numero):
        print("-------------- RESULTADO --------------")
        print(f"{numero} es divisible por 3 o 9.")
        print("---------------------------------------")
    else:
        print("-------------- RESULTADO --------------")
        print(f"{numero} no es divisible por 3 o 9.")
        print("---------------------------------------")
def primosUno():
    # Ejemplo de uso
    bandera = False
    n = int(input("Ingrese un número entero mayor a 1: "))
    while bandera != True:
        if n < 2:
            n = int(input("Ingrese un número entero mayor a 1: "))
        else:
            bandera = True
    t = 1
    iteraciones = 0
    while True:
        t += 1
        iteraciones += 1
        if t == n or n % t == 0:
            break
    if t != n:
        print("-------------- RESULTADO --------------")
        print(n, "No es primo")
        print("Número de iteraciones:", iteraciones)
        print("---------------------------------------")
    else:
        print("-------------- RESULTADO --------------")
        print(n, "es primo")
        print("Número de iteraciones:", iteraciones)
        print("---------------------------------------")
def primosDos():
        bandera = False
        n = int(input("Ingrese un número entero mayor a 1: "))
        while bandera != True:
            if n < 2:
                n = int(input("Ingrese un número entero mayor a 1: "))
            else:
                bandera = True
        t = 1
        iteraciones = 0
        while True:
            t += 1
            iteraciones += 1
            if t == n:
                break
            if n % t == 0:
                print("-------------- RESULTADO --------------")
                print(n, "no es primo")
                print("Número de iteraciones:", iteraciones)
                print("---------------------------------------")
                return
            if t == n // 2:
                break
        print("-------------- RESULTADO --------------")
        print(n, "es primo")
        print("Número de iteraciones:", iteraciones)
        print("---------------------------------------")
def primosTres():
    bandera = False
    n = int(input("Ingrese un número entero mayor a 1: "))
    while bandera != True:
        if n < 2:
            n = int(input("Ingrese un número entero mayor a 1: "))
        else:
            bandera = True
    t = 1
    iteraciones = 0
    while True:
        t += 1
        iteraciones += 1
        if t >= math.isqrt(n):
            break
        if n % t == 0:
            print("-------------- RESULTADO --------------")
            print(n, "no es primo")
            print("Número de iteraciones:", iteraciones)
            print("---------------------------------------")
            return
    if n == 1 or (n != 2 and n % 2 == 0):
        print("-------------- RESULTADO --------------")
        print(n, "no es primo")
        print("Número de iteraciones:", iteraciones)
        print("---------------------------------------")
    else:
        print("-------------- RESULTADO --------------")
        print(n, "es primo")
        print("Número de iteraciones:", iteraciones)
        print("---------------------------------------")
def factorizacion():
    n = int(input("Ingrese un número: "))

    t = 2
    q = n

    b = True
    c = 0
    while b == True:
        # t=t+1
        c = c + 1
        if q % t == 0:
            print(str(t) + " ,  x ")
            q = q / t
        else:
            t = t + 1

        if t <= math.sqrt(q):
            b = False

    print("Se realizó: " + str(c) + " veces")
    if n % t == 0:
        print(str(n) + " es un divisor de " + str(t))
    else:
        print(str(n) + " es un numero primo")
def maximoComDiv():
    def euclides_MCD(a, b):
        while b != 0:
            a, b = b, a % b
        return a

    def MCD_tres_numeros(a, b, c):
        # Calculamos el MCD de los primeros dos números
        mcd_ab = euclides_MCD(a, b)
        # Luego, calculamos el MCD del resultado anterior y el tercer número
        mcd_abc = euclides_MCD(mcd_ab, c)
        print(mcd_abc)

    num1 = int(input("Ingrese el primer número: "))
    num2 = int(input("Ingrese el segundo número: "))
    num3 = int(input("Ingrese el tercer número: "))
    MCD_tres_numeros(num1, num2, num3)
def aproximacion():
    a = float(input("Ingrese el número al que le quiere sacar la aproximación de la raiz: "))
    x = float(input("Ingrese un número Xo: "))
    i = 0
    b = False
    n = 0

    while (b == False):
        f = (x + (a / x)) / 2
        n = n + 1
        print("X" + str(n) + "= " + str(f))

        i = f - int(f)

        if (i > 0):
            x = f
        else:
            b = True
    print(f)
def principioPalomar():
    num_palomas = int(input("Ingrese el número de palomas: "))
    num_cajas = int(input("Ingrese el número de cajas: "))
    masDeUna = False
    if num_palomas < num_cajas:
        cajas = [1] * num_palomas + [0] * (num_cajas - num_palomas)
    else:
        cajas = [1] * num_cajas
        for _ in range(num_palomas - num_cajas):
            caja_seleccionada = random.randint(0, num_cajas - 1)
            cajas[caja_seleccionada] += 1
    print("-------------- RESULTADO --------------")
    for i, palomas_en_caja in enumerate(cajas):
        print(f"Caja {i + 1}: {palomas_en_caja} palomas")

    for caja in cajas:
        if caja > 1:
            masDeUna = True

    if masDeUna:
        print("Al menos una caja tiene más de una paloma.")
    else:
        print("No hay ninguna caja con más de una paloma.")
def busquedaLieal(lista, numero_a_buscar):

    for i in range(len(lista)):
        if lista[i] == numero_a_buscar:
            #print(i)
            return i
    return -1

    entrada_usuario = input("Ingrese los números de la lista separados por espacios: ")
    lista = list(map(int, entrada_usuario.split()))

    # Realizar la búsqueda
    resultado = busqueda_lineal(lista, numero_a_buscar)
def busquedaBinariaUno():

    def busqueda_binaria_iterativa(lista, objetivo):
        izquierda, derecha = 0, len(lista) - 1

        while izquierda <= derecha:
            medio = (izquierda + derecha) // 2

            if lista[medio] == objetivo:
                return medio
            elif lista[medio] < objetivo:
                izquierda = medio + 1
            else:
                derecha = medio - 1

        return -1
        # Solicitar al usuario la lista de elementos

    elementos = input("Ingrese los elementos de la lista separados por espacios: ")
    lista = list(map(int, elementos.split()))

    # Ordenar la lista para aplicar la búsqueda binaria
    lista.sort()
    print(f"Lista ordenada: {lista}")

    # Solicitar al usuario el número a buscar
    objetivo = int(input("Ingrese el número a buscar: "))
     # Realizar la búsqueda binaria iterativa
    resultado_iterativa = busqueda_binaria_iterativa(lista, objetivo)
    if resultado_iterativa != -1:
        print(f"(Iterativa) El número {objetivo} se encuentra en el índice {resultado_iterativa}.")
    else:
        print(f"(Iterativa) El número {objetivo} no se encuentra en la lista.")
def busquedaBinariaDos():
    def busqueda_binaria_recursiva(lista, objetivo, izquierda, derecha):
        if izquierda > derecha:
            return -1

        medio = (izquierda + derecha) // 2

        if lista[medio] == objetivo:
            return medio
        elif lista[medio] < objetivo:
            return busqueda_binaria_recursiva(lista, objetivo, medio + 1, derecha)
        else:
            return busqueda_binaria_recursiva(lista, objetivo, izquierda, medio - 1)

        # Solicitar al usuario la lista de elementos

    elementos = input("Ingrese los elementos de la lista separados por espacios: ")
    lista = list(map(int, elementos.split()))

    # Ordenar la lista para aplicar la búsqueda binaria
    lista.sort()
    print(f"Lista ordenada: {lista}")

    # Solicitar al usuario el número a buscar
    objetivo = int(input("Ingrese el número a buscar: "))
    # Realizar la búsqueda binaria recursiva
    resultado_recursiva = busqueda_binaria_recursiva(lista, objetivo, 0, len(lista) - 1)
    if resultado_recursiva != -1:
        print(f"(Recursiva) El número {objetivo} se encuentra en el índice {resultado_recursiva}.")
    else:
        print(f"(Recursiva) El número {objetivo} no se encuentra en la lista.")
def opcion_salir():
    print("Gracias por usar software de calidad.")
    exit()

def mostrar_menu():
    print("\nMenú:")
    print("1. Russian Peasant Multiplication")
    print("2. Algoritmo de substracción 1 (Borrowing)")
    print("3. Algoritmo de substracción 2 (Carriyng)")
    print("4. Algoritmo de substracción 3 (Complementation)")
    print("5. Sacando 9's (3's)")
    print("6. Prueba de números primos 1")
    print("7. Prueba de números primos 2")
    print("8. Prueba de números primos 3")
    print("9. Factorización")
    print("10. Máximo común divisor (Algoritmo de Euclides)")
    print("11. Aproximación de la raíz cuadrada (Algoritmo de Newton)")
    print("12. Principio del Palomar")
    print("13. Búsqueda lineal")
    print("14. Búsqueda binaria 1")
    print("15. Búsqueda binaria 2")
    print("16. Salir")

def algotitmosMenu():
    while True:
        mostrar_menu()
        opcion = input("Seleccione una opción: ")
        if opcion == "1":
            russianPeasantMultiplication()
        elif opcion == "2":
            substraccionUno()
        elif opcion == "3":
            substraccionDos()
        elif opcion == "4":
            substraccionTres()
        elif opcion == "5":
            sacandoNueves()
        elif opcion == "6":
            primosUno()
        elif opcion == "7":
            primosDos()
        elif opcion == "8":
            primosTres()
        elif opcion == "9":
            factorizacion()
        elif opcion == "10":
            maximoComDiv()
        elif opcion == "11":
            aproximacion()
        elif opcion == "12":
            principioPalomar()
        elif opcion == "13":
            # Pedir al usuario que ingrese la lista de números separados por espacios
            entrada_usuario = input("Ingrese los números de la lista separados por espacios: ")
            lista = list(map(int, entrada_usuario.split()))

            # Pedir al usuario el número a buscar
            numero_a_buscar = int(input("Ingrese el número a buscar: "))
            resultado = busquedaLieal(lista, numero_a_buscar)
            # Mostrar el resultado
            if resultado != -1:
                print(f"El número {numero_a_buscar} fue encontrado en la posición {resultado}.")
            else:
                print(f"El número {numero_a_buscar} no se encuentra en la lista.")
        elif opcion == "14":
            busquedaBinariaUno()
        elif opcion == "15":
            busquedaBinariaDos()
        elif opcion == "16":
            opcion_salir()
        else:
            print("Opción inválida. Por favor, seleccione una opción válida.")


algotitmosMenu()
