# **CS Interview Snippets 🧩**

A curated collection of **small, focused Java and Python code snippets** designed for **Computer Science & Software Engineering interview preparation**.

Instead of large projects, this repository emphasizes **clarity, correctness, and conceptual understanding** through minimal yet meaningful implementations.

---

## 📌 Why This Repository?

In technical interviews, candidates are evaluated on:

* Strong **Computer Science fundamentals**
* Ability to explain **program behavior**, not just syntax
* Awareness of **common pitfalls, design patterns, and concurrency issues**
* Understanding of **language internals and memory models**

This repository serves as a **personal interview reference**, containing frequently asked concepts implemented as **clean, runnable, and explainable code snippets**.

---

## 🧠 Key Philosophy

Each snippet in this repository:

* Demonstrates **one interview-relevant concept**
* Uses **minimal and readable code**
* Avoids frameworks and unnecessary boilerplate
* Can be explained **verbally within minutes**

> **One concept → One file → Clear explanation**

---

## ☕ Java Interview Snippets

### 🔹 Singleton Patterns

* Basic Singleton
* Double-Checked Locking Singleton
  **Concepts:** controlled object creation, `volatile`, thread safety
  **Interview focus:** Why Singleton? When is `volatile` required?

---

### 🔹 Concurrency Pitfalls

* Race Condition
* Deadlock vs Starvation
  **Concepts:** shared state, synchronization, circular wait
  **Interview focus:** How concurrency bugs occur and how to prevent them

---

### 🔹 Thread Safety & Memory Visibility

* Thread Safety Basics
* `volatile` keyword
  **Concepts:** Java Memory Model, visibility vs atomicity
  **Interview focus:** Why `volatile` ≠ thread safety

---

### 🔹 Thread Management

* ExecutorService (Thread Pool)
* Immutable Class Design
  **Concepts:** thread pools, immutability, defensive copying
  **Interview focus:** Why immutability simplifies concurrency

---

## 🐍 Python Interview Snippets

### 🔹 Mutability & Object Behavior

* Mutable vs Immutable objects
* Default Mutable Arguments
  **Concepts:** object references, function call behavior
  **Interview focus:** Why state persists unexpectedly

---

### 🔹 Copying & Memory

* Shallow vs Deep Copy
* List vs Tuple performance
  **Concepts:** reference sharing, memory footprint
  **Interview focus:** Performance vs flexibility trade-offs

---

### 🔹 Iteration & Evaluation

* Generator vs List
  **Concepts:** lazy vs eager evaluation
  **Interview focus:** Memory efficiency and scalability

---

### 🔹 Python Internals

* Global Interpreter Lock (GIL)
* Decorators
* Context Managers
  **Concepts:** threading limitations, function wrapping, resource management
  **Interview focus:** How Python works under the hood

---

## 🧠 Learning Outcomes

Through this repository, I aim to:

* Strengthen **core CS fundamentals**
* Improve **interview explanations using real code behavior**
* Develop intuition around **concurrency and memory models**
* Build consistency through **small, high-quality commits**

---

## 🚀 Future Enhancements

Planned additions include:

* Producer–Consumer problem (Java)
* Happens-before relationships (Java Memory Model)
* Python multiprocessing vs threading
* JVM vs Python memory model comparison

All additions will strictly follow the
**one-concept-per-file rule**.

---

## ⚠️ Note

This repository is intentionally **minimal and focused**.
It is meant for **learning, revision, and interview preparation** —
**not** for building production-grade applications.


