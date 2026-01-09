from contextlib import contextmanager

@contextmanager
def managed_resource():
    print("Acquire")
    yield
    print("Release")

with managed_resource():
    print("Using resource")
