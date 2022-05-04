juntarlista :: [a] -> [b] -> [(a,b)]
juntarlista _ [] = []
juntarlista [] _ = []
juntarlista (x:xs)(y:ys) = (x,y):juntarlista xs ys

juntar :: [a] -> [b] -> [(a,b)]
juntar a b = (juntarlista (reverse(a)) (reverse(b)))

main = do
  let lista1 = [1,2,3]
  let lista2 = [4,5,6]
  print(juntar lista1 lista2)