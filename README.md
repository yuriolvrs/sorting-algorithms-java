# Sorting Algorithms Analysis (Java)

## Overview
A terminal-based Java application designed to sort large datasets of unique ID numbers and associated names.  
The project implements multiple sorting strategies to compare their empirical performance against theoretical expectations.  
It emphasizes algorithmic efficiency, modular design, and rigorous benchmarking using real-world data structures.

## Features
- **Multiple Sorting Implementations:** Includes Insertion Sort, Selection Sort, Merge Sort, and an additional implementation of Counting Sort.  
- **Data Integrity:** Ensures that names remain correctly associated with their unique ID numbers after sorting operations.  
- **Empirical Benchmarking:** Measures execution time in milliseconds using `System.currentTimeMillis()` and tracks the exact number of steps (frequency count) for each algorithm.  
- **Robust File Handling:** Automatically parses datasets where the first line indicates the number of records, followed by ID-name pairs.  
- **High-Volume Data Support:** Designed to handle ID numbers ranging from 1 to 10,000,000.  

## Implemented Algorithms
- **Insertion Sort:** Iteratively builds a sorted portion of the array.  
- **Selection Sort:** Repeatedly finds the minimum element from the unsorted part.  
- **Merge Sort:** A divide-and-conquer approach that recursively splits and merges the array.  
- **Counting Sort (Bonus):** A non-comparative sorting algorithm that utilizes a frequency array for linear-time performance on specific integer ranges.  

## Technical Specifications
- **Language:** Java  
- **Platform:** Terminal / Command Line  

**Core Components:**  
- `Record.java` – Immutable data class representing a person.  
- `FileReader.java` – Helper class for processing `.txt` data files.  
- `SortingAlgorithms.java` – Implementation hub for all sorting logic.  
- `Main.java` – The entry point for running benchmarks and experiments.  

## Project Context
This project was developed as part of **CCDSALG – Data Structures and Algorithms** at De La Salle University.  
It serves as a Major Course Output (MCO1) for evaluating sorting efficiency.

Strict constraints were followed, including:  
- No modification of the provided `Record.java` or `FileReader.java` classes.  
- No modification of existing method headers in `SortingAlgorithms.java`.  
- All helper methods must use the `private` access modifier.  
- Each sorting run must use the original, unsorted list to ensure valid benchmarking.  

## Design Highlights
- **Immutable Record Objects:** The `Record` class uses private fields without setters to prevent accidental data modification during the sorting process.  
- **Modular Sorting:** All algorithms are encapsulated within a single class, allowing for easy comparative analysis.  
- **Manual Step Counting:** Logic is included to track "steps" for empirical frequency analysis to compare against O(n²) or O(n log n) complexities.  
- **Dynamic Array Management:** The `FileReader` dynamically initializes arrays based on the record count provided at the top of each data file.  
