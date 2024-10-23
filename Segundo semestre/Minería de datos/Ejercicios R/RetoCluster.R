# Cargar el conjunto de datos USArrests
data(USArrests)
# Visualizar las primeras filas del conjunto de datos
head(USArrests)
# Verificar la estructura del conjunto de datos
str(USArrests)
# Escalar las variables para el clustering
datos <- scale(USArrests)
# Instalar y cargar el paquete factoextra si no está instalado
if (!require(factoextra)) install.packages("factoextra")
library(factoextra)
# Calcular el método del codo para determinar el número óptimo de clusters
fviz_nbclust(datos, kmeans, method = "wss")
# Establecer el número de clusters
set.seed(123) # Fijar la semilla para reproducibilidad
k <- 4 # Número de clusters determinado previamente Aplicar el algoritmo K‐means
modelo_kmeans <- kmeans(datos, centers = k, nstart = 25)
# Ver los resultados del clustering
print(modelo_kmeans)
# Visualizar los clusters en un gráfico
fviz_cluster(modelo_kmeans, data = datos,
             ellipse.type = "convex",
             palette = "jco",
             ggtheme = theme_minimal())