voc_list=["imperative","declarative","no","yes"]

def calcuateSocre(voc):
    score=0
    for word in voc:
        if word!="a":
            score+=1
    return score

def calcuateSocretell(voc):
    return len(voc.replace("a",""))


for voc in voc_list:
    print(calcuateSocre(voc))
    print(calcuateSocretell(voc))