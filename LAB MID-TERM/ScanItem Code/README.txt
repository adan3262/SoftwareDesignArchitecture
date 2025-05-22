# 🛍️ Shopping Assistance – SDA Mid Lab

This is a simple Java-based shopping assistance app using Swing GUI and basic object-oriented principles. It allows users to scan an item (by name) and view its details along with prices from nearby stores.

---

## 📂 Project Structure

- `Item.java` – Model class for item details.
- `Price.java` – Model class for store prices.
- `ItemService.java` – Provides item data.
- `StoreService.java` – Provides price data from nearby stores.
- `ScanController.java` – Handles logic between UI and services.
- `UserInterface.java` – GUI using Java Swing.

---

## ▶️ How to Run

### Step 1: Compile all the project files

Open terminal in VS Code and run:
Command: -
 javac *.java

### Step 2: Run the User Interface in Terminal:
Command: -
 java UserInterface


**Here is how the Project actually works**

User (GUI clicks button) → UserInterface
   → ScanController receives input (Controller Principle)
      → ItemService gets item details (Information Expert)
      → StoreService gets prices (Information Expert)
   ← Controller returns final info
← UserInterface shows it in GUI




