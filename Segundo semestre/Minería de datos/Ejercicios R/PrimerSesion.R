


#Reto 1
a <- 15
A <- 5

a: A

n1 <- 10; n2 <- 100; m <- 0.5
M <- data.frame(n1, n2,m)
M
ls()
rm(n1)
ls()

#Reto 2
n1 <- 10; n2 <- 100; m <- 0.5
M <- data.frame(n1, n2,m)
rm(list=ls())




#Reto 4
rep("Hi", 3)


#Reto 5
tablas <- function(num){
  for (i in 1:num){
    cat("Tabla de multiplicar del ",i, "\n")
    #print(i)
    for(j in 1:10){
      
      cat(i, "*", j, "\n")
    }
  }
}
tablas(5)

#Reto 6
x <- seq(1, 20, by = 0.05)
largo = length(x)
media <- 0
for(i in 1:largo){
  media <- media + x[i]
}
promedio = (media / largo)
promedio



#Reto 7



help("length")


misDatos <- read.table("Analysis.csv")


g <- c("f", "m", "m", "m", "f", "m", "f", "m", "f", "f")
g
g <- factor(g)
g
table(g)
a <- 1:10
table(a,g)
barplot(table(g))



10:(15-1)

