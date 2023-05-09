#Задача 26:  Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
#
#*Пример:*
#
#A = 3; B = 5 -> 243 (3⁵)
#    A = 2; B = 3 -> 8

def ApowB(A, B):
    if B == 0:
        return 1
    if B < 0:
        return 1/ApowB(A, -B)
    return A * ApowB(A, B-1)
A = int(input('Число: '))
B = int(input('Степень '))
print(ApowB(A, B))