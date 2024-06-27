Image Fetcher App

This Android application fetches and displays images from the waifu.pics API. It consists of three tabs: Waifu, Neko, and Shinobu. Each tab fetches and displays images from its respective API endpoint.
The images are displayed in a RecyclerView and can be refreshed by clicking the refresh button.


Setup Instructions
To build and run the application locally, follow these steps:

Clone the repository from GitHub:
Open the project in Android Studio.
Build the project using the Gradle build tool.
Connect an Android device or start an emulator.
Run the application on the device/emulator.



Features
Fetches images from three different API endpoints.
Displays images in a RecyclerView.
Refresh button to fetch new images.
Uses Retrofit for API calls.
Uses Glide for image loading.

Project Structure
MainActivity.kt: Sets up the ViewPager2 and TabLayout.
ViewPagerAdapter.kt: Adapter for managing fragments in the ViewPager2.
ImageAdapter.kt: Adapter for the RecyclerView to display images.
ApiService.kt: Retrofit service interface for API calls.
ApiClient.kt: Retrofit client for creating API service instance.
ImageResponse.kt: Data model for the API response.
WaifuFragment.kt, NekoFragment.kt, ShinobuFragment.kt: Fragments for each tab.
activity_main.xml: Layout for the main activity.
fragment_waifu.xml, fragment_neko.xml, fragment_shinobu.xml: Layouts for each fragment.
item_image.xml: Layout for each item in the RecyclerView

Dependencies
Retrofit: Type-safe HTTP client for Android and Java.
Gson: A Java serialization/deserialization library to convert Java Objects into JSON and back.
Glide: An image loading and caching library for Android.
Material Components: Modular and customizable Material Design UI components for Android.


Usage
Start the app: The app will open with three tabs: Waifu, Neko, and Shinobu.
Navigate between tabs: Swipe left or right to switch between tabs.
Refresh images: Click the "Refresh" button to fetch new images for the respective tab.


