# Letter Finding Game

A simple **Java console-based game** that works with an `ArrayList<String>` and demonstrates basic programming concepts such as loops, conditionals, collections, and user interaction.

---

## 🎯 Project Description
The program starts with an `ArrayList` containing **4 random letters** (from `a` to `z`).  
The user is then asked to **enter 4 letters one by one**:

- If the entered letter **already exists** in the list, the program replaces it with `"found"`.
- If the entered letter **does not exist** in the list, it is added to the list.

At the end, the **final updated list** is displayed.

---

## 🛠️ Features
- Random letter generation (`a-z`).
- Works with **ArrayList** for storing and updating data.
- Accepts user input via `Scanner`.
- Demonstrates **replace** and **append** operations in collections.
- Provides real-time feedback after each user entry.

---

## 📌 Example Run
Initial list: [a, k, m, t]

Enter letter 1: k
Letter found! List updated.
Current list: [a, found, m, t]

Enter letter 2: x
Letter not in list, added.
Current list: [a, found, m, t, x]

Enter letter 3: m
Letter found! List updated.
Current list: [a, found, found, t, x]

Enter letter 4: z
Letter not in list, added.
Current list: [a, found, found, t, x, z]

Final list: [a, found, found, t, x, z]

---

## 📚 Concepts Covered
- **Collections**: Using `ArrayList<String>` to store and manage elements.
- **Random Generation**: Selecting random letters (`Random` class).
- **Loops & Conditionals**: Handling repetitive user input and decision-making.
- **Console I/O**: `Scanner` for reading user input and `System.out` for output.
- **Replace vs. Append** operations in lists.

---

## 🚀 How to Run
1. Clone or download the project.
2. Open it in any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or use the terminal.
3. Compile and run the program:
   ```bash
   javac LetterFindingGame.java
   java LetterFindingGame Author
   
   
---

## 🧑‍💻 Author

Developed as a Java practice project to improve understanding of:
	•	ArrayLists
	•	User input handling
	•	Basic game logic in console applications
