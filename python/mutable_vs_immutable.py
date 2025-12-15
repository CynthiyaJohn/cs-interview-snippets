"""
Demonstrates mutable vs immutable behavior in Python.
"""

def modify_list(lst):
    lst.append(100)

def modify_number(num):
    num += 10

numbers = [1, 2, 3]
value = 50

modify_list(numbers)
modify_number(value)

print("List after modification:", numbers)
print("Number after modification:", value)
