# 5. Создайте программу для игры в "Крестики-нолики".


list1 = [
    ["  1", "   2  ", " 3  "],
    ["a", "|__|", "|__|", "|__|"],
    ["b", "|__|", "|__|", "|__|"],
    ["c", "|__|", "|__|", "|__|"],
]
# def cross_field(lis):
#  for i in range(0,len(lis)):
#   for e in lis[i]:
#         print(f'{e}',end='')
#   print()

# cross_field(list1)

move_x = (input("Введите координаты вашего хода x: ").replace(" ", "").replace(",", "").replace(".", ""))
#move_y = (input("Введите координаты вашего хода: ").replace(" ", "").replace(",", "").replace(".", ""))

list1 = [["  1", "   2  ", " 3  \n"],
    ["a", "|__|", "|__|", "|__|\n"],
    ["b", "|__|", "|__|", "|__|\n"],
    ["c", "|__|", "|__|", "|__|\n"]]



dictionary = \
{
    "1a": "11",
    "2a": "12",
    "3a": "13",
    "1b": "21",
    "2b": "22",
    "3b": "23",
    "1c": "31",
    "2c": "32",
    "3c": "33",
}

a = dictionary[move_x]



def cross_field(lis, x):
    dictionary = \
{
    "1a": "11",
    "2a": "12",
    "3a": "13",
    "1b": "21",
    "2b": "22",
    "3b": "23",
    "1c": "31",
    "2c": "32",
    "3c": "33",
}
    count = 1
    while count< 7:
     x = dictionary[input(' Введите коорданты хода: ')]
     for i in range(0, len(lis)):
        for e in lis[i]:
            print(f"{e}", end= "")
            lis[int(x[0])][int(x[1])] = "| x|"
            count+=1
            
     x = dictionary[input(' Введите коорданты хода: ')]
     for i in range(0, len(lis)):
        for e in lis[i]:
            print(f"{e}", end= "")
            lis[int(x[0])][int(x[1])] = "| y|"
            count+=1  
         
        
    


cross_field(list1, a)
