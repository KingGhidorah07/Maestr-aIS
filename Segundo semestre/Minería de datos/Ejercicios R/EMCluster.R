# Instalar y cargar el paquete mclust
install.packages("mclust")
library(mclust)

# Cargar el dataset iris
data(iris)

# Usar solo las primeras 4 columnas (características)
X <- iris[, 1:4]

# Aplicar el algoritmo EM usando modelos de mezcla gaussianos (GMM)
modelo <- Mclust(X)

# Resumen del modelo
summary(modelo)

# Visualizar los resultados
plot(modelo)

# Ver las probabilidades de pertenencia de cada punto a los clusters
modelo$z

# Ver la clasificación final de los puntos
modelo$classification
