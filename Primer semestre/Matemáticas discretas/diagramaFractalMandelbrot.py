import numpy as np  # Importa la biblioteca numpy y la abrevia como np
import matplotlib.pyplot as plt  # Importa la biblioteca matplotlib.pyplot y la abrevia como plt

def mandelbrot(c, max_iter):
    """
    Función para calcular si un número c pertenece al conjunto de Mandelbrot.
    """
    z = 0  # Inicializa z en 0
    n = 0  # Inicializa el contador de iteraciones en 0
    while abs(z) <= 2 and n < max_iter:  # Realiza el bucle mientras el valor absoluto de z sea menor o igual a 2 y el número de iteraciones sea menor que el máximo permitido
        z = z*z + c  # Aplica la fórmula del conjunto de Mandelbrot: z^2 + c
        n += 1  # Incrementa el contador de iteraciones
    return n  # Retorna el número de iteraciones realizadas

def mandelbrot_set(xmin, xmax, ymin, ymax, width, height, max_iter):
    """
    Función para generar el conjunto de Mandelbrot.
    """
    rango_x = np.linspace(xmin, xmax, width)  # Genera un rango de valores equiespaciados en el intervalo [xmin, xmax] con 'width' puntos
    rango_y = np.linspace(ymin, ymax, height)  # Genera un rango de valores equiespaciados en el intervalo [ymin, ymax] con 'height' puntos
    imagen = np.empty((width, height))  # Crea una matriz vacía para almacenar los valores del conjunto de Mandelbrot
    for x in range(width):  # Itera sobre los índices en el rango de anchura
        for y in range(height):  # Itera sobre los índices en el rango de altura
            c = complex(rango_x[x], rango_y[y])  # Crea un número complejo a partir de las coordenadas x e y
            color = mandelbrot(c, max_iter)  # Calcula el valor de Mandelbrot para el número complejo c
            imagen[x, y] = color  # Almacena el valor de Mandelbrot en la matriz de imagen
    return imagen  # Retorna la matriz que representa el conjunto de Mandelbrot

xmin, xmax = -2.0, 1.0  # Define el límite inferior y superior del eje x en la gráfica
ymin, ymax = -1.5, 1.5  # Define el límite inferior y superior del eje y en la gráfica
width, height = 800, 800  # Define el tamaño de la imagen en píxeles
max_iter = 1000  # Define el número máximo de iteraciones para calcular el conjunto de Mandelbrot

imagen = mandelbrot_set(xmin, xmax, ymin, ymax, width, height, max_iter)  # Genera el conjunto de Mandelbrot

plt.imshow(imagen.T, extent=(xmin, xmax, ymin, ymax), cmap='hot', origin='lower')  # Muestra la imagen del conjunto de Mandelbrot
plt.colorbar(label='Iteraciones')  # Agrega una barra de colores indicando el número de iteraciones
plt.title('Fractal de Mandelbrot')  # Establece el título de la gráfica
plt.xlabel('Parte Real (Re)')  # Etiqueta el eje x
plt.ylabel('Parte Imaginaria (Im)')  # Etiqueta el eje y
plt.show()  # Muestra la gráfica

'''
Este código en Python genera y visualiza el conjunto de Mandelbrot
 utilizando la biblioteca matplotlib. 
 Define funciones para calcular si un número complejo pertenece al conjunto de Mandelbrot 
 y para generar el conjunto en un rango especificado. Luego, muestra el conjunto de Mandelbrot 
 como una imagen con la función imshow() de matplotlib, agregando una barra de colores 
 para indicar el número de iteraciones y etiquetando los ejes x e y.
'''