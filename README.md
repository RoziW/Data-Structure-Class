# 📚 Data Structure Class

![Language](https://img.shields.io/badge/Language-C++-00599C?style=for-the-badge&logo=c%2B%2B)
![Status](https://img.shields.io/badge/Status-Educational-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

A comprehensive collection of fundamental data structures and algorithms, implemented with a focus on memory management, efficiency, and clean code principles.

---

## 🧩 Project Breakdown
**What is this exactly? (ELI5 version)**

Imagine you are organizing a messy room. You could throw everything into one big pile (messy), or you could use specific boxes for specific items—one for clothes, one for books, and one for toys. 

In programming, **Data Structures** are those specific boxes. 
* This project builds those "boxes" from scratch to understand exactly how they work.
* We aren't just *using* the tools; we are **building the tools**. 
* Whether it's a **Linked List** (a treasure hunt where one clue leads to the next) or a **Stack** (like a stack of pancakes—you only eat the top one first), this code handles data efficiently so programs run faster and smoother.

---

## 🛠️ Technical Specs

This project is built with performance and strict typing in mind.

* **Core Language:** `C++ 20` (utilized for manual memory management and pointer manipulation).
* **Build System:** `g++` (GNU Compiler Collection) for compilation.
* **Debugger:** `GDB` (for stepping through logic and catching segmentation faults).
* **Version Control:** `Git` (for tracking iterative improvements).

**Why C++?**
Unlike higher-level languages that handle memory automatically, C++ forces us to manually allocate and deallocate memory. This provides a deeper understanding of how the computer's RAM actually handles the data we create.

---

## 📂 Project Structure

A clean, modular architecture separating interface from implementation.

```text
Data-Structure-Class/
├── 📁 include/           # Header files (.h) - The "Blueprints"
│   ├── Node.h
│   ├── LinkedList.h
│   ├── Stack.h
│   └── Queue.h
├── 📁 src/               # Source files (.cpp) - The "Machinery"
│   ├── LinkedList.cpp
│   ├── Stack.cpp
│   └── Queue.cpp
├── 📄 main.cpp           # The Entry Point - Runs the tests/demonstrations
├── 📄 .gitignore         # Ignores build artifacts (.exe, .o)
└── 📄 README.md          # Documentation
