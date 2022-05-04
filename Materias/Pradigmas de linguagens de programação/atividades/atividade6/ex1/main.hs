distancia :: (Double,Double) -> (Double,Double) -> Double
distancia (x1 , y1) (x2 , y2) = sqrt (x'*x' + y'*y')
    where
      x' = x1 - x2
      y' = y1 - y2

main = do
  print(distancia(30,30) (60,45))