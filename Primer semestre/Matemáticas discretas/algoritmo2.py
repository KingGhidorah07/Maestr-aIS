def cortes(num):
    aux = num - 1
    if num > 5 or num < 1:
        print("Solo funciona con números del 1 al 5")
    else:
        if num == 1 or num == 2:
            aux = num
            print(aux)
        elif num == 4:
            print(num * aux - aux-1)
        else:
            print(num * aux - aux)


num = int(input("Ingrese un número: "))
cortes(num)
