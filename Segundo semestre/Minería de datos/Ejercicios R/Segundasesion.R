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
length(x)


#Reto 7
x2 <- (x[19:364])
x2








