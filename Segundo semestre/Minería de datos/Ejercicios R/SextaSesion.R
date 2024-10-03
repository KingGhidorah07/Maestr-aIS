library(rpart.plot)
library(caret)
library(Momocs)
library(rattle)

library(DMwR)

library(mlbench)
data(BostonHousing)
original <- BostonHousing
set.seed(100)

BostonHousing[sample(1:nrow(BostonHousing), 40), "rad"] <- NA
BostonHousing[sample(1:nrow(BostonHousing), 40), "ptratio"] <- NA
head(BostonHousing)

class_mod <- rpart(rad~.-medv, data=BostonHousing[!is.na(BostonHousing$rad),], method="class", na.action=na.omit)
anova_mod <- rpart(ptratio~.-medv, data=BostonHousing[!is.na(BostonHousing$ptratio),],method="anova", na.action=na.omit)
rad_pred <- predict(class_mod, BostonHousing[is.na(BostonHousing$rad),])
ptradio_pred <- predict(anova_mod, BostonHousing[is.na(BostonHousing$ptratio),])

actuals <- original$ptratio[is.na(BostonHousing$ptratio)]
predictedRPART <- ptradio_pred
regr.eval(actuals, predictedRPART)

class_mod

plot(class_mod)

rpart.plot(class_mod)


head(BostonHousing)
data=BostonHousing[!is.na(BostonHousing$rad),]
data


#Reto 1 - Pendiente terminar
library(rpart)
temp1 <- BostonHousing
temp1[sample(1:nrow(temp1), 45), "rm"] <- NA
anova_mod <- rpart(rm ~ . - medv, data=temp1[!is.na(temp1$rm), ], method="anova", na.action=na.omit)
actuals <- temp1$rm[is.na(temp1$rm)]
rm_pred <- predict(anova_mod, temp1[is.na(temp1$rm), ])
predictedRm <- rm_pred
regr.eval(actuals, rm_pred)



indice <- function(P, n) {
  if (P == 0 && n == 0) {
    return(0)
  }else{
    return (-(P / (P + n)) * log2(P / (P + n)) - (n / (P + n)) * log2(n / (P + n)))
  }
}

indice(9, 5)

entropia <- function(p, n) {
  sumatoria <- 0  # Inicializar la sumatoria antes del bucle
  for (i in seq_along(p)) {  # Usar seq_along para iterar sobre los índices de p
    suma <- (p[i] + n[i]) / 14  # Asegúrate de hacer la suma correctamente
    multiplicacion <- suma * (p[i] * n[i])  # Multiplicación
    sumatoria <- sumatoria + multiplicacion  # Acumular en la sumatoria
  }
  return(sumatoria)  # Devolver el resultado final
}

# Definir los vectores
p <- c(2, 4, 3)
n <- c(3, 0, 2)

# Llamar a la función y mostrar el resultado
resultado <- entropia(p, n)
cat("La entropía calculada es:", resultado, "\n")


library(rpart)
library(rpart.plot)
library(caret)
library(Momocs)
library(rattle)

wine_url <- "https://archive.ics.uci.edu/ml/machine-learning-databases/wine/wine.data"
wine <- read.csv(wine_url, header =FALSE)
colnames(wine) <- c("Clase", "Alcohol", "Ácido_málico", "Cenizas", "Alcalinidad_de_las_cenizas", "Magnesio", "Fenoles_totales", "Flavanoides","Fenoles_no_flavonoides", "Proantocianinas", "Intensidad_del_color", "Tonalidad", "OD280_OD315", "Prolina")
wine$Clase <- as.factor(wine$Clase)

head(wine)
wine_entramiento <- sample_frac(wine, .7)
wine_prueba <- setdiff(wine, wine_entramiento)
modelo_arbol <- rpart(Clase ~ ., data = wine_entramiento, method = "class")

summary(modelo_arbol)

rpart.plot(modelo_arbol, main= "Árbol de Clasificación para el Conjunto de Datos Wine")

predicciones <- predict(modelo_arbol, wine_prueba, type="class")

matriz_confusion <- table(Predicted = predicciones, Actual = wine$Clase)

print(matriz_confusion)

precision <- sum(diag(matriz_confusion)) / sum(matriz_confusion)
print(paste("Precisión del modelo: ", round(precision, 4)))
asRules(modelo_arbol)




Sensibilidad: (TP/TP+FN) *100

TP <- 68 + 63 +76
TN <- 141 + 144 + 132
FP <- 1 + 1 + 1
FN <- 0 +2 + 1

sensibilidad <- function(TP, FN){
  formula <- (TP/TP+FN) * 100
  formula
}
especificidad <- function(TN, FP){
  formula <- (TN/TN+FP) * 100
  formula
}
exactitud <- function(TP, TN, FP){
  formula <- (TP+TN)/(TP+FN+FP+TN)*100
  formula
}
precision <- function(TP, FP){
  formula <- TP/(TP+FP)*100
  formula
}
precisionNegativos <- function(TN, FN){
  formula <- TN/TN+FN *100
  formula
}
precisionGeneral <- function(){
  TP <- c(68, 63, 76)
  MT <- 209
  
  suma <- sum(TP)
  resultado <- (suma / MT) *100
  print(resultado)
}

sensibilidad(TP,FN)
especificidad(TN, FP)
exactitud(TP,TN,FP)
precisionGeneral()



iris <- data(iris)
view(iris)
iris 

iris_entramiento <- sample_frac(iris, .7)
iris_prueba <- setdiff(iris, iris_entramiento)
modelo_arbol <- rpart(Clase ~ ., data = iris_entramiento, method = "class")

summary(modelo_arbol)

rpart.plot(modelo_arbol, main= "Árbol de Clasificación para el Conjunto de Datos Iris")

predicciones <- predict(modelo_arbol, iris_prueba, type="class")

matriz_confusion <- table(Predicted = predicciones, Actual = iris$Species)

print(matriz_confusion)

precision <- sum(diag(matriz_confusion)) / sum(matriz_confusion)
print(paste("Precisión del modelo: ", round(precision, 4)))



