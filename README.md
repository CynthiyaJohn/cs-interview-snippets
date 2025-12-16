# CS Interview Snippets 🧩

A curated collection of **small, focused Java and Python code snippets**
designed specifically for **Computer Science and Software Engineering interview preparation**.

Instead of large projects, this repository emphasizes **clarity, correctness,
and conceptual understanding** through minimal yet meaningful implementations.

---

## 📌 Why this Repository?

During technical interviews, candidates are often evaluated on:
- Core Computer Science fundamentals
- Ability to explain **program behavior**, not just syntax
- Awareness of common pitfalls, patterns, and concurrency issues

This repository serves as a **personal reference** to revisit
frequently asked interview concepts using **working, explainable examples**.

---

## 🧠 What This Repo Focuses On

Each snippet in this repository:
- Demonstrates **one interview-relevant concept**
- Uses **clean and minimal code**
- Avoids unnecessary frameworks or boilerplate
- Can be easily explained verbally during interviews

---

## 🗂️ Repository Structure

cs-interview-snippets/
│
├── java/
│ ├── SingletonExample.java
│ └── DeadlockVsStarvation.java
│
├── python/
│ ├── mutable_vs_immutable.py
│ └── shallow_vs_deep_copy.py
│
└── README.md

---

## ☕ Java Snippets

### Singleton Pattern

**File:** `java/SingletonExample.java`

This snippet demonstrates:
- Lazy initialization
- Controlled object creation
- Ensuring only one instance of a class exists

📌 *Interview angle:*  
Why would you restrict object creation, and what problems does Singleton solve?

---

### Deadlock vs Starvation

**File:** `java/DeadlockVsStarvation.java`

This snippet demonstrates:
- How deadlocks occur due to circular lock dependency
- Why threads can block indefinitely in concurrent programs

📌 *Interview angle:*  
What is a deadlock, and how is it different from starvation?

---

## 🐍 Python Snippets

### Mutable vs Immutable Objects

**File:** `python/mutable_vs_immutable.py`

This snippet demonstrates:
- How mutable objects (like lists) behave when passed to functions
- How immutable objects (like integers) remain unchanged
- A common Python interview trap

📌 *Interview angle:*  
Why does modifying a list inside a function affect the original list, but not an integer?

---

### Shallow vs Deep Copy

**File:** `python/shallow_vs_deep_copy.py`

This snippet demonstrates:
- The difference between shallow and deep copying
- How nested object references behave
- When to use `copy()` vs `deepcopy()`

📌 *Interview angle:*  
Why does a shallow copy reflect changes made to the original object?

---

## ▶️ Sample Outputs

### Deadlock vs Starvation (Java)

(no output – program hangs indefinitely due to deadlock)

### Singleton Pattern (Java)

true

### Mutable vs Immutable (Python)

List after modification: [1, 2, 3, 100]
Number after modification: 50

### Shallow vs Deep Copy (Python)

Original: [[1, 2, 99], [3, 4]]
Shallow Copy: [[1, 2, 99], [3, 4]]
Deep Copy: [[1, 2], [3, 4]]


---

## 🧠 Explanation of Outputs

### Deadlock vs Starvation (Java)

In the deadlock example, each thread acquires one lock and then waits
indefinitely for another lock held by a different thread.

Since neither thread can proceed, the program hangs without producing output.
This demonstrates a **deadlock**, where progress is impossible due to
circular lock dependency.

---

### Singleton Pattern (Java)

The output `true` confirms that multiple calls to `getInstance()` return the
**same object reference**.

This verifies that:
- Only one instance of the class is created
- The Singleton pattern enforces controlled object creation

---

### Mutable vs Immutable (Python)

The list is modified inside the function and the change persists outside
because lists are **mutable** in Python.

The integer value remains unchanged because integers are **immutable**,
and reassignment creates a new object rather than modifying the original.

---

### Shallow vs Deep Copy (Python)

The shallow copy shares references to nested objects, so modifying the
original nested list also affects the shallow copy.

The deep copy creates fully independent objects, so changes to the original
do not affect it.

---

## 🎯 Learning Outcomes

By maintaining this repository, I aim to:
- Strengthen core CS fundamentals
- Improve interview explanations using real code behavior
- Build consistency through small, high-quality updates
- Develop confidence in explaining *why* code behaves the way it does

---

## 🚀 Future Additions

Planned snippets include:
- Default Mutable Arguments (Python)
- Thread Safety Basics (Java)
- Race Conditions and Synchronization
- Concurrency and Memory Visibility concepts

Each addition will follow the **one-concept-per-file** approach.

---

## ⚠️ Note

This repository is intentionally kept minimal.
The focus is on **understanding and interview readiness**, not on building
full-scale applications or libraries.



