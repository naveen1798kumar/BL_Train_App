# 🚆 Train Consist Management App

A console-based Java application that simulates how a railway system manages a train consist (collection of passenger and goods bogies).

This project was developed as part of the BridgeLabz Java RFP to demonstrate Java programming concepts through real-world railway operations.

---

# 📌 Project Objectives

The application demonstrates:

- Passenger bogie management
- Goods bogie management
- Capacity tracking
- Cargo safety validation
- Collection Framework usage
- Stream API
- Exception Handling
- Regular Expressions
- Sorting Algorithms
- Searching Algorithms
- Performance Measurement
- Defensive Programming

---

# 🛠 Technologies Used

- Java 17+
- IntelliJ IDEA
- Git
- GitHub
- Java Collections Framework
- Java Stream API

---

# 📂 Project Structure

```text
TrainConsistManagement
│
├── model
│      Bogie.java
│      PassengerBogie.java
│      GoodsBogie.java
│
├── repository
│      TrainRepository.java
│
├── service
│      TrainService.java
│      PassengerService.java
│      GoodsService.java
│      SearchService.java
│      ReportService.java
│
├── util
│      Validator.java
│      PerformanceUtil.java
│
├── exception
│      InvalidCapacityException.java
│      CargoSafetyException.java
│
└── TrainConsistApp.java
```

---

# ✨ Features

- Initialize Train Consist
- Add Passenger Bogies
- Add Goods Bogies
- Remove Bogies
- Search Bogies
- Capacity Mapping
- Capacity Reporting
- Cargo Validation
- Performance Benchmarking
- Sorting
- Searching
- Exception Handling
- Regex Validation

---

# 📚 Use Cases Implemented

| UC | Description | Java Concepts |
|----|-------------|---------------|
| UC1 | Initialize Train Consist | ArrayList |
| UC2 | Passenger Bogie Operations | ArrayList CRUD |
| UC3 | Unique Bogie IDs | HashSet |
| UC4 | Train Formation | LinkedList |
| UC5 | Preserve Insertion Order | LinkedHashSet |
| UC6 | Bogie Capacity Mapping | HashMap |
| UC7 | Sort Bogies by Capacity | Comparator |
| UC8 | Filter Passenger Bogies | Stream API |
| UC9 | Group Bogies | Collectors.groupingBy() |
| UC10 | Total Seating Capacity | map(), reduce() |
| UC11 | Regex Validation | Pattern, Matcher |
| UC12 | Goods Bogie Safety Check | allMatch() |
| UC13 | Performance Benchmark | System.nanoTime() |
| UC14 | Invalid Capacity Handling | Custom Checked Exception |
| UC15 | Cargo Safety Handling | Runtime Exception, try-catch-finally |
| UC16 | Bubble Sort | Manual Sorting Algorithm |
| UC17 | Arrays.sort() | Built-in Sorting |
| UC18 | Linear Search | Array Traversal |
| UC19 | Binary Search | Divide and Conquer |
| UC20 | Search Validation | IllegalStateException |

---

# 💡 Java Concepts Covered

## Core Java

- Classes & Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Exception Handling

---

## Collections Framework

- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- HashMap

---

## Java Streams

- filter()
- map()
- reduce()
- allMatch()
- groupingBy()

---

## Algorithms

### Sorting

- Bubble Sort
- Arrays.sort()
- Comparator Sorting

### Searching

- Linear Search
- Binary Search

---

## Exception Handling

- Checked Exception
- Runtime Exception
- Custom Exception
- IllegalStateException
- try-catch-finally

---

## Regex

- Pattern
- Matcher
- Input Validation

---

## Performance

- System.nanoTime()

---

# ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/<your-github-username>/BL_Train_App.git
```

### Open

Import the project into IntelliJ IDEA.

### Run

Execute:

```
TrainConsistApp.java
```

---

# 🎯 Learning Outcomes

This project demonstrates practical implementation of:

- Java Collections Framework
- Stream API
- Exception Handling
- Regular Expressions
- Sorting Algorithms
- Searching Algorithms
- Performance Analysis
- Defensive Programming
- Clean Project Structure

---

# 📈 Project Statistics

- **20 Use Cases Completed**
- **15+ Java Concepts**
- **5 Collection Framework Implementations**
- **3 Sorting Techniques**
- **2 Searching Algorithms**
- **2 Custom Exceptions**
- **Java Stream API**
- **Regex Validation**
- **Performance Benchmarking**

---

# 👨‍💻 Author

**Naveen Kumar**

Java Backend Developer

GitHub:
https://github.com/<your-github-username>

---

# ⭐ Repository

If you found this project helpful, consider giving it a ⭐ on GitHub.