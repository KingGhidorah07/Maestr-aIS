x4 <- c(5,3,2,5,2,5,3,4,1)
x4 <- sort(x4)
x4

library(modeest)
mfv(x4)

x5 <- c(45, 50, 54, 70, 43, 46, 55, 60, 60, 65, 34, 34, 40, 47, 75, 68, 22,
        24, 35, 75, 76, 80, 90, 95)
mfv(x5)

x6 <- c(0,1,2,2,2,3,3,3,3,4,4,4,5,5)
hist(x6, col="pink")

#Reto 1 - asimetria derecha
x7 <- c(0,1,1,1,1,2,2,2,2,3,3,3,4,4,5)
hist(x7, col="red")


#Reto 2 - asimetria izquierda
x8 <- c(5,5,5,5,5,4,4,4,4,3,3,3,2,2,0)
hist(x8, col="cyan")



x <- seq(1, 20, by = 0.05)
largo = length(x)
media <- 0
for(i in 1:largo){
  media <- media + x[i]
}
promedio = (media / largo)
promedio

summary(x)

IQR(x1)

View(AirportDataSpeeds)
AirportDataSpeeds$VERIZON

verizon <- AirportDataSpeeds$VERIZON
verizon<- sort(verizon)
verizon


percentil <- function(x, verizon)
{
  l <- length(verizon)
  count <- 0
  for(i in 1:l){
    if (x!=verizon[i])
      count = count+1
    else
      return (count/l*100)
  }
}

percentil(11.8, verizon)


revpercentil <- function(k, verizon)
{
  L <- 0
  longi <- length(verizon)
  L <- (k/100) * longi
  if((L%%1)!= 0){
    r <- round(L)
    suma <- verizon[r]
  }
  else
    suma <- ((verizon[L] + verizon[L+1]) /2)
  return (suma)
}

revpercentil(40, verizon)

sd(verizon)


chocolate <- NobelChocolate$CHOCOLATE
nobel <- NobelChocolate$NOBEL

plot(chocolate, nobel, col="blue")


Dset1 <- c(21,23,24,25,29,33,49)
IQR(Dset1)
summary(Dset1)


hist(Dset1, col = "blue")


help("boxplot")

boxplot(Dset1, col="pink")



library(mlbench)
data(BostonHousing)
View(BostonHousing)
help("BostonHousing")









