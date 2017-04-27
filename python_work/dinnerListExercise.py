guestsToInvite = ['Steve', 'Matt', 'Tyler', 'Evan']

for x in guestsToInvite:
	print("hey " + x + ", I'm ordering pizza to celebrate the end of exams and you're free to join.\n")

print(guestsToInvite[-1] + " says he can't make it, family stuff to attend to.\n\nSending second set of invites:\n")
guestsToInvite[-1] = 'Marcus'

for x in guestsToInvite:
	print("hey " + x + ", I'm ordering pizza to celebrate the end of exams and you're free to join.\n")

	# found bigger table and can invite more, append to beginning, middle and end of list

print("Buddy has a bigger table I can borrow! Can now invite more people\n")

guestsToInvite.insert(0, 'Travis')
guestsToInvite.insert(int((len(guestsToInvite)/2)), 'Kyrrian')
guestsToInvite.append('Ben')


for x in guestsToInvite:
	print("hey " + x + ", I'm ordering pizza to celebrate the end of exams and you're free to join.\n")


print("Oh no the bigger table wont arrive in time!\n")

cancelledList = []

while len(guestsToInvite) > 2:
	cancelledList.append(guestsToInvite.pop())

print(guestsToInvite)
print(cancelledList)

for x in cancelledList:
	print("\nSorry " + x + ", there is not enough room now and I won't be able to accomodate eating space for you")

print()

for x in guestsToInvite:
	print("\n" + x + ", there is still room for you to join and eat if you can still make it.")

del guestsToInvite[0]
del guestsToInvite[0]

print(guestsToInvite)