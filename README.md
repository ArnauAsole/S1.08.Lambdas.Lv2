# 💡🔠 S1.08.Lambdas.Lv2

## 📂 Java Streams – Filtering, Mapping, Sorting & Functional Interfaces

### 🧾 Exercise Description

This project focuses on using **Java 8+ Streams**, Lambdas, and Functional Interfaces to manipulate collections. You'll work with:

- Filtering strings
- Formatting numeric values
- Creating custom functional interfaces with lambdas
- Applying complex sorting and transformation rules on mixed-type lists

---

### ✅ Requirements

#### Level 1 Exercises

**Exercise 1**  
Create a list of names (strings). Write a method that returns a new list containing only the names that:

- Start with the uppercase letter 'A'
- Are exactly 3 letters long

Print the result.

---

**Exercise 2**  
Write a method that takes a list of integers and returns a single comma-separated string. Each element must be prefixed with:

- `'e'` if the number is even  
- `'o'` if the number is odd  

**Example input:**  
`(3, 55, 44)` → **Output:** `"o3, o55, e44"`

Print the result.

---

**Exercise 3**  
Create a **Functional Interface** with a method named `operacio()` that returns a `float`. Use a lambda to implement this method for four mathematical operations:

- Addition
- Subtraction
- Multiplication
- Division

Call each implementation and print the result.

---

**Exercise 4**  
Create a list containing both strings with text and numbers stored as strings. Perform the following:

1. Sort alphabetically based on the first character using `charAt(0)`
2. Sort so that strings containing `'e'` come first (all inline in the lambda)
3. Replace the character `'a'` with `'4'` in all elements
4. Print only those elements that are numeric, even if stored as strings

---

### 🔨 Methods Implemented

```
// Exercise1.java
List filterNames(List names)

// Exercise2.java
String formatNumbers(List numbers)

// Exercise3.java
@FunctionalInterface
interface Operation {
    float operacio();
}

// Exercise4.java
list.sort((a, b) -> Character.compare(a.charAt(0), b.charAt(0)));
list.sort((a, b) -> a.contains("e") ? -1 : 1);
list.replaceAll(s -> s.replace("a", "4"));
list.stream().filter(s -> s.matches("\\d+"));
```

### 💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

No third-party libraries required

### 📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA Community Edition

Git (optional, for version control)

### 🛠️ Installation and Setup
Install Required Tools:

Java JDK 17

IntelliJ IDEA (Community Edition)

Clone the Repository (Optional):


git clone https://github.com/YourUsername/S1.09.JavaStreams.Lv1.git

cd S1.09.JavaStreams.Lv1/

Open the Project in IntelliJ:

Go to File → Open

Select the root folder of the project

### ▶️ Running the Project
To run a specific exercise:

Open the corresponding .java file (e.g., Exercise2.java)

Right-click the file and select Run

The result will be shown in the console.

### 🌐 Deployment
This is a console-based Java project designed for local development and educational use. No deployment is required.

### 🤝 Acknowledgements
Special thanks to the contributors:

Arnau, Adrià, Ignasi, Ana, Alejandro, Marc, Vanina and Albert.
