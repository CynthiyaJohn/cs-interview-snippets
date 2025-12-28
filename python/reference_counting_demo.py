#Concept:Reference counting (memory management)
import sys

a = []
print(sys.getrefcount(a))

b = a
print(sys.getrefcount(a))

del b
print(sys.getrefcount(a))

#Reference count changes object lifetime.
