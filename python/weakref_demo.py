import weakref

class Data:
    pass

obj = Data()
weak = weakref.ref(obj)

print(weak())
del obj
print(weak())
