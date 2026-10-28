# Android Application - UI & Navigation Flow (Assignment 2)

## 📌 Project Overview
This project is an Android application developed in Java and XML. It demonstrates core Android UI concepts, including multiple layout managers, user authentication flow (simulated), input validation, theming, and explicit Intents for screen navigation.

## 🚀 Project Navigation Flow

The application follows a standard, user-friendly authentication and dashboard navigation flow:

1. **Login Screen (`MainActivity`)** 
   - **Entry Point:** The app opens directly to the Login screen.
   - **Flows:**
     - Enter valid credentials ➡️ Navigates to **Dashboard**.
     - Click "Register here" ➡️ Navigates to **Registration Screen**.
     - Click "Forgot Password" ➡️ Initiates **Password Recovery** (Simulated).

2. **Registration Screen (`RegisterActivity`)**
   - User inputs Name, Email, Password, and Confirm Password.
   - **Flows:**
     - Successful validation (passwords match, no empty fields) ➡️ Returns to **Login Screen**.

3. **Dashboard Screen (`DashboardActivity`)**
   - Displays a grid of modules (e.g., Profile, Settings) using interactive Cards.
   - **Flows:**
     - Click on "Profile" Card ➡️ Navigates to **User Profile Screen**.

4. **User Profile Screen (`ProfileActivity`)**
   - Displays user information (Profile Picture, Name, Email).
   - **Flows:**
     - Click "Logout" button ➡️ Clears session and returns to **Login Screen**.

---

## 🛠️ Implemented Features & Requirements Met

*   **UI Layouts Utilized:**
    *   `ConstraintLayout`: Used in the Login & Registration screens for responsive input fields.
    *   `GridLayout`: Used in the Dashboard to display application modules in a clean 2-column grid.
    *   `LinearLayout`: Used in the Profile screen to stack elements vertically.
*   **Input Validation:** Email format checking and password length/matching validation implemented using Java.
*   **Intents:** `Explicit Intents` are used seamlessly to transition between all activities.
*   **Theming:** Supports both **Day (Default)** and **Night Mode** colors utilizing Android's alternative resources (`res/values-night/colors.xml`).
*   **String Resources:** All hardcoded text is extracted to `res/values/strings.xml` for best practices.

## 📱 Screenshots
*(Note: You can replace these placeholder links with actual images by dragging and dropping your screenshots into the GitHub web interface when editing the README)*

| Login Screen | Dashboard Screen | Profile Screen |
| :---: | :---: | :---: |
| [Login Screenshot] | [Dashboard Screenshot] | [Profile Screenshot] |

## 💻 How to Run This Project
1. Clone the repository:
   ```bash
   git clone [https://github.com/YourUsername/Your-Repository-Name.git](https://github.com/YourUsername/Your-Repository-Name.git)
