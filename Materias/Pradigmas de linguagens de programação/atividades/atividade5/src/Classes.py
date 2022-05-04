
## Dont panic
class Estado:
  def __init__(self,name,sigla,cidades):
    self.nome = name
    self.sigla = sigla
    self.cidades = cidades

class Cidade:
  def __init__(self,name,populacao):
    self.nome = name
    self.populacao = populacao

class Populacao:
  def __new__(self,estados):
    self.npopulacao = 0
    
    for x in range(len(estados.cidades)):
      self.npopulacao += estados.cidades[x].populacao

    return self.npopulacao