def euclides_MCD(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def MCD_tres_numeros(a, b, c):
    # Calculamos el MCD de los primeros dos números
    mcd_ab = euclides_MCD(a, b)
    # Luego, calculamos el MCD del resultado anterior y el tercer número
    mcd_abc = euclides_MCD(mcd_ab, c)
    return mcd_abc

# Solicitamos al usuario ingresar los tres números
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
num3 = int(input("Ingrese el tercer número: "))

# Calculamos el MCD de los tres números
mcd = MCD_tres_numeros(num1, num2, num3)

# Mostramos el resultado
print("El máximo común divisor (MCD) de", num1, ",", num2, "y", num3, "es:", mcd)
