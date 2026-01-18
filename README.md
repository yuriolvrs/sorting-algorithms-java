# Sorting Algorithms Analysis (Java)

## Overview
A terminal-based Java application designed to sort large datasets of unique ID numbers and associated names.  

The project implements multiple sorting strategies to compare their empirical performance (actual execution time and step counts) against theoretical Big-O expectations.  
It emphasizes algorithmic efficiency, modular design, and rigorous benchmarking using structured data.

## Features
- **Multiple Sorting Implementations:** Includes Insertion Sort, Selection Sort, Merge Sort, and an additional implementation of Counting Sort.  
- **Data Integrity:** Uses a `Record` object structure to ensure that names remain correctly associated with their unique ID numbers after sorting.  
- **Empirical Benchmarking:** Measures execution time in milliseconds and tracks the exact number of operations (frequency count) for each algorithm to validate efficiency.  
- **Robust File Handling:** Automatically parses datasets where the first line indicates the total number of records, followed by ID-name pairs.  
- **High-Volume Data Support:** Optimized to handle and sort large-scale datasets, such as those containing up to 1,000,000 records.  

## Implemented Algorithms
- **Insertion Sort:** Iteratively builds a sorted portion of the array by setting a "key" and shifting larger elements to the right.  
- **Selection Sort:** Searches the unsorted portion of the array for the minimum element and swaps it into its correct position.  
- **Merge Sort:** A divide-and-conquer approach that recursively splits the array into subarrays until they reach a size of 1, then merges them back in sorted order.  
- **Counting Sort:** A non-comparative sorting algorithm that utilizes a frequency array to achieve linear-time performance (O(n+k)) for specific integer ranges.  

## Technical Specifications
- **Language:** Java  
- **Platform:** Terminal / Command Line  
- **Core Components:**  
  - `Record.java` – Data class representing a person with an ID number and name.  
  - `FileReader.java` – Helper class for processing `.txt` data files.  
  - `SortingAlgorithms.java` – The central hub containing all sorting logic and benchmarking code.  
  - `Main.java` – The entry point for running experiments and viewing performance results.  

## Project Context
This project was developed as part of **CCDSALG – Data Structures and Algorithms** at De La Salle University.  

It serves as Major Course Output 1 (MCO1) for evaluating sorting efficiency through empirical analysis.

Strict constraints were followed:  
- No modification of the provided `Record.java` or `FileReader.java` classes.  
- No modification of existing method headers in `SortingAlgorithms.java`.  
- All helper methods must use the `private` access modifier.  
- Each sorting run must use the original, unsorted list to ensure valid benchmarking.  

## Design Highlights
- **Frequency Analysis:** Logic is manually inserted into each algorithm to track the number of "steps" (frequency), allowing for a direct comparison between code execution and theoretical complexity.  
- **Complexity Comparison:** The project highlights the performance gap between O(n²) algorithms (Insertion/Selection) and O(nlogn) algorithms (Merge Sort), especially as the dataset size `n` increases.  
- **Memory Management:** For Counting Sort, the implementation accounts for the range of ID numbers to determine the size of the frequency array, balancing speed with memory usage.  
- **Recursive Logic:** Merge Sort utilizes a recursive `mergeSort` function paired with a `merge` helper to handle the splitting and reconstruction of data.  
