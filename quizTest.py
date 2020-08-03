grade = 0

answer1 = input("What do you call a cat in a hat? \nA. A cat in a hat \nB. A cat in a sweater")
if (answer1 == "A" or answer1 == "a"):
    print("CORRECT")
    grade += 1
else:
    print("INCORRECT")
    
answer2 = input("What is 9 + 1? \nA. 10 \nB. 11")
if (answer2 == "A" or answer2 == "a"):
    print("CORRECT")
    grade += 1
else:
    print("INCORRECT")
    
answer3 = input("What is 9 + 2? \nA. 11 \nB. 12")
if (answer3 == "A" or answer3 == "a"):
    print("CORRECT")
    grade += 1
else:
    print("INCORRECT")


print("\nYou got " + str(grade) + " points.")
