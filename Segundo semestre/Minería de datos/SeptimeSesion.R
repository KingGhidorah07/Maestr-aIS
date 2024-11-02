plot(ChocoNobel, col = "blue")


#Encontrar R

data <- ChocoNobel
n <- nrow(data)
sum_x <- sum(data$CHOCOLATE)# Σx
sum_y <- sum(data$NOBEL)# Σy
sum_xy <- sum(data$CHOCOLATE * data$NOBEL)# Σ(xy)
sum_x2 <- sum(data$CHOCOLATE^2)# Σ(x^2)
sum_y2 <- sum(data$NOBEL^2)# Σ(y^2)

numerador <- n * sum_xy - sum_x * sum_y
denominador <- sqrt((n * sum_x2 - sum_x^2) * (n * sum_y2 - sum_y^2))

r <- numerador / denominador

print(r)


calcula_t <- function(r, n) {
  t <- r / sqrt((1 - r^2) / (n - 2))
  return(t)
}


calcula_t(r, n)


b0 <- -3.366
b0 <- -3.367
yc1 <- b0+b1*(ChocoNobel$CHOCOLATE[1])
yc1

