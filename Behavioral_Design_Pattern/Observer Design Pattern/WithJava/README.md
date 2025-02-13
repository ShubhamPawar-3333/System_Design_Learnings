# WeatherApp - Observer Pattern Implementation

## Overview

This project demonstrates the **Observer Pattern** using a `WeatherStation` that notifies multiple displays (`PhoneDisplay`, `TVDisplay`) whenever the weather changes.

## Compilation and Execution

### **With Observer Pattern**

To compile and run the `WeatherApp` inside the `WithObserverPattern` package, use:

```sh
javac WithObserverPattern/Observer/*.java WithObserverPattern/Subject/*.java WithObserverPattern/WeatherApp.java && java WithObserverPattern.WeatherApp
```

### **Without Observer Pattern**

To compile and run the `WeatherApp` inside the `WithoutObserverPattern` package, use:

```sh
javac WithoutObserverPattern/*.java && java WithoutObserverPattern.WeatherApp
```

## Folder Structure

```
WeatherAppInJava/
│── WithObserverPattern/
│   ├── Observer/
│   │   ├── Observer.java
│   │   ├── PhoneDisplay.java
│   │   ├── TVDisplay.java
│   ├── Subject/
│   │   ├── Subject.java
│   │   ├── WeatherStation.java
│   ├── WeatherApp.java (Main function)
│
│── WithoutObserverPattern/
│   ├── PhoneDisplay.java
│   ├── TVDisplay.java
│   ├── WeatherApp.java (Main function)
│   ├── WeatherStation.java
│
│── README.md
```

## How It Works

1. The `WeatherStation` (Subject) maintains a list of observers (`PhoneDisplay`, `TVDisplay`).
2. When `setWeather(String weather)` is called, `notifyObservers()` is triggered, updating all observers.
3. Observers automatically display the updated weather.

## Example Output

```
Phone Display: Today's weather is Sunny
TV Display: Today's weather is Sunny
```

## Notes

- Ensure you're in the root directory before running the commands.
- The `WithoutObserverPattern` version does not use observer-subject relationships, requiring manual updates.