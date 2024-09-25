library(mlbench)
data(BostonHousing)
View(BostonHousing)
 
set.seed(100)
BostonHousing[sample(1:nrow(BostonHousing), 40), "rad"] <- NA
BostonHousing[sample(1:nrow(BostonHousing), 40), "ptratio"] <- NA

head(BostonHousing)

temp2 <- BostonHousing

#Reto 1
temp1 <- BostonHousing
temp1[sample(1:nrow(temp1), 50), "crim"] <- NA
View(temp1)


library(mice)
md.pattern(BostonHousing)

#Reto 2
md.pattern(temp1)





lm(medv~ptratio + rad, data=BostonHousing, na.action = na.omit)
BostonHousing$nox = NA
BostonHousinginnox = BostonHousing[ ,-5]
View(BostonHousinginnox)

#Reto 3
temp1$zn = NA
temp1inzn = temp1[ ,-2]
head(temp1inzn)



BostonHousing$ptratio
library(Hmisc)
impute(BostonHousing$ptratio, mean)
impute(BostonHousing$ptratio, median)



library(DMwR)
actuals <- BostonHousing$ptradio[is.na(BostonHousing$ptratio)]
predictedsmean <- rep(mean(BostonHousing$ptratio, na.rm=T), length(actuals))
predictedsmedian <- rep(median(BostonHousing$ptratio, na.rm = T), length(actuals))
regr.eval(actuals, predictedsmean)
regr.eval(actuals, predictedsmedian)


library(mlbench)
data("BostonHousting")
original <- BostonHousing
set.seed(100)
BostonHousing[sample(1:nrow(BostonHousing), 40), "rad"] <- NA
BostonHousing[sample(1:nrow(BostonHousing), 40), "ptratio"] <- NA

install.packages("DMwR")
library(DMwR)
knnOutput <- knnImputation(BostonHousing[,!names(BostonHousing) %in% "medv"])
View(BostonHousing)

