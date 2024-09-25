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



