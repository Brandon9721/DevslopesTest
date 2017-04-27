motorcycles = []
print(motorcycles)
motorcycles.append('honda')
motorcycles.append('suzuki')
motorcycles.append('yamaha')
motorcycles[0] = 'ducati'
print(motorcycles)

motorcycles.append('honda')
print(motorcycles)


motorcycles.insert(1, 'ktm')
print(motorcycles)

del motorcycles[2]
print(motorcycles)

popped_motorcycles = motorcycles.pop()
print(motorcycles)
print(popped_motorcycles)

first_bike = motorcycles.pop(0)
print("The first bike in the list was a " + first_bike.title() + ".")

motorcycles.append('ducati')
print(motorcycles)

motorcycles.remove('yamaha')
print(motorcycles)

motorcycles.append('yamaha')
print(motorcycles)

too_expensive = 'ducati'
motorcycles.remove(too_expensive)
print(motorcycles)
print("\nA " + too_expensive.title() + " is too expensive.")