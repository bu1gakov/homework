#Задача 6: Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером. Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех. Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет счастливость билета.

#*Пример:*

#385916 -> yes
#123456 -> no
TicketNumber = input('Номер билета:')
left = int(TicketNumber[0]) + int(TicketNumber[1]) + int(TicketNumber[2])
right = int(TicketNumber[3]) + int(TicketNumber[4]) + int(TicketNumber[5])
if left == right:
    print('Lucky One!')
else:
    print('Unlucky')