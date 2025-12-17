# CS Interview Snippets 🧩

A curated collection of **small, focused Java and Python code snippets**
designed for **Computer Science & Software Engineering interview preparation**.

Instead of large projects, this repository emphasizes **clarity, correctness,
and conceptual understanding** through minimal yet meaningful implementations.

---

## 📌 Why This Repository?

In technical interviews, candidates are evaluated on:
- Core **Computer Science fundamentals**
- Ability to explain **program behavior**, not just syntax
- Awareness of **common pitfalls**, design patterns, and concurrency issues

This repository acts as a **personal interview reference**
containing frequently asked concepts implemented as
**clean, runnable, and explainable code snippets**.

---

## 🧠 Key Philosophy

Each snippet in this repository:
- Demonstrates **one interview-relevant concept**
- Uses **minimal, readable code**
- Avoids frameworks and unnecessary boilerplate
- Can be **explained verbally within minutes**

> One concept → One file → Clear explanation

---

## 🗂️ Repository Structure

cs-interview-snippets/
│
├── java/
│ ├── DeadlockVsStarvation.java
│ ├── RaceConditionDemo.java
│ ├── Singletonexample.java
│ └── ThreadSafetyBasics.java
│
├── python/
│ ├── default_mutable_arguments.py
│ ├── gil_demo.py
│ ├── mutable_vs_immutable.py
│ └── shallow_vs_deep_copy.py
│
└── README.md

yaml
Copy code

---

## ☕ Java Snippets

### 1️⃣ Singleton Pattern

**File:** `java/Singletonexample.java`

Demonstrates:
- Lazy initialization
- Controlled object creation
- Ensuring a single instance across the application

📌 **Interview angle:**  
Why restrict object creation? How does Singleton differ from static classes?

---

### 2️⃣ Deadlock vs Starvation

**File:** `java/DeadlockVsStarvation.java`

Demonstrates:
- Circular lock dependency
- Threads waiting indefinitely
- Difference between deadlock and starvation

📌 **Interview angle:**  
How do deadlocks occur, and how can they be prevented?

---

### 3️⃣ Race Condition

**File:** `java/RaceConditionDemo.java`

Demonstrates:
- Multiple threads accessing shared data
- Inconsistent output due to lack of synchronization

📌 **Interview angle:**  
What is a race condition, and how does synchronization solve it?

---

### 4️⃣ Thread Safety Basics

**File:** `java/ThreadSafetyBasics.java`

Demonstrates:
- Thread-safe vs non-thread-safe behavior
- Use of synchronization mechanisms

📌 **Interview angle:**  
What makes code thread-safe, and why is it important?

---

## 🐍 Python Snippets

### 1️⃣ Mutable vs Immutable Objects

**File:** `python/mutable_vs_immutable.py`

Demonstrates:
- Behavior of mutable objects (lists)
- Behavior of immutable objects (integers, strings)
- A classic Python interview pitfall

📌 **Interview angle:**  
Why do changes to lists persist outside functions but integers do not?

---

### 2️⃣ Shallow vs Deep Copy

**File:** `python/shallow_vs_deep_copy.py`

Demonstrates:
- Reference sharing in shallow copies
- Fully independent objects in deep copies

📌 **Interview angle:**  
Why does modifying a nested object affect a shallow copy?

---

### 3️⃣ Default Mutable Arguments

**File:** `python/default_mutable_arguments.py`

Demonstrates:
- How default mutable arguments retain state across function calls
- Why this behavior is dangerous

📌 **Interview angle:**  
Why should mutable objects not be used as default arguments?

---

### 4️⃣ Global Interpreter Lock (GIL)

**File:** `python/gil_demo.py`

Demonstrates:
- Python’s Global Interpreter Lock
- Why multi-threading doesn’t always mean parallel execution

📌 **Interview angle:**  
What is the GIL, and how does it affect Python multithreading?

---

## ▶️ Sample Outputs

### Singleton Pattern (Java)
true

### Deadlock vs Starvation (Java)
(no output – program hangs due to deadlock)

### Mutable vs Immutable (Python)
List after modification: [1, 2, 3, 100]
Number after modification: 50

### Shallow vs Deep Copy (Python)
Original: [[1, 2, 99], [3, 4]]
Shallow Copy: [[1, 2, 99], [3, 4]]
Deep Copy: [[1, 2], [3, 4]]

---

## 🧠 Learning Outcomes

Through this repository, I aim to:
- Strengthen **core CS fundamentals**
- Improve **interview explanations using real code behavior**
- Practice explaining *why* code behaves the way it does
- Build consistency through **small, high-quality commits**

---

## 🚀 Future Enhancements

Planned additions:
- Memory visibility & `volatile` (Java)
- Producer–Consumer problem
- Python multiprocessing vs threading
- JVM vs Python memory model

All future additions will follow the  
**one-concept-per-file** rule.

---

## ⚠️ Note

This repository is intentionally **minimal and focused**.

It is meant for **learning, revision, and interview preparation** —
not for building production-grade applications.
