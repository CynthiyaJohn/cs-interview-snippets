class User:
    __slots__ = ('name', 'age')

    def __init__(self, name, age):
        self.name = name
        self.age = age

u = User("Alice", 25)
print(u.name, u.age)
