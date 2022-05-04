##dont panic

from Classes import Estado
from Classes import Cidade
from Classes import Populacao

#São Paulo
guarulhos = Cidade("Guarulhos",1392121)
campinas = Cidade("Campinas",1213792)

Sao_Paulo = Estado("São paulo","SP",[guarulhos,campinas])

populacao_sp = Populacao(Sao_Paulo)
#Minas Gerais
belo_horizonte = Cidade("Belo Horizonte",2512070)
uberlandia = Cidade("Uberlandia",691305)

Minas_gerais = Estado("Minas Gerais","MG",[belo_horizonte,uberlandia])

populacao_mg = Populacao(Minas_gerais)

#Goiás
goiania = Cidade("Goiania",	1516113)
anapolis = Cidade("Anápolis",386923)

Goias = Estado("Goiás","GO",[goiania,anapolis])

populacao_go = Populacao(Goias)

#Prints
print("População de Guarulhos: ", guarulhos.populacao)
print("População de Campinas: ",campinas.populacao)
print("População do estado de são paulo: ",populacao_sp)

print("="*60)

print("População de Belo Horizonte: ",belo_horizonte.populacao)
print("População de Uberlandia: ",uberlandia.populacao)
print("População do estado de Minas Gerais: ",populacao_mg)

print("="*60)

print("População de Goiania: ",goiania.populacao)
print("População de Anápolis: ",anapolis.populacao)
print("População do estado de Goiás: ",populacao_go)