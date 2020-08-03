def numbers(number, countTo, countBy):

    if (number <= countTo):
        while (number <= countTo):
            print(number)
            number += countBy
    else:
        while (number >= countTo):
            print(number)
            number -= countBy




number1 = int(input("Enter a number to count from: "))
countTo1 = int(input("Enter a number to count to: "))
countBy1 = int(input("Enter a number to count by: "))
numbers(number1, countTo1, countBy1)



