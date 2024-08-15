import random
def principio_del_palomar(num_palomas, num_cajas):
    if num_palomas < num_cajas:
        cajas = [1] * num_palomas + [0] * (num_cajas - num_palomas)
    else:
        cajas = [1] * num_cajas
        for _ in range(num_palomas - num_cajas):
            caja_seleccionada = random.randint(0, num_cajas - 1)
            cajas[caja_seleccionada] += 1

    for i, palomas_en_caja in enumerate(cajas):
        print(f"Caja {i + 1}: {palomas_en_caja} palomas")

    for caja in cajas:
        if caja > 1:
            return True

    return False

num_palomas = int(input("Ingrese el número de palomas: "))
num_cajas = int(input("Ingrese el número de cajas: "))

if principio_del_palomar(num_palomas, num_cajas):
    print("Al menos una caja tiene más de una paloma.")
else:
    print("No hay ninguna caja con más de una paloma.")
