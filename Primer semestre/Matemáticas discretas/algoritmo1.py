def multiplicacion_rusa(a, b):
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

# Ejemplo de uso con números negativos
num1 = 67
num2 = 11

resultado_suma = multiplicacion_rusa(num1, num2)
print(f"\nResultado final (suma): ({num1}) * ({num2}) = {resultado_suma}")