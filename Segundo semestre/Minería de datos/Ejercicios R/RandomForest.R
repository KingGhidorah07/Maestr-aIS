# Paso 1: Instalar y cargar el paquete necesario
# Si aún no tienes instalado el paquete randomForest, debes instalarlo. Una vez instalado, lo cargamos.
install.packages("randomForest")
library(randomForest)

# Paso 2: Cargar el dataset iris
# El dataset 'iris' es un conjunto de datos integrado en R que contiene información sobre tres especies de flores
# (Setosa, Versicolor y Virginica) y sus características: largo y ancho del sépalo, largo y ancho del pétalo.
data(iris)

# Paso 3: Dividir los datos en conjunto de entrenamiento y prueba
# Queremos separar los datos para entrenar el modelo en una parte (70%) y probarlo en otra (30%).
set.seed(123)  # Establecemos una semilla para que los resultados sean reproducibles cada vez que corremos el código.
train_indices <- sample(1:nrow(iris), 0.7 * nrow(iris))  # Tomamos aleatoriamente el 70% de los datos para entrenamiento.
train_data <- iris[train_indices, ]  # Los datos de entrenamiento serán los seleccionados con 'train_indices'.
test_data <- iris[-train_indices, ]  # Los datos de prueba serán el 30% restante (no seleccionados).

# Paso 4: Entrenar el modelo Random Forest
# 'randomForest()' es la función principal del paquete randomForest. 
# Estamos creando un modelo que predice la variable 'Species' (especies de flores) usando las otras columnas (características) como predictores.
# 'ntree = 100' indica que queremos generar 100 árboles en el bosque.
# 'importance = TRUE' nos permitirá calcular la importancia de cada variable para el modelo.
modelo_rf <- randomForest(Species ~ ., data = train_data, ntree = 100, importance = TRUE)

# Paso 5: Ver el resumen del modelo
# Aquí imprimimos un resumen del modelo entrenado, que nos muestra información como el número de árboles,
# el error de clasificación y detalles del modelo.
print(modelo_rf)

# Paso 6: Evaluar el modelo en el conjunto de prueba
# Utilizamos la función 'predict()' para hacer predicciones en el conjunto de prueba (datos que el modelo no ha visto).
predicciones <- predict(modelo_rf, newdata = test_data)

# Paso 7: Matriz de confusión
# Una matriz de confusión nos muestra las predicciones correctas e incorrectas comparando lo predicho por el modelo (filas)
# contra los valores reales (columnas). Esto nos permite evaluar el rendimiento del modelo.
table(predicciones, test_data$Species)

# Paso 8: Importancia de las variables
# 'importance()' muestra qué tan importantes fueron las variables predictoras para el modelo.
# Esto es útil para identificar qué características son las más relevantes para hacer predicciones.
importance(modelo_rf)

# 'varImpPlot()' genera un gráfico que muestra visualmente la importancia de cada variable predictora.
varImpPlot(modelo_rf)

# Paso 9: Visualización de un solo árbol del bosque (opcional)
# Aunque el bosque tiene 100 árboles, podemos visualizar uno específico. En este caso, visualizamos el primer árbol (k=1).
# 'getTree()' nos permite extraer y visualizar la estructura del árbol en formato tabular. 'labelVar=TRUE' muestra los nombres de las variables.
getTree(modelo_rf, k = 1, labelVar = TRUE)

# Paso 10: Medir la precisión del modelo
# Calculamos la precisión dividiendo el número de predicciones correctas por el número total de datos de prueba.
accuracy <- sum(predicciones == test_data$Species) / nrow(test_data)
# Mostramos la precisión como un porcentaje.
print(paste("Precisión del modelo:", round(accuracy * 100, 2), "%"))
