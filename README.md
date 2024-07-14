# MyRecipeApp

MyRecipeApp is a simple and elegant recipe application built using Kotlin and Jetpack Compose. This app fetches and displays recipe categories from TheMealDB API. The current version of the app focuses on displaying recipe categories, and future updates will expand its features to make it a comprehensive recipe app.


## Technologies Used

- **Kotlin:** Programming language used for app development.
- **Jetpack Compose:** Modern toolkit for building native Android UI.
- **Retrofit:** Type-safe HTTP client for making API calls.
- **Coil:** Image loading library for Android backed by Kotlin Coroutines.
- **TheMealDB API:** Open, crowd-sourced database of recipes from around the world.


## Features

- **Fetch Recipe Categories:** The app fetches recipe categories from TheMealDB API and displays them in a grid layout.
- **Loading Indicator:** A loading indicator is shown while fetching data from the API.
- **Error Handling:** Displays an error message if there is an issue fetching the data.
- **Lazy Loading:** Uses Jetpack Compose's `LazyVerticalGrid` to display categories in a grid layout.
- **Image Loading:** Uses Coil for loading images asynchronously.
- **Navigation:** Navigate between the main recipe screen and detailed recipe screen.

## Screenshots


_On opening the app, the main screen displays a grid of recipe categories fetched from TheMealDB API._


_Each category is displayed with an image and the category name._

## Code Overview

- **MainActivity.kt**
  - The entry point of the app which sets up the UI using Jetpack Compose.

- **ApiService.kt**
  - Defines the Retrofit API service for fetching recipe categories.

- **RecipeScreen.kt**
  - Contains composable functions for displaying the recipe categories and handling different states (loading, error, success).

- **MainViewModel.kt**
  - ViewModel that manages the app's data and handles API calls.
- **RecipeApp.kt**
  - It contains the logic of navigation between recipe screen and details screen , passing data from one to another.

## Future Plans

- **Recipe Details:** Display detailed recipes when a category is selected.
- **Search Functionality:** Add a search bar to find recipes by name or ingredient.
- **Favorite Recipes:** Allow users to mark recipes as favorites.
- **User Authentication:** Enable user login and registration for personalized features.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue to improve the app.

---

Feel free to reach out with any questions or feedback!
