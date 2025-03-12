# Information Expert Principle Implementation

## Problem
**Problem: Tracking book availability in a Library System**

In a library system, the `Library` class was initially responsible for checking book availability.  
This violates the Information Expert principle because the `Book` class contains the necessary data.

## Solution
By applying the Information Expert principle, the `Book` class now manages its own availability.

## Structure
- `withoutprinciple/` (Wrong approach: `Library` handles book availability)
- `withprinciple/` (Correct approach: `Book` handles availability)

## Benefits
- Better encapsulation
- Low coupling
- Easier maintenance
