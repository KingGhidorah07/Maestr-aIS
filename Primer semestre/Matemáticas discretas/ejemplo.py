import random

def principio_del_palomar(num_palomas, num_cajas):
    # Creamos un conjunto de cajas inicialmente con una paloma en cada una
    cajas = set(range(num_palomas))

    # Si hay más cajas que palomas
    if num_palomas < num_cajas:
        cajas = set(range(num_palomas))
        cajas.update(range(num_palomas, num_cajas))

    # Distribuimos las palomas restantes aleatoriamente entre las cajas
    while len(cajas) > num_cajas:
        cajas.remove(random.choice(list(cajas)))

    # Imprimimos el total de palomas en cada caja
    for i in range(num_cajas):
        palomas_en_caja = 1 if i in cajas else 0
        print(f"Caja {i + 1}: {palomas_en_caja} palomas")

    # Verificamos si al menos una caja contiene más de una paloma
    return any(palomas_en_caja > 1 for palomas_en_caja in cajas)

# Solicitamos al usuario el número de palomas y cajas
num_palomas = int(input("Ingrese el número de palomas: "))
num_cajas = int(input("Ingrese el número de cajas: "))

# Verificamos si se cumple el principio del palomar
if principio_del_palomar(num_palomas, num_cajas):
    print("Al menos una caja tiene más de una paloma.")
else:
    print("No hay ninguna caja con más de una paloma.")
