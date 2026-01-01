try:
    raise ValueError("Original error")
finally:
    raise RuntimeError("Cleanup error")
