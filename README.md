# ☕ Data Structure Class

![Language](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Educational-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Hello].

A curated collection of fundamental data structures and algorithms, implemented purely in **Java**. This repository serves as a code archive for understanding how computers organize, manage, and store data efficiently.

---

## 🧩 Project Breakdown
**What is this exactly? (ELI5 version)**

Imagine you are running a very busy library.
* If you pile books on the floor randomly, finding one takes forever (this is bad code).
* If you organize them on shelves, sort them by genre, or use a catalog system, you can find any book in seconds.

**This project builds those "shelves" and "catalogs" from scratch.**
Instead of just using Java's built-in tools (like `ArrayList`), I have manually written the logic behind them to understand the *magic* under the hood. It covers:
* **Organizing Data:** How to chain data together (Linked Lists) or stack it up (Stacks).
* **Processing Data:** How to sort messy lists or find a specific item instantly.

---

## 🛠️ Technical Specs

This project is built with **zero external dependencies** to ensure a deep understanding of core concepts.

* **Core Language:** **Java (JDK 8+)**
    * *Why?* Java is the industry standard for object-oriented programming. It handles memory partially for us (Garbage Collection) but strictly enforces types, making it perfect for learning structural logic.
* **Standard Libraries:**
    * `java.util.Scanner`: Used for reading user input from the console.
    * `java.util.Random`: Used to generate test data (random numbers) for sorting algorithms.
    * `java.io`: (If applicable) Used for file handling operations.

---

## 📂 Project Structure

Here is the visual map of the codebase.

```text
Data-Structure-Class/
├── 📁 src/                  # Source code files
│   ├── 📄 Main.java         # The entry point to run and test the code
│   ├── 📄 LinkedList.java   # Custom implementation of a Singly Linked List
│   ├── 📄 Stack.java        # Last-In-First-Out (LIFO) structure
│   ├── 📄 Queue.java        # First-In-First-Out (FIFO) structure
│   └── 📄 TreeNode.java     # Basic components for Binary Trees
├── 📄 .gitignore            # Ignores compiled .class files
└── 📄 README.md             # This documentation file
