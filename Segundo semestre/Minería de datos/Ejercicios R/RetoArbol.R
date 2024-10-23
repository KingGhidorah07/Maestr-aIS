# Cargar el conjunto de datos iris
data(iris)

# Observar las primeras filas del conjunto de datos
head(iris)

# Instalar las librerías necesarias (si no las tienes instaladas)
install.packages("rpart")
install.packages("rpart.plot")

# Cargar las librerías
library(rpart)
library(rpart.plot)

# Construir el árbol de decisión
tree_model <- rpart(Species ~ ., data = iris, method = "class")

# Visualizar el árbol de decisión
rpart.plot(tree_model)
