# Laboratory Seatwork 8
This is Laboratory Seatwork 8 for the course, Software Engineering 2, taken during the Second Semester of Academic Year, 2025-2026, at New Era University.

## Problem Statement
A local restaurant is modernizing its Point-of-Sale (POS) system and needs a backend application to manage its dynamic digital menu. Unlike a simple flat list, this menu is hierarchical.

The menu must support standard individual items (e.g., a "Classic Burger" for ₱250.00). Crucially, it must also support **Menu Categories** that bundle items together. These categories can be straightforward sections (like "Appetizers"), or complex **Combos/Value Meals**.

A "Value Meal Combo," for example, is itself a single menu entry that has a total price, but it contains a Burger, Fries, and a Soda. The structure can be nested arbitrarily deep (e.g., a "Family Bundle" category that contains several "Value Meal Combo" composites).

Your task is to design and implement this system using the **Composite Design Pattern**. Both individual items and nested categories must share a common interface, allowing the POS system to calculate the price of any entry (whether a single soda or a massive family bundle) using the exact same method call.

## Class Diagram
<img width="1135" height="640" alt="image" src="https://github.com/user-attachments/assets/ed6afb16-470d-4c47-bcae-3a1ed264e880" />

