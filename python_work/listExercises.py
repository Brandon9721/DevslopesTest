# names
names = ['Steve', 'Matt', 'Tyler', 'Evan', 'Kyrrian']

print(names[0])
print(names[1])
print(names[2])
print(names[3])
print(names[4])
print()
for x in names:
	message = "Hello " + x + ", my name is Brandon"
	print(message)


print('\n')

movies = ['Thor: Ragnarok', 'The Fate of the Furious', 'Star Wars: The Last Jedi', 'Beauty and the Beast',
	'It', 'Ghost in the Shell', 'Kong: Skull Island', 'Transformers: The Last Knight',
	'Baywatch', 'Logan']

print("Current top 10 feature films of 2017 according to IMDb:\n")

for index, movies in enumerate(movies, start = 1):   
	print("#" + str(index), movies)
	

