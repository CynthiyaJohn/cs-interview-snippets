def outer(x):
    def inner():
        return x + 1
    return inner

func = outer(10)
print(func())
