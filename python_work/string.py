firstName = "ada"
lastName = "lovelace"
fullName = firstName + " " + lastName

print(fullName.title())

message = "Hello, " + fullName.title() + "!"

print(message)

print("Python")
print("\tPython")

print("Languages:\nPython\nC\nJava")

print("Languages:\n\tPython\n\tC\n\tJava")

#strips white space
favouriteLanguage = 'python ' 
print(favouriteLanguage)
favouriteLanguage.rstrip()
favouriteLanguage
print(favouriteLanguage.rstrip())

#save stripped white space word into var
test = "testing    hello     "
test = test.rstrip()
print(test + "hi") #only strips white space to the right of string

test2 = "   test2   "
print(test2)
print(test2.lstrip())

print(test2.strip() + "left and right space removed on test variable using .strip()")