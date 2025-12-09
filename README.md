# 📘 Marksheet Generator – Java Console Program

This project is a **Java console-based Marksheet Generator** that allows the user to enter school details, student names, and marks for fixed subjects. It then computes totals, assigns grades, calculates subject statistics, and prints a formatted marksheet table.

This README explains everything: features, requirements, program flow, grading logic, and includes the full source code.

---

## 📌 Features

### ✔️ User Input
The program prompts the user for:
- School name  
- Teacher name  
- Grade/class  
- Year  
- Number of students  
- Each student's name  
- Marks for 6 fixed subjects:
  1. English  
  2. Math  
  3. History  
  4. Geography  
  5. Science  
  6. Programming  

---

### ✔️ Calculations Performed
For each student:
- Total marks across subjects  
- Grade (A–F) based on total score  

For each subject:
- Total marks  
- Average marks  

For the class:
- Grand total of all marks  
- Grade distribution (A, B, C, D, F counts)

---

## 🧮 Grading System

The grades are assigned based on total marks out of **600**:

| Total Marks Range | Grade |
|-------------------|--------|
| ≥ 540             | A |
| ≥ 480             | B |
| ≥ 420             | C |
| ≥ 360             | D |
| < 360             | F |

---

## 🧠 Program Flow

1. Prompt for school and class information  
2. Ask for number of students  
3. Collect student names  
4. Collect 6 marks per student  
5. Compute:
   - Totals  
   - Grades  
   - Subject totals  
   - Subject averages  
6. Format and print the marksheet with:
   - Student rows  
   - Subject totals row  
   - Subject averages row  
   - Grade counts summary  

---

## 🛠️ How to Run

### **1. Compile**
```bash
javac marksheet.java
