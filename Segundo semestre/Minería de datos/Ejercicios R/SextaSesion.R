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
  for (i in length(p)) {
    suma <- p[i] + n[i] /  14
    multiplicacion <- suma * (p[i] * n[i])
    #cat(multiplicacion)
    sumatoria <- 0
    sumatoria <- sumatoria + multiplicacion
    cat(sumatoria)
  }
}

p <- c(2, 4, 3)
n <- c(3, 0, 2)
entropia(p, n)





