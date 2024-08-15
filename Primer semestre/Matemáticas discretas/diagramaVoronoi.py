import numpy as np  # Importa la biblioteca numpy y la abrevia como np
import matplotlib.pyplot as plt  # Importa la biblioteca matplotlib.pyplot y la abrevia como plt
from scipy.spatial import Voronoi, voronoi_plot_2d  # Importa la clase Voronoi y la función voronoi_plot_2d de la biblioteca scipy.spatial

# Genera puntos aleatorios con la función random
np.random.seed(123)  # Fija la semilla para reproducibilidad
points = np.random.rand(10, 2)  # Genera 10 puntos aleatorios en un espacio bidimensional

# Calcula el diagrama de Voronoi
vor = Voronoi(points)  # Calcula el diagrama de Voronoi basado en los puntos generados

# Grafica el diagrama de Voronoi
fig, ax = plt.subplots()  # Crea una nueva figura y ejes
voronoi_plot_2d(vor, ax=ax, show_vertices=False, line_colors='k', line_width=1, line_alpha=0.5)  # Grafica el diagrama de Voronoi sin mostrar los vértices, con líneas negras, ancho de línea 1 y transparencia de 0.5

# Colores aleatorios para las regiones pintadas
region_colors = np.random.rand(len(vor.point_region), 3)  # Genera colores aleatorios para cada región de Voronoi

# Asigna un color aleatorio a cada región de Voronoi
for region_idx in vor.point_region:  # Itera sobre los índices de las regiones de Voronoi asociadas a los puntos de origen
    region = vor.regions[region_idx]  # Obtiene los índices de los vértices que forman la región
    if -1 not in region and len(region) > 0:  # Verifica que la región no sea infinita y tenga al menos un vértice
        polygon = [vor.vertices[i] for i in region]  # Obtiene las coordenadas de los vértices de la región
        plt.fill(*zip(*polygon), color=region_colors[region_idx])  # Rellena la región con el color correspondiente

plt.xlim(0, 1)  # Establece los límites del eje x
plt.ylim(0, 1)  # Establece los límites del eje y

plt.show()  # Muestra el gráfico
'''

El código genera un diagrama de Voronoi a partir de un conjunto de puntos aleatorios en un espacio bidimensional. 
Luego, colorea cada región de Voronoi con un color aleatorio y las muestra junto con los puntos originales en un gráfico.
 Se utilizan las bibliotecas numpy, matplotlib y scipy.spatial para realizar estos cálculos y visualizaciones.
'''