import sys

nums_list = [i for i in range(1000000)]
nums_gen = (i for i in range(1000000))

print("List size:", sys.getsizeof(nums_list))
print("Generator size:", sys.getsizeof(nums_gen))
