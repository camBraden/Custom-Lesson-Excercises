print("Hello user. We sell A) Lamborghinis, B) McLarens, and C) Ferraris")
carType = input("Which car would you like to buy? ")

urus = 3000000
aventador = 250000
huracan = 25
m720s = 720
m570s = 570
m600lt = 600000
f488 = 488000
portofino = 24
superfast = 3000000.01

carPrice = 0


if(carType == "A" or carType == "a"): #Lambos
    carType = "Lamborghini"
    carModel = input("Which model do you want? A) Urus, B) Aventador, C) Huracan")
    if (carModel == "A" or carModel == "a"):
        carModel = "Urus"
        carPrice = urus
    if (carModel == "B" or carModel == "b"):
        carModel = "Aventador"
        carPrice = aventador
    if (carModel == "C" or carModel == "c"):        
        carModel = "Huracan"
        carPrice = huracan
        

    carColor = input("What color would you like your car to be? ")

if(carType == "B" or carType == "b"): #McLarens
    carType = "McLaren"
    carModel = input("Which model do you want? A) 720S, B) 570S, C) 600LT")
    if (carModel == "A" or carModel == "a"):
        carModel = "720S"
        carPrice = m720s
    if (carModel == "B" or carModel == "b"):
        carModel = "570S"
        carPrice = m570s
    if (carModel == "C" or carModel == "c"):        
        carModel = "600LT"
        carPrice = m600lt
    
    carColor = input("What color would you like your car to be? ")

if(carType == "C" or carType == "c"): #Ferraris
    carType = "Ferrari"
    carModel = input("Which model do you want? A) 488, B) Portofino, C) 812 Superfast")
    if (carModel == "A" or carModel == "a"):
        carModel = "488"
        carPrice = f488
    if (carModel == "B" or carModel == "b"):
        carModel = "Portofino"
        carPrice = portofino
    if (carModel == "C" or carModel == "c"):        
        carModel = "812 Superfast"
        carPrice = superfast

    carColor = input("What color would you like your car to be? ")

class Cars:
    def __init__(car, make, model, color, dollars):
        car.logo = make
        car.type = model
        car.paint = color
        car.price = price

usersCar = Cars(carType, carModel, carColor, carPrice)


print("You chose the " + usersCar.logo + " " + usersCar.type)
print("Your color is " + usersCar.paint)
print("Your price is $" + str(usersCar.price))



