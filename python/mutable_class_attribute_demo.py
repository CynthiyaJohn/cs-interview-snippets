#Concept: Class vs instance attributes
class User:
    roles = []

u1 = User()
u2 = User()

u1.roles.append("admin")

print(u1.roles)
print(u2.roles)
